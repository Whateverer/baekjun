package example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSample {
	public List jsonList(String jsonArrayString) {
		
		JSONParser parse = new JSONParser();
		try {
			JSONObject jsonObject = (JSONObject) parse.parse(jsonArrayString);
			JSONArray item = (JSONArray) jsonObject.get("items");
			List<JSONObject> jsonArray = new ArrayList<>();
			
			for(int i=0; i<item.size(); i++) {
				jsonArray.add((JSONObject) item.get(i));
			}
			
			Collections.sort(jsonArray, new Comparator<JSONObject>() {
				@Override
				public int compare(JSONObject o1, JSONObject o2) {
					
					int price1 = Integer.parseInt(String.valueOf(o1.get("price")));
					int price2 = Integer.parseInt(String.valueOf(o2.get("price")));
					return Integer.compare(price1, price2) * -1;
				}
			});
			
			return jsonArray;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		String json = "{\r\n" + 
				"   \"items\": [\r\n" + 
				"     {\r\n" + 
				"       \"label\": \"캐시미어 100% 터틀넥 스웨터\",\r\n" + 
				"       \"price\": 70000\r\n" + 
				"     },\r\n" + 
				"     {\r\n" + 
				"       \"label\": \"반팔 스트라이프 스웨터\",\r\n" + 
				"       \"price\": 30000\r\n" + 
				"     },\r\n" + 
				"     {\r\n" + 
				"       \"label\": \"화이트 스포츠 점퍼\",\r\n" + 
				"       \"price\": 150000\r\n" + 
				"     }\r\n" + 
				"   ]\r\n" + 
				"}";
		
		JsonSample jsonSample = new JsonSample();
		List list = jsonSample.jsonList(json);
		System.out.println(list);
	}
}
