import java.io.IOException;
import java.util.*;
//import java.lang.*;
import java.io.*;
public class Geodesic {

	//edo distance static

	private static double distance(double lat1, double lon1, double lat2, double lon2, String unit) {
		if ((lat1 == lat2) && (lon1 == lon2)) {
			return 0;
		}
		else {
			double theta = lon1 - lon2;
			double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
			dist = Math.acos(dist);
			dist = Math.toDegrees(dist);
			dist = dist * 60 * 1.1515;
			if (unit.equals("K")) {
				dist = dist * 1.609344;
			} else if (unit.equals("N")) {
				dist = dist * 0.8684;
			}
			return (dist);
		}
	}
	
//static double normalizedGeodesicDis(double lat, double lon) {//ebaldouble
	static double normalizedGeodesicDis() {//ebaldouble
		//theoroume os maxdist thn apostash athina- sidney
		//Distance Athens to Budapest: 1125.1515790354365 Kilometers     = 0.07
		//Distance Athens to France: 944.016895339175 Kilometers         = 0.06
		//Distance Athens to Rome: 1051.715047013162 Kilometers			 = 0.06
		//Distance Athens to Croatia: 1050.8795097557079 Kilometers      = 0.06
		//Distance Athens to Cairo: 1118.8676933675536 Kilometers        = 0.07
		// Athens to London: 2391.302653287841 Kilometers                = 0.15
		//Distance Athens to Berlin: 1803.7822752520055 Kilometers       = 0.11
		//Distance Athens to Corfu: 377.6727144123143 Kilometers         = 0.02
	

		double maxdist =15325.004318104428 , sum;
		//sum = dist/maxdist;
		//distance();
		//Geodesic t = new Geodesic();
        //t.distance(sum, sum, maxdist, sum, null);
		sum =  distance/maxdist; //apostasi Rome
		
		//sum = distance/maxdist; //apostasi Rome
		System.out.println("To normalizedgeodesicdis gia Athens-City einai: " + sum);
		return sum;
	}
	
	

	public static void main(String[] args)throws IOException {
		float[] cityAthensGR= {37.97f,23.72f};
		float[] citySydneyAU= {-33.86f,151.20f};  //Rome US 34.26 -85.16
		//float[] cityMadridES= {40.42f,-3.7f};
		//System.out.println("Distance Athens to Madrid: "+distance(cityAthensGR[0], cityAthensGR[1], cityMadridES[0], cityMadridES[1], "K") + " Kilometers\n");
	
		//********
		float[] cityBudapestHU= {47.49f,19.03f};
		System.out.println("Distance Athens to Budapest: "+distance(cityAthensGR[0], cityAthensGR[1], cityBudapestHU[0], cityBudapestHU[1], "K") + " Kilometers\n");
		float[] cityFranceFR= {46.0f,20.0f};
		System.out.println("Distance Athens to France: "+distance(cityAthensGR[0], cityAthensGR[1], cityFranceFR[0], cityFranceFR[1], "K") + " Kilometers\n");
		float[] cityRomeIT= {41.89f,12.48f};
		System.out.println("Distance Athens to Rome: "+distance(cityAthensGR[0], cityAthensGR[1], cityRomeIT[0], cityRomeIT[1], "K") + " Kilometers\n");
		float[] cityCroatiaHR= {45.16f,15.5f};
		System.out.println("Distance Athens to Croatia: "+distance(cityAthensGR[0], cityAthensGR[1], cityCroatiaHR[0], cityCroatiaHR[1], "K") + " Kilometers\n");
		float[] cityCairoEG= {30.06f,31.24f};
		System.out.println("Distance Athens to Cairo: "+distance(cityAthensGR[0], cityAthensGR[1], cityCairoEG[0], cityCairoEG[1], "K") + " Kilometers\n");
		float[] cityLondonUK= {51.5f,-0.12f};
		System.out.println("Distance Athens to London: "+distance(cityAthensGR[0], cityAthensGR[1], cityLondonUK[0], cityLondonUK[1], "K") + " Kilometers\n");
		float[] cityBerlinDE= {52.52f,13.41f};
		System.out.println("Distance Athens to Berlin: "+distance(cityAthensGR[0], cityAthensGR[1], cityBerlinDE[0], cityBerlinDE[1], "K") + " Kilometers\n");
		float[] cityCorfuGR= {39.62f,19.91f};
		System.out.println("Distance Athens to Corfu: "+distance(cityAthensGR[0], cityAthensGR[1], cityCorfuGR[0], cityCorfuGR[1], "K") + " Kilometers\n");

		//********
		
		
		//System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "M") + " Miles\n");
		System.out.println("Distance Athens to Sydney(maxdist): "+distance(cityAthensGR[0], cityAthensGR[1], citySydneyAU[0], citySydneyAU[1], "K") + " Kilometers\n");
		//System.out.println("Distance Athens to Budapest: "+distance(cityAthensGR[0], cityAthensGR[1], cityBudapestHU[0], cityBudapestHU[1], "K") + " Kilometers\n");
		
	
		//System.out.println("To normalizedgeodesicdis gia ayth th poli einai: " + sum);
		normalizedGeodesicDis();
	}
	
	
	
	
	
}
