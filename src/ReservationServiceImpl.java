import java.util.Map;

public class ReservationServiceImpl implements ReservationService {

    private ReservationRepository reservationRepository;
    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }
    public boolean reserve(String name, int reservationNumber) {
        return reservationRepository.reserve(name, reservationNumber);
    }

    public boolean cancelReservation(String name) {
        return reservationRepository.cancelReservation(name);
    }

    public Map<String, Integer> getAllReservations() {
        return reservationRepository.getAllReservations();
    }

    public void displayAllReservations() {
        System.out.println("Current Reservations:");
        Map<String, Integer> reservations = getAllReservations();
        for (Map.Entry<String, Integer> entry : reservations.entrySet()) {
            System.out.println("Name: " + entry.getKey() + " - Reservation Number: " + entry.getValue());
        }
    }
}