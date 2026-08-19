
public class CinemaShow {

    // Private variables
    private String title;
    private int seatsAvailable;
    private final int capacity;

    // Static variable
    private static int totalBooked = 0;

    // Constructor with title and capacity
    public CinemaShow(String title, int capacity) {
        this.title = title;
        this.capacity = capacity;
        this.seatsAvailable = capacity;
    }

    // Constructor with only title
    public CinemaShow(String title) {
        this(title, 100);
    }

    // Book seats
    public boolean book(int n) {
        if (n <= seatsAvailable) {
            seatsAvailable = seatsAvailable - n;
            totalBooked = totalBooked + n;
            return true;
        } else {
            return false;
        }
    }

    // Cancel seats
    public void cancel(int n) {
        seatsAvailable = seatsAvailable + n;

        // Seats should never be more than capacity
        if (seatsAvailable > capacity) {
            seatsAvailable = capacity;
        }
    }

    // Getter method
    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    // Static getter method
    public static int getTotalBooked() {
        return totalBooked;
    }

    // Main method
    public static void main(String[] args) {

        CinemaShow show = new CinemaShow("Avengers", 50);

        System.out.println("Initial Seats: " + show.getSeatsAvailable());

        // Book 20 seats
        System.out.println("Book 20 Seats: " + show.book(20));
        System.out.println("Seats Available: " + show.getSeatsAvailable());

        // Book 15 seats
        System.out.println("Book 15 Seats: " + show.book(15));
        System.out.println("Seats Available: " + show.getSeatsAvailable());

        // Try to book 20 seats (only 15 available)
        System.out.println("Book 20 Seats: " + show.book(20));
        System.out.println("Seats Available: " + show.getSeatsAvailable());

        // Cancel 10 seats                                                                                                                                                                               
        show.cancel(10);
        System.out.println("After Cancel 10 Seats");
        System.out.println("Seats Available: " + show.getSeatsAvailable());

        // Book 5 seats
        System.out.println("Book 5 Seats: " + show.book(5));
        System.out.println("Seats Available: " + show.getSeatsAvailable());

        // Print total booked seats
        System.out.println("Total Booked Seats: " + CinemaShow.getTotalBooked());
    }
}
