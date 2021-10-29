
public class MiddleTraveller extends Traveller {

	public int MiddleAge;	
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
	}

}
