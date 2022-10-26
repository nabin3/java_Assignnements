	// Watts = (amps) x (volts), Kilowatt-hours = (watts) x (usage) / 1000., Cost = (kilowatt-hours) x (electricity rate)

import java.util.Scanner;

public class Elec2Cal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter amps and volts of electric device");
		float amps = in.nextFloat();
		float volts = in.nextFloat();
		double w = amps * volts;
		System.out.println("Enter usage time in hours");
		float h = in.nextFloat();
		double kh = (w * h) / 1000;
		System.out.println("So your device cosumes " + kh + " unit electricity for " + h + " hours");
		System.out.println("Enter cost for each unit");
		float price = in.nextFloat();
		double totalPrice = kh * price;
		System.out.println("Electricity bill is = " + totalPrice);
	}
}
