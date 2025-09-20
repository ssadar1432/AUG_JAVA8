package A1_Factory_DesignPattarn_Creation;

public class TwoWheelerFactory implements VehicleFactory {

	@Override
	public Vehicle CreateVehicle() {
		return new TwoWheeler();
		
		
	}

}
