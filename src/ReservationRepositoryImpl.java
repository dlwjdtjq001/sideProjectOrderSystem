import java.util.HashMap;
import java.util.Map;

public class ReservationRepositoryImpl implements ReservationRepository {
    private final int seatCount;
    static private Map<String, Integer> reservations;

    public ReservationRepositoryImpl(int seatCount) {
        this.seatCount = seatCount;
        this.reservations = new HashMap<>();
    }

    public boolean reserve(String name, int reservationNumber) {
        if (reservationNumber >= 1 && reservationNumber <= seatCount && !reservations.containsKey(name)) {
            reservations.put(name, reservationNumber);
            return true;
        } else {
            return false;
        }
    }

    public boolean cancelReservation(String name) {
        if (reservations.containsKey(name)) {
            reservations.remove(name);
            return true;
        } else {
            return false;
        }
    }

    public Map<String, Integer> getAllReservations() {
        return reservations;
    }
}