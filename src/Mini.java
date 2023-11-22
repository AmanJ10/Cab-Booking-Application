class Mini implements Vehicle {
    private final String model;

    Mini(String model) {
        this.model = model;
    }

    @Override
    public String getDescription() {
        return "Mini -: " + model + " - Comfy, economical cars.";
    }
}