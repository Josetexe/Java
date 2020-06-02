package paquetejson;

import org.json.JSONArray;
import org.json.JSONObject;

public class ClasePrincipal {

	public static void main(String[] args) {
		String json="{\"coord\":{\"lon\":-3.7,\"lat\":40.42},\"weather\":[{\"id\":803,\"main\":\"Clouds\",\"description\":\"broken clouds\","
				+ "\"icon\":\"04d\"}],\"base\":\"stations\","
				+ "\"main\":{\"temp\":282.28,\"feels_like\":279.43,\"temp_min\":280.93,\"temp_max\":283.71,\"pressure\":1016,"
				+ "\"humidity\":87},\"visibility\":10000,\"wind\":{\"speed\":3.1,\"deg\":20},\"clouds\":{\"all\":75},"
				+ "\"dt\":1585036408,\"sys\":{\"type\":1,\"id\":6443,\"country\":\"ES\",\"sunrise\":1585030263,"
				+ "\"sunset\":1585074644},\"timezone\":3600,\"id\":3117735,\"name\":\"Madrid\",\"cod\":200}";
		JSONObject objeto_json=new JSONObject(json);
		JSONObject objeto_coord=objeto_json.getJSONObject("coord");
		double lon=objeto_coord.getDouble("lon");
		double lat=objeto_coord.getDouble("lat");
		System.out.println("Longitud: "+lon+" Latitud: "+lat);
		JSONArray weather=objeto_json.getJSONArray("weather");
		for(int i=0; i<weather.length(); i++){
			JSONObject objeto_weather=weather.getJSONObject(i);
			String main=objeto_weather.getString("main");
			System.out.println(main);
			String description=objeto_weather.getString("description");
			System.out.println(description);
			String icon=objeto_weather.getString("icon");
			System.out.println(icon);
		}
		double visibility=objeto_coord.getDouble("visibility");
		System.out.println(visibility);
		double id=objeto_coord.getDouble("id");
		System.out.println(id);
		String name=objeto_coord.getString("name");
		System.out.println(name);
	}
}


