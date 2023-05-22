public class DIcontainer {
    public ReservationRepository createReservationRepository(int seatCount){
        return new ReservationRepositoryImpl(seatCount);
    }

    public ReservationService createReservationService(int seatCount) {
        ReservationRepository reservationRepository = createReservationRepository(seatCount);
        return new ReservationServiceImpl(reservationRepository);
    }
}
