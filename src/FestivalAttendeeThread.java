class FestivalAttendeeThread extends Thread {
    private TicketType ticketType;
    private FestivalGate gate;

    public FestivalAttendeeThread(TicketType ticketType, FestivalGate gate) {
        this.ticketType = ticketType;
        this.gate = gate;
    }

    @Override
    public void run() {
        gate.addTicket(ticketType);
    }
}