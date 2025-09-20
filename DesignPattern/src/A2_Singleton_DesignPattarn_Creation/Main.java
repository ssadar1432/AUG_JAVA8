package A2_Singleton_DesignPattarn_Creation;

public class Main {
    public static void main(String[] args) {
        SingletonPattern s1 = SingletonPattern.getInstance();
        s1.showMessage(); // Output: Hello from the Singleton instance!

        SingletonPattern s2 = SingletonPattern.getInstance();
        s2.showMessage(); // Output: Hello from the Singleton instance!

       
        // s1 and s2 refer to the same instance
        System.out.println(s1 == s2); // Output: true
    }
}