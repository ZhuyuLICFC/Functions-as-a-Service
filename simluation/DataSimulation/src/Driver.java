import java.util.HashSet;

public class Driver {

    public static HashSet<Driver> driverList = new HashSet<>();
    public static HashSet<String> driverIDs = new HashSet<>();


    private String id;
    private double[] currentLocation;
    private int state;
    private double[] movePara; //[lati, longi]
    private double[] passengerLocation;
    private double[] destinationLocation;
    private String timeStamp;
    private String assignedPassengerId;


    public static HashSet<Driver> getDriverList() {
        return driverList;
    }

    public Passenger getAssignedPassenger() {
        return assignedPassenger;
    }

    public void setAssignedPassenger(Passenger assignedPassenger) {
        this.assignedPassenger = assignedPassenger;
    }

    public Driver() {

    }

    public Driver(String id, double[] location, int state, double[] movePara, double[] passengerLocation, double[] destinationLocation, String timeStamp, Passenger assignedPassenger) {
        this.id = id;
        this.currentLocation = location;
        this.state = state;
        this.movePara = movePara;
        this.passengerLocation = passengerLocation;
        this.destinationLocation = destinationLocation;
        this.assignedPassenger = assignedPassenger;
    }

    public Driver(String id, double[] currentLocation, double[] movePara) {
        this.id = id;
        this.currentLocation = currentLocation;
        this.movePara = movePara;
    }

    public static void setDriverList(HashSet<Driver> driverList) {
        Driver.driverList = driverList;
    }

    public static HashSet<String> getDriverIDs() {
        return driverIDs;
    }

    public static void setDriverIDs(HashSet<String> driverIDs) {
        Driver.driverIDs = driverIDs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double[] getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(double[] currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public double[] getMovePara() {
        return movePara;
    }

    public void setMovePara(double[] movePara) {
        this.movePara = movePara;
    }

    public double[] getPassengerLocation() {
        return passengerLocation;
    }

    public void setPassengerLocation(double[] passengerLocation) {
        this.passengerLocation = passengerLocation;
    }

    public double[] getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(double[] destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
