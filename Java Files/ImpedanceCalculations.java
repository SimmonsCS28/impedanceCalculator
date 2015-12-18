public class ImpedanceCalculations {

	double[] impedanceLevel;
	// Impedance calculator attributes
	public double speakerAmount, finalImpedance;
	public String series, parallel, seriesParallel;

	// constructor
	public ImpedanceCalculations(double[] impLevel, double spkrAmount) {
		impedanceLevel = impLevel;
		speakerAmount = spkrAmount;
	}

	// Setters****************************************************
	public void setimpLevel(double[] newimpLevel) {
		impedanceLevel = newimpLevel;
	}

	public void setspkrAmount(double newspkrAmount) {
		speakerAmount = newspkrAmount;
	}

	// Getters****************************************************
	public double[] getimpLevel() {
		return impedanceLevel;
	}

	public double getspkrAmount() {
		return speakerAmount;
	}

	// Impedance Calculation Methods******************************

	// Series Method
	public double seriesImpedance(double[] impedanceLevel) {
		double serialImpedance = 0;
		for (int i = 0; i < impedanceLevel.length; i++) {
			serialImpedance += impedanceLevel[i];
		}
		System.out.println(serialImpedance);
		return serialImpedance;
	}

	// Parallel Method
	public double parallelImpedance(double[] impedanceLevel) {
		double impedance = 0;
		int j = 0;
		for (int i = 0; i < impedanceLevel.length; i++) {
			impedance += impedanceLevel[i];
			j++;
		}
		double parallelImpedance = impedance / j;
		System.out.println(parallelImpedance);
		return parallelImpedance;
	}

	// Multi-impedance Method
	public double multIpmedance(double[] impedanceLevel) {
		double impedance = 0;

		for (int i = 0; i < impedanceLevel.length; i++) {
			impedance += (1 / impedanceLevel[i]);
		}
		double diffParallelImpedance = 1 / impedance;
		System.out.println(diffParallelImpedance);
		return diffParallelImpedance;

	}

	public void impedanceDisplay() {
		System.out.println(finalImpedance);
	}

}
