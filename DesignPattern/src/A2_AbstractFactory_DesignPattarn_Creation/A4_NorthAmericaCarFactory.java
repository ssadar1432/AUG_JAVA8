package A2_AbstractFactory_DesignPattarn_Creation;

public class A4_NorthAmericaCarFactory implements A3_CarFactory{

	
	 public A1_Car createCar() {
	        return new A11_Sedan();
	    }

	public A2_CarSpecification createSpecification() {
		// TODO Auto-generated method stub
		return new A22_NorthAmericaSpecification();
	}

}
