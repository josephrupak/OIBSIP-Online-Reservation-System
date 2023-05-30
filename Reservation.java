public class Reservation {
    private String pnrNumber;
    private String passengerName;
    private String trainNumber;
    private String trainName;
    private String classType;
    private String journeyDate;
    private String fromPlace;
    private String toPlace;

    public Reservation(String pnrNumber, String passengerName, String trainNumber, String trainName,
                       String classType, String journeyDate, String fromPlace, String toPlace) {
        this.pnrNumber = pnrNumber;
        this.passengerName = passengerName;
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.classType = classType;
        this.journeyDate = journeyDate;
        this.fromPlace = fromPlace;
        this.toPlace = toPlace;
    }

    public String getPnrNumber() {
        return pnrNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getClassType() {
        return classType;
    }

    public String getJourneyDate() {
        return journeyDate;
    }

    public String getFromPlace() {
        return fromPlace;
    }

    public String getToPlace() {
        return toPlace;
    }
}
