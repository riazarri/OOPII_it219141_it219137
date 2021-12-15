package Towns;

public class PerceptronElderTraveller implements PerceptronTraveller {
	// age 60-115
	private int age;

	public PerceptronElderTraveller() {
		super();

	}

	public PerceptronElderTraveller(int age) {
		this.setAge(age);

	}

	double array_vector[] = { 1, 1, 0, 0, 1, 1, 1, 0.23, 0.33, 0.11, 0 };// 10 features (+) bias=0
	
	public static boolean recommend() {
		return false;

	}

	public double[] getArray_vector() {
		return array_vector;
	}

	public void setArray_vector(double[] array_vector) {
		this.array_vector = array_vector;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

}
