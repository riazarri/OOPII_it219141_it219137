package Towns;

import java.util.ArrayList;

public class PerceptronMiddleTraveller implements PerceptronTraveller {
	// age 25-60
	private int age;

	public PerceptronMiddleTraveller(int age) {
		this.setAge(age);

	}
	
	@Override
	public ArrayList<City> recommend() {
		// TODO Auto-generated method stub
		return null;
	}

	

	double arrayVector[] = { 1, 1, 1, 0, 1, 1, 1, 0.88, 0.70, 0.45, 1 };// 10 features (+) bias =1

	public double[] getArrayVector() {
		return arrayVector;
	}

	public void setArrayVector(double[] ArrayVector) {
		this.arrayVector = ArrayVector;
	}
    
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
