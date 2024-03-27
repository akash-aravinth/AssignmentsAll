package classes.flightdto;

public class Flight {
    private String flightName;
    private String flightId;
    private String pilotName;
    private static String vehichleType;

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public static String getVehichleType() {
        return vehichleType;
    }

    public static void setVehichleType(String vehichleType) {
        Flight.vehichleType = vehichleType;
    }

}
