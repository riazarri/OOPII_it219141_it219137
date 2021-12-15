package Towns;

import java.util.ArrayList;

public class PerceptronYoungTraveller implements PerceptronTraveller {
	// age 16-25
	private int age;
	
	public PerceptronYoungTraveller() {
		super();
		
	}

	public PerceptronYoungTraveller(int age) {
		age=20;
		this.setAge(20);

	}

	int array_vector[] = { 1, 1, 1, 1, -1, -1, 1, 1 };// 10 features + bias =1

	
	
	public static boolean recommend() {
		//if true
	
		if {
			return ArrayList.toLowerCase();
			else {
				//if false
			}
		return ArrayList.toUpperCase();
		} 
	}		
		
		
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
