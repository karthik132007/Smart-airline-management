import java.time.LocalDate;
import java.time.LocalTime;

public class FlightCreationRequest {

    private String airlineId;
    private String sourceAirport;
    private String destinationAirport;

    private String aircraftId;

    private LocalDate flightDate;
    private LocalTime preferredDepartureTime;

}
