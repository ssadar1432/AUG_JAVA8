package A2_Singleton_DesignPattarn_Creation;

public class SingletonPattern {
	
	
	private static  SingletonPattern instance;
	
	private  SingletonPattern() {
		
		
	}
	
	public static SingletonPattern getInstance() {
		
		if(instance==null) {
			instance=new SingletonPattern();
		}
		return instance;
	}
	public Object clone() {
		return this;
	}

	  public void showMessage() {
	        System.out.println("Hello from the Singleton instance!");
	    }
}
