public class ReservationSystem {
    private User[] users;
    private Reservation[] reservations;
    private int reservationCount;

    public ReservationSystem() {
        users = new User[100];
        reservations = new Reservation[100];
        reservationCount = 0;
    }

    public void addUser(User user) {
        users[reservationCount] = user;
        reservationCount++;
    }

    public boolean validateUser(String username, String password) {
        for (int i = 0; i < reservationCount; i++) {
            if (users[i].getUsername().equals(username) && users[i].getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public void makeReservation(Reservation reservation) {
        if (reservationCount < reservations.length) {
            reservations[reservationCount] = reservation;
            reservationCount++;
            System.out.println("Reservation made successfully. PNR Number: " + reservation.getPnrNumber());
        } else {
            System.out.println("Maximum reservations reached. Unable to make a reservation.");
        }
    }    
    

    public void cancelReservation(String pnrNumber) {
        for (int i = 0; i < reservationCount; i++) {
            Reservation reservation = reservations[i];
            if (reservation != null && reservation.getPnrNumber().equals(pnrNumber)) {
                System.out.println("Reservation canceled! PNR Number: " + reservation.getPnrNumber());
                reservations[i] = null;
                break;
            }
        }
    }
    

    public void displayReservationDetails(String pnrNumber) {
        for (int i = 0; i < reservationCount; i++) {
            Reservation reservation = reservations[i];
            if (reservation != null && reservation.getPnrNumber().equals(pnrNumber)) {
                System.out.println("PNR Number: " + reservation.getPnrNumber());
                System.out.println("Passenger Name: " + reservation.getPassengerName());
                System.out.println("Train Number: " + reservation.getTrainNumber());
                System.out.println("Train Name: " + reservation.getTrainName());
                System.out.println("Class Type: " + reservation.getClassType());
                System.out.println("Journey Date: " + reservation.getJourneyDate());
                System.out.println("From Place: " + reservation.getFromPlace());
                System.out.println("To Place: " + reservation.getToPlace());
                break;
            }
        }
    }
    
}

