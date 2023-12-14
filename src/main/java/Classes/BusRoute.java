package Classes;

import java.util.List;

public class BusRoute {
    private int id;
    private String name;
    private int capacity;
    private List<BusStop> busStops;

    public BusRoute(int id, String name, int capacity, List<BusStop> busStops){
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.busStops = busStops;
    }
}
