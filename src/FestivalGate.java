import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

class FestivalGate {
    private Queue<TicketType> queue = new ConcurrentLinkedQueue<>();

    public void addTicket(TicketType ticketType) {
        queue.add(ticketType);
    }

    public List<TicketType> getTickets() {
        return new ArrayList<>(queue);
    }
}