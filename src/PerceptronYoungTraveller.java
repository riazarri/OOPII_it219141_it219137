import java.util.Vector;

//import java.util.Vector;

public class PerceptronYoungTraveller implements PerceptronTraveller{
	//age 16-25
	private int age;


	//orizo hardcoded ta dianismata weights kai 1 bias
	public PerceptronYoungTraveller(int age) {
		this.setAge(age);
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	
}
	


















































/*public int YoungAge;


@Override
double calculate_similarity(City obj) {
	


	double sum_interseption=0 , sum_union=0; 
	
	for(int i=0 ; i<10 ; i++) {
		if(obj.getTerm(i)>1 && getTerm(i)>1) {
			sum_interseption +=1;
		}
		if(obj.getTerm(i)>1 || getTerm(i)>1) {
			sum_union +=1;
		}
	}
	
	if(sum_union == 0) {
		return 0;
	}
	
	return sum_interseption/sum_union;
}*/