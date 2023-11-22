public class RealSubscriber implements SubscriberAuthentication{
    String username = "Aman";
    String password = "1234";
    @Override
    public boolean authenticate(String name, String password) {
        return username.equals(name) && password.equals(password);
    }
}
