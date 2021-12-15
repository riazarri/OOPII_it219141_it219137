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

	
	List<City> cities = createList();

	public static void main(String[] args) throws IOException {


		private static List<City> createList(){
			
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
		
		Collections.addAll(cities, City.newCity("",""));
		
		/*for (int i=0;i<allDeps.size();i++){
			if (allDeps.get(i).getName().equals(“Physics”)){
			allDeps.remove(i); //και διαγραφή
			break; //σταματώ την επανάληψη
			}
			}*/
		
		
		hashtableCollection();
		  /*for (int i = 0; i < 10; i++) {
			  System.out.println(rome.getcinema()[i]+rome.getsea()[i]+rome.getcinema()[i]
		 );
		  
		 }*/
		 
		 /*
		 * for (int i = 0; i < 10; i++) { System.out.println(cairo.getsea()[i]);
		 * 
		 * }
		 */

		/*
		 * for (int i = 0; i < 10; i++) { System.out.println(cairo.getAll()[i]);
		 * 
		 * }
		 */
		PerceptronTraveller trav;
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
		  }
		  
			   //trav1.setAge(trav1, 20);
		
	  /*List<City> countries = createList();
		  
		    private static List<City> createList(){

		        List<City> cities = new ArrayList<>();

		        cities.add(newCity("Rome", "it"));
		        cities.add(newCity("Moscow", "ru"));
		        cities.add(newCity("Sydney", "au"));
		        cities.add(newCity("Cairo", "eg"));
		        cities.add(newCity("Croatia", "hr"));

		        return cities;
		    }*/
	}
		private static void hashtableCollection() {
			
			    Hashtable<String, String> weekDaysHashTable = new Hashtable<String, String>(); //The collections is an object!
			    
				weekDaysHashTable.put(cities, new String("Monday"));
			    weekDaysHashTable.put(cities, new String("Tuesday"));
			    weekDaysHashTable.put(cities, new String("Wednesday"));
			    weekDaysHashTable.put(cities, new String("Thursday"));
			    weekDaysHashTable.put(cities, new String("Friday"));
			    weekDaysHashTable.put(cities, new String("Saturday"));
			    weekDaysHashTable.put(cities, new String("Sunday"));
			    System.out.println("contents of weekDaysHashTable and time: " + weekDaysHashTable + cities);
		
	 // print out the Day of the Week 
		class GetDayFromDate {
		 
		    
		 
		        Date now = new Date();
		 
		        SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); // the day of the week abbreviated
		        System.out.println(simpleDateformat.format(now));
		 
		        simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
		        System.out.println(simpleDateformat.format(now));
		 
		        Calendar calendar = Calendar.getInstance();
		        calendar.setTime(now);
		        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // the day of the week in numerical format
		
		    
		
	}

		
		
}

/* ArrayList<String> cities = new ArrayList<>();
	cities.add("Rome","it");
cities.add("Berlin","de");

System.out.println("cities in arraylist: "+cities);
*/
	
	

	


