class FactoryCreator {
    public static VehicleFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Auto")) {
            return new AutoFactory();
        } else if (choice.equalsIgnoreCase("Prime Sedan")) {
            return new PrimeSedanFactory();
        } else if (choice.equalsIgnoreCase("Mini")) {
            return new MiniFactory();
        }
        return null;
    }
}