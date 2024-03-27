package classes.flightdto;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();
        flight.setFlightName("Air Bus");
        flight.setFlightId("106793");
        flight.setPilotName("aravinth");
        Flight.setVehichleType("Flight");
        System.out.println("Flight name : "+flight.getFlightName()+"\nFlight id : "+flight.getFlightId()
        +"\nVehicle Type : "+Flight.getVehichleType()+"\nPilot Name : "+flight.getPilotName());
    }
}
