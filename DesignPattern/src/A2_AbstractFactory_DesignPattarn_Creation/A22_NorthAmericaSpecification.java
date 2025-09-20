package A2_AbstractFactory_DesignPattarn_Creation;

public class A22_NorthAmericaSpecification implements A2_CarSpecification {

	@Override
	 public void display() {
        System.out.println("North America Car Specification: Safety features"
        		+ " compliant with local regulations.");
    }

}
