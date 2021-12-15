package Towns;

public class Normalize {

	/**
	 * min-max escaler gia temp min(temp)=184 , max(temp)=331
	 * 
	 * 
	 */
	protected static double normalizedTemp(double temp) {

		double min = 184.0;
		double max = 331.0;
		double normalizedScaler;
		// Athens temp=288.35
		normalizedScaler = (temp - min) / (max - min);

		return normalizedScaler;
	}

	// normalized-geodesic_distance(Athens,city)
	protected static double normalizedGeodesicDis(double dis) {
		// theoroume os maxdist thn apostash athina- sidney
		double maxdist = 15325.004318104428, sum;
		// sum = dist/maxdist;
		sum = dis / maxdist; // apostasi Rome
		System.out.println(sum);
		return sum;

	}

}
