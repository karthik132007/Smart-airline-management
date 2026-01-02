package Models;
import java.time.LocalTime;
public class Flight {
    int FlightId;
    String StartLocation;
    String Destination;
    LocalTime Duration;
    Aircraft aircraft;
    Flight(String StartLocation,String Destination,LocalTime Duration,Aircraft aircraft){
        this.StartLocation= StartLocation;
        this.Destination=Destination;
        this.Duration=Duration;
        this.aircraft= aircraft;
    }
}
