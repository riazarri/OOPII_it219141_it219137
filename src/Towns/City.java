package Towns;

import static Towns.OpenData.*;
import static Towns.DistanceCalculator.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//import java.util.ArrayList;
import static Towns.Normalize.*;

public class City {
	private int timestamp;
	private static ArrayList<City> cities = new ArrayList<City>(); //ArrayList of cities
	
	public ArrayList<City> getCity(){
		return cities;
	}
	public ArrayList<City> setCity(){
		return cities;
	}

	//public void add
	
	
	private double[] ArrayVector = new double[10];
	

	public City(double cafe, double sea, double cinema, double stadium, double theater, double mountain,
			double restaurant, double kelvin, double clouds, double coord) {
		this.ArrayVector[0] = cafe;
		this.ArrayVector[1] = sea;
		this.ArrayVector[2] = cinema;
		this.ArrayVector[3] = stadium;
		this.ArrayVector[4] = theater;
		this.ArrayVector[5] = mountain;
		this.ArrayVector[6] = restaurant;
		this.ArrayVector[7] = kelvin;
		this.ArrayVector[8] = clouds;
		this.ArrayVector[9] = coord;
	}
	
	public static City newCity(String city, String domain) throws IOException {
		
		
		double distance;
		String appid = "f6e09b871118a28d90453e0eaac10096";
		String article;

		double[] count = new double[7];

		double[] array = new double[4];// apothikeyo lat,lon

		
		array = RetrieveData(city, domain, appid);
		article = getArticle(city);

		// perno apostasi
		distance = distance(37.9795, 23.7162, array[0], array[1], "K");

		String[] crit = { "cafe", "sea", "cinema", "stadium ", "theater", "mountain", "restaurant" };

		// crit[0];

		String c = "cafe";
		for (int i = 0; i < 7; i++) {
			
			count[i] = countCriterionfCity(article, crit[i]);
			// System.out.println(count[i]);
		}

		
		double x = normalizedGeodesicDis(distance);
		double y = normalizedTemp(array[3]);
		double z = array[2] / 100;

		City Obj = new City(count[0], count[1], count[2], count[3], count[4], count[5], count[6], y, z, x);

		return  Obj;
	}

	// h countCriterionfCity psaxnei sto article ti leksi poy psaxnoyme, sthn timh
	// count kratame to
	// poses fores brethike kai me thn if sth synexei athn metatrepoyme se vector

	public static double countCriterionfCity(String cityArticle, String criterion) {
		cityArticle = cityArticle.toLowerCase();
		int index = cityArticle.indexOf(criterion);
		int count = 0;
		while (index != -1) {
			count++;
			cityArticle = cityArticle.substring(index + 1);
			index = cityArticle.indexOf(criterion);
		}
		if (count > 10) {
			count = 10;

		}
		// System.out.println(count +" "+criterion);

		return count / 10.0;

	}

	public double[] getcinema() {
		return ArrayVector;
	}

	public double[] getsea() {
		return ArrayVector;
	}


	public double[] getArrayVector() {
		return ArrayVector;
	}

	public void setArrayVector(double[] ArrayVector) {
		this.ArrayVector = ArrayVector;
	}

	
	
}


