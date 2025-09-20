package A1_Factory_DesignPattarn_Creation;

public class Driaver {
	
	public static void main(String[] args) {
		
		  VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
	        Client twoWheelerClient = new Client(twoWheelerFactory);
	        Vehicle twoWheeler = twoWheelerClient.getVehicle();
	        twoWheeler.printVehicle();
		
	        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
	        Client fourWheelerClient = new Client(fourWheelerFactory);
	        Vehicle Whfoureeler = fourWheelerClient.getVehicle();
	        Whfoureeler.printVehicle();
	        
	        //Added new Requirment No need to change Client implemetation
	        VehicleFactory threeWheelerFactory = new ThreeWheelerFactory();
	        Client ThreeWheelerClient = new Client(threeWheelerFactory);
	        Vehicle threeWheeler = ThreeWheelerClient.getVehicle();
	        threeWheeler.printVehicle();
	}

}
