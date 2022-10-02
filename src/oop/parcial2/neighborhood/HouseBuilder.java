package oop.parcial2.neighborhood;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilder {
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private List<RestRoom> restRooms;
    private List<BedRoom> bedRooms;


    public HouseBuilder kitchen (Kitchen kitchen){
        this.kitchen = kitchen;
        return this;
    }

    public HouseBuilder diningRoom (DiningRoom diningRoom){
        this.diningRoom = diningRoom;
        return this;
    }

    public HouseBuilder livingRoom (LivingRoom livingRoom){
        this.livingRoom = livingRoom;
        return this;
    }

    public HouseBuilder restRoom (RestRoom restRooms){
        if (this.restRooms == null){
            this.restRooms = new ArrayList<>();
        }
        else{
            this.restRooms.add(restRooms);
        }
        return this;
    }

    public HouseBuilder bedRoom (BedRoom bedRooms){
        if (this.bedRooms == null){
            this.bedRooms = new ArrayList<>();
        }
        else{
            this.bedRooms.add(bedRooms);
        }
        return this;
    }

    public House build(){
        return new House(kitchen,diningRoom,livingRoom,restRooms,bedRooms);
    }
}
