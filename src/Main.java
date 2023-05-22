import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DIcontainer dIcontainer = new DIcontainer();

        int seatCount = 10; // 예약석 개수
        ReservationService reservationService = dIcontainer.createReservationService(seatCount);

        reservationService.reserve("John", 1); // John이 1번 자리 예약
        reservationService.reserve("Alice", 2); // Alice가 2번 자리 예약
        reservationService.reserve("Bob", 1); // Bob이 1번 자리 예약 시도 (이미 예약된 자리)
        reservationService.reserve("Alice", 3); // Alice가 3번 자리 예약 시도 (이미 예약된 이름)

        reservationService.displayAllReservations(); // 전체 예약 현황 출력

        reservationService.cancelReservation("John"); // John의 예약 취소

        reservationService.displayAllReservations(); // 업데이트된 전체 예약 현황 출력
    }

}