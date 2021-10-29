import java.util.Vector;

 abstract class Traveller {
	 
	 private Vector<Integer>termsVector = new Vector<Integer>();
	 
	 private Vector<Double>geodesicVector = new Vector<Double>();

	 /*
	  * abstract methodos poy dexetai os eisodo to objCity kai epistrefei to 
	  * bathmo poy tairiazei se h polh sta krithria toy Traveller
	  */
	 abstract double calculate_similarity(City ObjCity);
	 
	 
 
	 public Vector<Integer> getTermsVector() {
		return termsVector;
	}

	public void setTermsVector(Vector<Integer> termsVector) {
		this.termsVector = termsVector;
	}

	public Vector<Double> getGeodesicVector() {
		return geodesicVector;
	}

	public void setGeodesicVector(Vector<Double> geodesicVector) {
		this.geodesicVector = geodesicVector;
	}
	
	public  int getTerm(int term) { 
		 return termsVector.get(term);
		}
	
	
	//COMPARE THE 2 CITIES
	public void compare_cities() {
		
	}
		
	
 }
 


 