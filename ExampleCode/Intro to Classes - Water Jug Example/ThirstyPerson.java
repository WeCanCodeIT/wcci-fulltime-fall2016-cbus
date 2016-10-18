package tuesdayClassClasses;

public class ThirstyPerson {

	public static void main(String[] args) {

		H2OJug jedJug = new H2OJug(128);
		
		System.out.println("My name is Jed and I have a jug whose");
		jedJug.displayCurrentVolume();
	
		jedJug.pour(16);
		jedJug.displayCurrentVolume();
		
		jedJug.pour(32);
		jedJug.displayCurrentVolume();
	
		int amountInMyCup = jedJug.pour(100);
		jedJug.displayCurrentVolume();
		
		System.out.println("I have " + amountInMyCup + " in my cup.");
	}

}
