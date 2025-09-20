package A1_Factory_DesignPattarn_Creation;

public class FourWheelerFactory implements VehicleFactory{

	@Override
	public Vehicle CreateVehicle() {
		
		return new FourWheeler();
	}

}
