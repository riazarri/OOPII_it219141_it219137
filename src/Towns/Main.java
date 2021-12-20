package Towns;

import java.io.IOException;

import java.lang.NullPointerException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;
//import java.util.ArrayList;
import java.util.List;
public class Main {

	

	//public static Object city;

	public static void main(String[] args) throws IOException {
		ArrayList<City> list =arraylistExamples();
        list.get(0);

		// kalo ti synarthsh newCity
		City rome = City.newCity("Rome", "it");
		City moscow = City.newCity("Moscow", "ru");
		City corfu = City.newCity("Corfu", "gr");
		City berlin = City.newCity("Berlin", "de");
		City london = City.newCity("London", "uk");
		City budapest = City.newCity("Budapest", "hu");
		City france = City.newCity("France", "fr");
		City croatia = City.newCity("Croatia", "hr");
		City cairo = City.newCity("Cairo", "eg");
		City sydney = City.newCity("Sydney", "au");
		
		//Collections.addAll(cities, City.newCity("",""));
		

		  for (int i = 0; i < 10; i++) {
			  System.out.println(rome.getcinema()[i]+rome.getsea()[i]+rome.getcinema()[i]
		 );
		  
		 }
		  ArrayList<City> cityList = new Arraylist<>();
			//create city objects
			cityList.add(new City("Athens", "gr"));
	        cityList.add(new City("Rome","Italy"));
		}
		 
		 /*
		 * for (int i = 0; i < 10; i++) { System.out.println(cairo.getsea()[i]);
		 * 
		 * }
		 */

		
		
		  
		  /*PerceptronTraveller trav;
		trav = new PerceptronYoungTraveller();
		
		  PerceptronTraveller trav = new PerceptronTraveller();
		  PerceptronYoungTraveller  trav1 = new PerceptronYoungTraveller(20);
		  PerceptronMiddleTraveller trav2 = new PerceptronMiddleTraveller(50);
		  PerceptronElderTraveller trav3 = new PerceptronElderTraveller(64);
		  
		  if(age>=16||trav.age<=25) {
			  //trav1.recommend(trav1);
			  PerceptronYoungTraveller.recommend();
		  }else if{(trav.age > 25|| trav.age<= 60){
			  PerceptronMiddleTraveller.recommend();
		  }else if(trav.age > 60 || trav.age <=115) {
			  PerceptronElderTraveller.recommend();
		  }*/
		  
	
	}

		
		



	
	

	


