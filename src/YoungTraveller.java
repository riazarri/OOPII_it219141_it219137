
public class YoungTraveller extends Traveller{
	
public int YoungAge;
//age 16-25

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
	}
}

