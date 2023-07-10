public interface CommonInterface {
    public void normalMethod();

    default void defaultMethod() {
        System.out.println("THis is default method");
    }
}
