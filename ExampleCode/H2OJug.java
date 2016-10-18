package tuesdayClassClasses;

public class H2OJug {

	String material;
	String shape;
	String liquid;
	int volumeCapacity;
	int volumeCurrent;
	int weightEmpty;
	int weightCurrent;

	public H2OJug(int oz) {
		volumeCapacity = oz;
		volumeCurrent = oz;
		displayCurrentVolume();
	}

	public void displayCurrentVolume() {
		System.out.println("current volume is " + volumeCurrent + " of "
				+ volumeCapacity + " max.");
	}

	public int pour(int amountPour) {
		int amountActuallyPoured;
		if (volumeCurrent < amountPour) {
			amountActuallyPoured = volumeCurrent;
			volumeCurrent = 0;
		} else {
			volumeCurrent = volumeCurrent - amountPour;
			amountActuallyPoured = amountPour;
		}
	
		return amountActuallyPoured;
	}
}
