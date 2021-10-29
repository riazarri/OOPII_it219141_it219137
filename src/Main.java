import java.util.ArrayList;

public class Main {






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
	
	public static int countTotalWords(String str) {	
		String s[]=str.split(" ");
		return 	s.length;
	}	

	//metraei ta terms
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
	


	public static void main(String[] args) {

		String text="cafe sea cinema stadium theater mountain restaurant bowling bar museums";
		System.out.println("The number of distinct words is: "+countDistinctWords(text));
		System.out.println("The number of total words is: "+countTotalWords(text));
		System.out.println(""+countCriterionfCity(text,"theater"));
		
		//creating objects of: travellers and cities
		//Cannot instantiate the type… cause Traveller is an abstract class

		
		City Rome = new City("Rome");
		City Athens = new City("Athens");
		City Corfu = new City("Corfu");
		City Berlin = new City("Berlin"); 
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//protimhseis tou traveller
		/*Vector<String> termsVector = new Vector<String>();
		//elements in vector
		termsVector.add("0");
		termsVector.add("9");
		termsVector.add("6");
		termsVector.add("3");
		termsVector.add("2");
		termsVector.add("7");
		termsVector.add("10");
		
		System.out.println("The Vector is: " + termsVector);
		*/
	
	
	
	}

}
