package Towns;

import java.util.ArrayList;

public class PerceptronElderTraveller implements PerceptronTraveller {
	// age 60-115
	private int age;

	
	public PerceptronElderTraveller(int age) {
		this.setAge(age);

	}

	double ArrayVector[] = { 1, 1, 0, 0, 1, 1, 1, 0.23, 0.33, 0.11, 0 };// 10 features (+) bias=0
	
	@Override
	public ArrayList<City> recommend() {
		// TODO Auto-generated method stub
		return null;
	}

	public double[] getArray_vector() {
		return ArrayVector;
	}

	public void setArray_vector(double[] ArrayVector) {
		this.ArrayVector = ArrayVector;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

}
