import java.util.Map;

public interface ReservationRepository {
    boolean reserve(String name, int reservationNumber);
    boolean cancelReservation(String name);
    Map<String, Integer> getAllReservations();
}
