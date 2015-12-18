import java.util.*;

public class ImpedanceCalculator {
	public static void main(String[] args) {

		// Ask for number of speakers and create an array based on the number
		// entered
		System.out
				.println("Please enter the number of speakers being wired together.");
		Scanner totalspkrInput = new Scanner(System.in);
		double spkrsNumber = totalspkrInput.nextDouble();
		double[] spkrImpedances = new double[(int) spkrsNumber];

		// Ask for impedance of each speaker
		System.out
				.println("Please enter the impedance level of each speaker. \n"
						+ "*Note that if entering differing impedance levels, the program will \n"
						+ "automatically use the appropriate calculation.");
		Scanner impedance = new Scanner(System.in);
		for (int i = 0; i < spkrImpedances.length; i++) {
			System.out.print("Speaker #" + (i + 1) + "\t");
			spkrImpedances[i] = impedance.nextInt();
		}

		ImpedanceCalculations wiringSetup = new ImpedanceCalculations(
				spkrImpedances, spkrsNumber);

		// Ask for type of wiring configuration
		System.out
				.println("Please select which wiring configuration your speakers will be in.\n"
						+ "1 - Series\n" + "2 - Parallel");
		Scanner wireConfig = new Scanner(System.in);
		int wireConfigChoice = wireConfig.nextInt();
		double j = 0;
		boolean sameImpedance = true;
		// Based on selection, call the correct Method for the correct equation
		if (wireConfigChoice == 1)
			wiringSetup.seriesImpedance(spkrImpedances);
		else if (wireConfigChoice == 2) {

			int i = 0;
			j = spkrImpedances[i];
			for (i = 1; i < spkrImpedances.length; i++) {
				if (j != spkrImpedances[i - 1]) {
					sameImpedance = false;
					break;
				}
			}
			if (sameImpedance == true)
				wiringSetup.parallelImpedance(spkrImpedances);

			else
				wiringSetup.multIpmedance(spkrImpedances);
		}

	}
}
