package Towns;

import java.util.ArrayList;

public class PerceptronYoungTraveller implements PerceptronTraveller {
	// age 16-25
	private int age;
	
	

	public PerceptronYoungTraveller(int age) {
		age=20;
		this.setAge(20);

	}

	double ArrayVector[] = { 1, 1, 1, 1, 0.78, -1, 1.1, 1 };// 10 features + bias =1

	public ArrayList<City> recommend(){
		ArrayList<City> ListOfrecommendCities = new ArrayList<City>();
		for (City city : Main.city) {
			double array_vector[] = city.getArrayVector();
			
		}
	}
	public String[] recommend(Boolean upper){
        String[] cityList= new String[cityList.size()];
        for (int i=0; i<cityList.length; i++){
            if (upper){
            	cityList[i]=cityList.get(i).getCity() + cityList.get(i).getCountry();
            	cityList[i]=cityList[i].toUpperCase();
            }else if (!upper)
            {
            	cityList[i]=cityList.get(i).getCity() + cityList.get(i).getCountry();
            	cityList[i]=cityList[i].toLowerCase();
            }
        }
        return cityList;
    }
	
	/*public ArrayList<City> recommend(boolean trav) {
		ArrayList<City> arrayListOfrecommendCities = recommend();
		if(trav) {
			for(City city : ListOfrecommendCities) {
				cities.setCity(city.getCity().UpperCase());
			
			}else {
				for(City city : ListOfrecommendCities) {
					city.setCity(city.getCity().LowerCase());
				}
			}
		
		return  ListOfrecommendCities;
	}*/		
		
		
	public int[] getArray_vector() {
		return array_vector;
	}

	public void setArray_vector(int[] array_vector) {
		this.array_vector = array_vector;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
