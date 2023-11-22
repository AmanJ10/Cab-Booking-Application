import java.util.Scanner;

public class cabBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = sc.next();
        System.out.println("Enter your password:");
        String password = sc.next();

        SubscriberAuthentication subscriberAuthentication = new ProxySubscriber(username,password);

        if(subscriberAuthentication.authenticate(username, password))
        {
            SubscriptionPricingStratergy subscriptionPricingStratergy = new SubscriptionPricingStratergy();
            subscriptionPricingStratergy.prcing();
        }
        else
        {
            RegularPricing regularPricing = new RegularPricing();
            regularPricing.prcing();
        }

        BookingManager bookingManager = BookingManager.getInstance();
        if (bookingManager.isCabBooked()) {
            System.out.println("Sorry, you can book only one cab at a time.");
            System.exit(1);
        }


        System.out.println("Choose a vehicle type:");
        System.out.println("1. Prime Sedan");
        System.out.println("2. Mini");
        System.out.println("3. Auto");

        int choice = sc.nextInt();
        String model = "";

        switch (choice) {
            case 1 -> {
                System.out.println("Choose a Prime Sedan model:");
                System.out.println("1. Tata Indigo");
                System.out.println("2. Toyota Etios");
                int primeSedanChoice = sc.nextInt();
                model = (primeSedanChoice == 1) ? "Tata Indigo" : "Toyota Etios";
            }
            case 2 -> {
                System.out.println("Choose a Mini model:");
                System.out.println("1. Tata Indica Vista");
                System.out.println("2. Ford Figo");
                int miniChoice = sc.nextInt();
                model = (miniChoice == 1) ? "Tata Indica Vista" : "Ford Figo";
            }
            case 3 -> {
                System.out.println("Choose an Auto type:");
                System.out.println("1. Electric");
                System.out.println("2. CNG");
                int autoChoice = sc.nextInt();
                model = (autoChoice == 1) ? "Electric" : "CNG";
            }
            default -> {
                System.out.println("Invalid choice");
                System.exit(1);
            }
        }
        System.out.println("Booking the cab...");


        VehicleFactory vehicleFactory = FactoryCreator.getFactory(getVehicleTypeFromChoice(choice));

        if (vehicleFactory != null) {
            Vehicle v = vehicleFactory.createVehicle(model);
            FeaturesStratergy featuresStratergy = vehicleFactory.createfeatures();
            System.out.println("You chose: " + v.getDescription());
            System.out.println("Features :\n" + featuresStratergy.features());
        } else {
            System.out.println("Invalid vehicle type");
        }

        bookingManager.setCabBooked(true);
        System.out.println("Cab is booked. Enjoy your Journey.");
    }


    private static String getVehicleTypeFromChoice(int choice) {
        return switch (choice) {
            case 1 -> "Prime Sedan";
            case 2 -> "Mini";
            case 3 -> "Auto";
            default -> null;
        };
    }
}
