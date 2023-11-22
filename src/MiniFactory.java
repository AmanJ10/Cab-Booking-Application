class MiniFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle(String model) {
        return new Mini(model);
    }

    @Override
    public FeaturesStratergy createfeatures() {
        return new ACStratergy();
    }
}