package Towns;

import java.io.IOException;
import java.net.URL;
import com.fasterxml.jackson.databind.ObjectMapper;
import weather.OpenWeatherMap;
import wikipedia.MediaWiki;

public class OpenData {

	/**
	 * Retrieves weather information, geotag (lan, lon) and a Wikipedia article for
	 * a given city.
	 * 
	 * @param city    The Wikipedia article and OpenWeatherMap city.
	 * @param country The country initials (i.e. gr, it, de).
	 * @param appid   Your API key of the OpenWeatherMap.
	 */
	public static double[] RetrieveData(String city, String country, String appid) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		OpenWeatherMap weather_obj = mapper.readValue(new URL(
				"http://api.openweathermap.org/data/2.5/weather?q=" + city + "," + country + "&APPID=" + appid + ""),
				OpenWeatherMap.class);
		double[] array = new double[4];
		
		array[0] = weather_obj.getCoord().getLat();
		array[1] = weather_obj.getCoord().getLon();
		array[2] = weather_obj.getClouds().getAll();
		array[3] = weather_obj.getMain().getTemp();

		System.out.println(array[2]);
		// System.out.println(city+" temperature: " +
		// (weather_obj.getMain()).getTemp());
		// System.out.println(city+" lat: " + weather_obj.getCoord().getLat()+" lon: " +
		// weather_obj.getCoord().getLon());
		// System.out.println(city+" Wikipedia article:
		// "+mediaWiki_obj.getQuery().getPages().get(0).getExtract());
		return array;
	}


	public static String getArticle(String city) throws IOException {
		String article;
		ObjectMapper mapper = new ObjectMapper();

		MediaWiki mediaWiki_obj = mapper
				.readValue(new URL("https://en.wikipedia.org/w/api.php?action=query&prop=extracts&titles=" + city
						+ "&format=json&formatversion=2"), MediaWiki.class);

		article = mediaWiki_obj.getQuery().getPages().get(0).getExtract();
		return article;
	}

}