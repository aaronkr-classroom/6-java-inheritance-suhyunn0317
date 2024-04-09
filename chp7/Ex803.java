
public class Ex803 {

	public static void main(String[] args) {
		Car sf = new Car();
		EvCar x = new EvCar();
		
		sf.printDetails();
		for(int i = 0; i < 10; i++) {
			
		sf.drive();
	}
	System.out.println("You have " + x.getCharge() + "% battery left.");
	System.out.println("You drove " + x.getKm() + "km.");
 	
		x.printDetails();
		for (int i = 0; i < 10; i++) {
			if (x.getCharge() <= 10) {
				x.charge();
			}
			x.drive();
		}
		System.out.println("You used " + x.getTank() + "L of oil left.");
		System.out.println("You have " + x.getCharge() + "% battery left.");
		System.out.println("You drove " + x.getKm() + "km.");
	}

}
