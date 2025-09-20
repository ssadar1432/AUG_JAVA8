package A1_FactoryWithOut_DesignPattarn_Creation;

public class Driver {

	public static void main(String[] args) {
		
		
		Client client=new Client(2);
		
		Vehicle vh=client.getVehicle();
		
		if(vh!=null) {
			vh.printVehicle();
		}
	}
}
