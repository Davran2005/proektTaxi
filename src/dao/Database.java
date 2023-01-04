package dao;

import classes.Taxi;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Database {
    private Set<Taxi>taxis = new HashSet<>();

    public Database(Set<Taxi> taxis) {
        this.taxis = taxis;
    }

    public Set<Taxi> getTaxis() {
        return taxis;
    }

    public void setTaxis(Set<Taxi> taxis) {
        this.taxis = taxis;
    }
}
