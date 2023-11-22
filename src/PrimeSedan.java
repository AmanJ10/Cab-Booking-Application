class PrimeSedan implements Vehicle {
    private final String model;

    PrimeSedan(String model) {
        this.model = model;
    }

    @Override
    public String getDescription() {
        return "PrimeSedan -: " + model + " - Premium sedan cars.";
    }
}