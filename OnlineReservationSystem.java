import java.util.Scanner;

public class OnlineReservationSystem {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();

        // Adding users to the system
        reservationSystem.addUser(new User("user1", "password1"));
        reservationSystem.addUser(new User("user2", "password2"));

        try (Scanner scanner = new Scanner(System.in)) {
            // Login Form
            System.out.println("Please enter your username:");
            String username = scanner.nextLine();
            System.out.println("Please enter your password:");
            String password = scanner.nextLine();

            if (reservationSystem.validateUser(username, password)) {
                System.out.println("Login successful!");

                // Reservation Form
                System.out.println("Please enter your PNR number:");
                String pnrNumber = scanner.nextLine();
                System.out.println("Please enter your passenger name:");
                String passengerName = scanner.nextLine();
                System.out.println("Please enter the train number:");
                String trainNumber = scanner.nextLine();
                System.out.println("Please enter the train name:");
                String trainName = scanner.nextLine();
                System.out.println("Please enter the class type:");
                String classType = scanner.nextLine();
                System.out.println("Please enter the journey date:");
                String journeyDate = scanner.nextLine();
                System.out.println("Please enter the from place:");
                String fromPlace = scanner.nextLine();
                System.out.println("Please enter the to place:");
                String toPlace = scanner.nextLine();

                Reservation reservation = new Reservation(pnrNumber, passengerName, trainNumber, trainName,
                        classType, journeyDate, fromPlace, toPlace);
                reservationSystem.makeReservation(reservation);

                // Cancellation Form
                System.out.println("Please enter your PNR number for cancellation:");
                String cancelPnrNumber = scanner.nextLine();
                reservationSystem.displayReservationDetails(cancelPnrNumber);
                System.out.println("Press 'OK' to confirm cancellation:");
                String confirmation = scanner.nextLine();
                if (confirmation.equalsIgnoreCase("OK")) {
                    reservationSystem.cancelReservation(cancelPnrNumber);
                }
            } else {
                System.out.println("Invalid username or password. Login failed!");
            }
        }
    }
}
