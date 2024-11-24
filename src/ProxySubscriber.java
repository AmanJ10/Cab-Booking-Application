public class ProxySubscriber implements SubscriberAuthentication{

    RealSubscriber realSubscriber;
    SubscriptionPricingStratergy subscriptionPricingStratergy;
    RegularPricing regularPricing;
    String name, password;
    public ProxySubscriber(String name , String password)
    {
        this.name = name;
        this.password = password;
        this.realSubscriber = new RealSubscriber();
//        this.subscriptionPricingStratergy = new SubscriptionPricingStratergy();
//        this.regularPricing = new RegularPricing();

    }
//    @Override
//    public void prcing() {
//        if(authenticate(name , password))
//            subscriptionPricingStratergy.prcing();
//        else
//            regularPricing.prcing();
//
//    }

    @Override
    public boolean authenticate(String name, String password) {
        return realSubscriber.authenticate(name , password);
    }
}
