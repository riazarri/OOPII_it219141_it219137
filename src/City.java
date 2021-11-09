import java.io.IOException;
import java.net.URL;
import com.fasterxml.jackson.databind.ObjectMapper;
import weather.OpenWeatherMap;
import wikipedia.MediaWiki;
import java.util.ArrayList;
//import java.util.Vector;


public class City {
	

public City(String city,String country) {
	this.city=city;	
	this.country=country;
	
}


	private String city;
	private int[] terms_vector=new int[10];
	private double[] geodestic_vector=new double[2];
	private String country;


	/** Counts distinct words in the input String.
	@param str The input String. 
	@return An integer, the number of distinct words.
	*/	
	public static int countDistinctWords(String str) {
		String s[]=str.split(" ");
		ArrayList<String> list=new ArrayList<String>();
		
		for (int i = 1; i < s.length; i++) {
		    if (!(list.contains(s[i]))) {
		        list.add(s[i]);
		    }
		}
		return 	list.size();
	}
	/** Counts all words in the input String.
	@param str The input String.
	@return An integer, the number of all words.
	*/	
	public static int countTotalWords(String str) {	
		String s[]=str.split(" ");
		return 	s.length;
	}	

	//public void CityTerms(){
		
		public static void RetrieveData(String city, String country, String appid) throws  IOException {
			 ObjectMapper mapper = new ObjectMapper(); 
			 OpenWeatherMap weather_obj = mapper.readValue(new URL("http://api.openweathermap.org/data/2.5/weather?q="+city+","+country+"&APPID="+appid+""), OpenWeatherMap.class);
			 System.out.println(city+" temperature: " + (weather_obj.getMain()).getTemp());
			 System.out.println(city+" lat: " + weather_obj.getCoord().getLat()+" lon: " + weather_obj.getCoord().getLon());
			 MediaWiki mediaWiki_obj =  mapper.readValue(new URL("https://en.wikipedia.org/w/api.php?action=query&prop=extracts&titles="+city+"&format=json&formatversion=2"),MediaWiki.class);
			 System.out.println(city+" Wikipedia article: "+mediaWiki_obj.getQuery().getPages().get(0).getExtract());	 
		}
		
		/** Counts the number of times a criterion occurs in the city wikipedia article.
		@param cityArticle  The String of the retrieved wikipedia article.
		@param criterion The String of the criterion we are looking for.
		@return An integer, the number of times the criterion-string occurs in the wikipedia article.
		*/	
		public static int countCriterionfCity(String cityArticle, String criterion) {
			cityArticle=cityArticle.toLowerCase();
			int index = cityArticle.indexOf(criterion);
			int count = 0;
			while (index != -1) {
			    count++;
			    cityArticle = cityArticle.substring(index + 1);
			    index = cityArticle.indexOf(criterion);
			}
			return count;
		}
		
		//*****************************************
		//normalized-geodesic_distance(Athens,city)
		
		protected static double normalizedGeodesicDis(double dis) {
			//theoroume os maxdist thn apostash athina- sidney
			double maxdist =15325.004318104428 , sum;
			//sum = dist/maxdist;
			sum = 1051.715047013162/maxdist; //apostasi Rome
		
			return sum;
			
		}
		

	   //*****************************************
		//min-max escaler gia temp min(temp)=184 , max(temp)=331
		
		protected static double normalizedTemp(double temp) {

	        double min = 184.0, max = 331.0, sum;
	        //Athens temp=288.35
	        sum = ( 278.71 - min) / (max - min);

	        return sum;
	    }
		//*****************************************
		 
		
	
		
		//public static void main(String[] args) throws IOException {
		public  void main(String[] args)throws IOException {
			 
			String text="cafe sea cinema stadium theater mountain restaurant kelvin clouds coord";
			System.out.println("The number of distinct words is: "+countDistinctWords(text));
			System.out.println("The number of total words is: "+countTotalWords(text));
			System.out.println(""+countCriterionfCity(text,"cafe"));
			
			String appid ="f6e09b871118a28d90453e0eaac10096";
	
			
			RetrieveData("Rome","it",appid);	
			RetrieveData("Athens","gr",appid);
			RetrieveData("Corfu","gr",appid);	
			RetrieveData("Berlin","de",appid);
			RetrieveData("London","uk",appid);
			RetrieveData("Budapest","hu",appid);
			RetrieveData("France","fr",appid);
			RetrieveData("Croatia","hr",appid);
			RetrieveData("Cairo","eg",appid);
			RetrieveData("Sydney","au",appid);
		/*System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "M") + " Miles\n");
		System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "K") + " Kilometers\n");
		System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "N") + " Nautical Miles\n");
		*/
		}

		

	public int getTerms_vector(int index) {
		return terms_vector[index];
	}

	public void setTerms_vector(int[] terms_vector) {
		this.terms_vector = terms_vector;
	}
	

	public double getGeodestic_vector(int index) {
		
		return geodestic_vector[index];
	}

	public void setGeodestic_vector(double[] geodestic_vector) {
		this.geodestic_vector = geodestic_vector;
	}
	
	
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}	
	


