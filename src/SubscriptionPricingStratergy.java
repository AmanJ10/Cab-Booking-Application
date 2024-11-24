public class SubscriptionPricingStratergy implements PricingStratergy{
    @Override
    public void applyPricing() {
        System.out.println("Applying subscription pricing.");
        System.out.println("Extra benefits/discounts applied.");
        System.out.println("10% discount on every ride.");
    }
}
