import java.util.List;

class FestivalStatisticsThread extends Thread {
    private FestivalGate gate;

    public FestivalStatisticsThread(FestivalGate gate) {
        this.gate = gate;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            List<TicketType> tickets = gate.getTickets();
            System.out.println(tickets.size() + " people entered");
            System.out.println(tickets.stream().filter(ticket -> ticket == TicketType.FULL).count() + " people have full tickets");
            System.out.println(tickets.stream().filter(ticket -> ticket == TicketType.FULL_VIP).count() + " people have full VIP passes");
            System.out.println(tickets.stream().filter(ticket -> ticket == TicketType.FREE_PASS).count() + " people have free passes");
            System.out.println(tickets.stream().filter(ticket -> ticket == TicketType.ONE_DAY).count() + " people have one-day passes");
            System.out.println(tickets.stream().filter(ticket -> ticket == TicketType.ONE_DAY_VIP).count() + " people have one-day VIP passes");

        }
    }
}