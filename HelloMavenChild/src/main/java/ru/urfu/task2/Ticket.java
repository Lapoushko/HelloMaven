package ru.urfu.task2;

import java.util.Random;

/**
 * Билет
 *
 * @author vpyzhyanov
 * @since 19.10.2023
 */
public class Ticket {
    public long getId() {
        return id;
    }

    public String getClient() {
        return client;
    }

    public Ticket(String client) {
        Random random = new Random();
        this.id = random.nextLong(1,100_000_000_000L);
        this.client = client;
    }

    private long id;
    private String client;
}
