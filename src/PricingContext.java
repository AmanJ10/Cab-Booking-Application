public class PricingContext {
    private PricingStratergy pricingStratergy;

    public void setPricingStrategy(PricingStratergy pricingStratergy)
    {
        this.pricingStratergy = pricingStratergy;
    }

    public void executePricing()
    {
        if(pricingStratergy != null)
        {
            pricingStratergy.applyPricing();
        }
        else{
            System.out.println("No Pricing Strategy set");
        }
    }
}
