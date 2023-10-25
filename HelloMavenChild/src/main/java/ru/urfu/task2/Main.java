package ru.urfu.task2;

public class Main {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        for (Ticket ticket : task2.getTicketList()){
            System.out.print("ID: " + ticket.getId() + ", NAME: " + ticket.getClient() + ", PRODUCT: " + task2.getInfoAboutTickets(ticket) + "\n");
        }
    }
}
