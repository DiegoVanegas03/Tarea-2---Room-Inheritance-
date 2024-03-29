package oop.parcial2.neighborhood;

import java.util.TreeMap;

public class StreetBuilder {
    private String name;
    private TreeMap<Integer, House> houses;

    public StreetBuilder name (String name){
        this.name = name;
        return this;
    }

    public StreetBuilder house (int number, House house){
        if(this.houses == null){
             this.houses = new TreeMap<Integer,House>();
        }
        this.houses.put(number,house);
        return this;
    }

    public Street build(){
        return new Street(name,houses);
    }

}
