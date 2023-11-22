public class PrimeSedanFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle(String model) {
        return new PrimeSedan(model);
    }

    @Override
    public FeaturesStratergy createfeatures() {
        return new wifiandACStratergy();
    }
}
