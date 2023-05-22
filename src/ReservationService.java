import java.util.Map;

public interface ReservationService{
    boolean reserve(String name, int reservationNumber);
    boolean cancelReservation(String name);
    Map<String, Integer> getAllReservations();
    void displayAllReservations();


}
