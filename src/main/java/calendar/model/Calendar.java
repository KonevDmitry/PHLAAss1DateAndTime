package calendar.model;


import java.util.concurrent.atomic.AtomicInteger;

public class Calendar {
    private static final AtomicInteger count = new AtomicInteger(0);

    private final long id;

    public long getId(){
        return this.id;
    }
    private final String value;

    public String getValue(){
        return this.value;
    }
    public Calendar(String value){
        this.id = count.incrementAndGet();
        this.value = value;
    }
}
