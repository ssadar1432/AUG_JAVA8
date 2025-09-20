package A1_Factory_DesignPattarn_Creation;

public class ThreeWheelerFactory implements VehicleFactory{

	@Override
	public Vehicle CreateVehicle() {
		
		return new ThreeWheeler();
	}

}
