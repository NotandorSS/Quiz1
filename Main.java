// Question #1/#2
package Quiz1;
import java.util.Scanner;

public class Main {
	private static double Input() {
		Scanner scan = new Scanner (System.in);
		return scan.nextInt();
	}
	public static void main(String[] args) {
		System.out.println("TD:");
		double tds = Input();
		System.out.println("Yards:");
		double yards = Input();
		System.out.println("INT:");
		double ints = Input();
		System.out.println("comp:");
		double comps = Input();
		System.out.println("ATT:");
		double atts = Input();
		double passerRating = ((((comps/atts-.3)*5) + ((yards/atts - 3)*.25)
				+ (tds/atts)*20 + (2.375 - (ints*25/atts)))/6)*100;
		System.out.printf("QB rating: " + "%3.1f", passerRating);
	}

}
