public class PerceptronElderTraveller implements PerceptronTraveller{
	private int age;

	//age 60-115
	public  PerceptronElderTraveller(int age) {
		this.setAge(age);
		
	//orizo hardcoded ta dianismata weights kai 1 bias

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
