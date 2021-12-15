package Towns;

public class PerceptronMiddleTraveller implements PerceptronTraveller {
	// age 25-60
	private int age;

	public PerceptronMiddleTraveller(int age) {
		this.setAge(age);

	}

	public PerceptronMiddleTraveller() {
		super();
	}

	double array_vector[] = { 1, 1, 1, 0, 1, 1, 1, 0.88, 0.70, 0.45, 1 };// 10 features (+) bias =1

	public double[] getArray_vector() {
		return array_vector;
	}

	public void setArray_vector(double[] array_vector) {
		this.array_vector = array_vector;
	}
    
	public static boolean recommend() {
		return false;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
