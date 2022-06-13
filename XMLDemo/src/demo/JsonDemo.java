package demo;

import org.json.simple.JSONObject;



public class JsonDemo {
	public static void main(String[] args) {
		JSONObject jo = new JSONObject();
		
		jo.put("name", "duongthilien");
		jo.put("password", "lien2010");
		System.out.println(jo);
		System.out.println("Name : "+ jo.get("name"));
		System.out.print("Password : " + jo.get("password"));
	}
}