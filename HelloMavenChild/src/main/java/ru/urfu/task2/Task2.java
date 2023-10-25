package ru.urfu.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Дано:
 * <pre>
 * public class Ticket {
 *     private long id;
 *     private String client;
 *     …
 * }</pre>
 * <p>Разработать программу для бармена в холле огромного концертного зала.
 * Зрители в кассе покупают билет (класс Ticket), на котором указан идентификатор билета (id) и имя зрителя.
 * При этом, есть возможность докупить наборы разных товаров (комбо-обед): нет товаров, напитки, еда и напитки.
 * Доп. услуги оформляются через интернет и привязываются к билету, но хранятся отдельно от билета
 * (нельзя добавить товары в класс Ticket).</p>
 * <p>Бармен сканирует билет и получает объект Ticket. По этому объекту нужно уметь
 * находить необходимые товары по номеру билета. И делать это нужно очень быстро,
 * ведь нужно как можно быстрее всех накормить.</p>
 * <p>
 * См. {@link Ticket}
 *
 * @author vpyzhyanov
 * @since 19.10.2023
 */
public class Task2 {
    //Коллекция позволяет быстрый доступ по Ticket.id по сложности O(1)
    private Map<Long,Product> hashMap = new HashMap<>();

    //Список посетителей, не относится к задаче
    private List<Ticket> ticketList = new ArrayList<>();

    public Task2(){
        RegisterVisitors("Коля",Product.NO_PRODUCT);
        RegisterVisitors("Вадим",Product.FOOD);
        RegisterVisitors("Виктор",Product.DRINKS);
    }

    //Регистрация посетителей. Не входит в задачу
    public void RegisterVisitors(String name, Product product){
        Ticket ticket = new Ticket(name);
        ticketList.add(ticket);
        hashMap.put(ticket.getId(),product);
    }


    //O(1)
    public Product getInfoAboutTickets(Ticket ticket){
        return hashMap.getOrDefault(ticket.getId(),null);
    }

    public List<Ticket> getTicketList(){
        return ticketList;
    }
}
