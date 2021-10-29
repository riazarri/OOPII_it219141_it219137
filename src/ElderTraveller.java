
public class ElderTraveller extends Traveller {

	public int ElderAge;	
//age 60-115

	
	@Override
	double calculate_similarity(City obj) {
		double s = 0;
		for(int i=0 ; i<10 ; i++) {
			s = s + Math.pow(obj.getTerm(i) - getTerm(i),2);
		}
		return 1/(1+Math.sqrt(s));
	}

}
