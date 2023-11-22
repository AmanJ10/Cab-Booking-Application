class Auto implements Vehicle {
    private final String type;

    Auto(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return "Auto -: Get " + type + " autos at your doorstep.";
    }
}