package A1_Factory_DesignPattarn_Creation;

public class Client {

	private Vehicle vh;
	
	
	public Client(VehicleFactory factory) {
		vh=factory.CreateVehicle();
	}
	
	public Vehicle getVehicle() {
		return vh;
	}
}

