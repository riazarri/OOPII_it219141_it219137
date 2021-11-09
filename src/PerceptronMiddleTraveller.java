public class PerceptronMiddleTraveller implements PerceptronTraveller {
//age 25-60
	private int age;

	//Array Vector = {0 , 0, 1}
	//ArrayList
	//orizo hardcoded ta dianismata weights kai 1 bias
	
	public 	PerceptronMiddleTraveller(int age) {
		this.setAge(age);
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
}
	
	
	/*	public int MiddleAge;	
//age 25-60
	@Override
	double calculate_similarity(City obj) {
		double sumA=0,sumB=0,sumC=0;
		
		for(int i=0 ; i<10 ; i++) {
			sumA = sumA + (obj.getTerm(i)*(i));
			sumB = sumB + Math.pow(obj.getTerm(i),2);
			sumC = sumC + Math.pow(getTerm(i), 2);
		}
		
		if(sumB == 0 || sumC == 0) {
			return 0;
		}
		return sumA/(Math.sqrt(sumB)*Math.sqrt(sumC));
	}*/

	
	
	
	
	
//}
