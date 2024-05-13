import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FestivalGate gate = new FestivalGate();
        FestivalStatisticsThread statsThread = new FestivalStatisticsThread(gate);
        statsThread.start();

        Random random = new Random();
        TicketType[] ticketTypes = TicketType.values();
        for (int i = 0; i < 100; i++) {
            FestivalAttendeeThread attendee = new FestivalAttendeeThread(ticketTypes[random.nextInt(ticketTypes.length)], gate);
            attendee.start();
        }
    }
}