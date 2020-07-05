import java.util.HashMap;
import java.util.Random;

public class Locker {
    private String size;
    private int remain;
    private int capacity;
    private HashMap<Bag, Integer> map;
    
    public Locker(String size, int capacity) {
        this.size = size;
        this.capacity = capacity;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getRemain() {
        return remain;
    }

    public void setRemain(int remain) {
        this.remain = remain;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Ticket save(Bag bag) {
        Ticket ticket = new Ticket();
        Random random = new Random();
        ticket.setId(random.nextInt());
        map.put(bag,ticket.getId());
        return ticket;
    }
}
