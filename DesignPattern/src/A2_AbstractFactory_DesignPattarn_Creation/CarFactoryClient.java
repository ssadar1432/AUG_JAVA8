package A2_AbstractFactory_DesignPattarn_Creation;

public class CarFactoryClient {

	public static void main(String[] args) {
		
        A3_CarFactory northAmericaFactory = new A4_NorthAmericaCarFactory();
        A1_Car northAmericaCar = northAmericaFactory.createCar();
        A2_CarSpecification northAmericaSpec = northAmericaFactory.createSpecification();

        northAmericaCar.assemble();
        northAmericaSpec.display();
	}
}
