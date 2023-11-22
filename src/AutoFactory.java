public class AutoFactory extends VehicleFactory{

    @Override
    public Vehicle createVehicle(String model) {
        return new Auto(model);
    }

    @Override
    public FeaturesStratergy createfeatures() {
        return new noFeaturesStratergy();
    }
}
