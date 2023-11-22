public class BookingManager {
    private static BookingManager instance;
    private boolean isCabBooked;
    private BookingManager(){};

    public static BookingManager getInstance(){
        if(instance == null)
                instance = new BookingManager();

        return instance;
    }

    public boolean isCabBooked(){
        return isCabBooked;
    }

    public void setCabBooked(boolean cabBooked) {
        isCabBooked = cabBooked;
    }
}
