package oop.parcial2.neighborhood;

public class LivingRoom extends Room{
    private int widows;
    private boolean tv;
    private boolean homeTeather;

    LivingRoom(int width, int height, String color, int widows, boolean tv, boolean homeTeather) {
        super(width, height, color);
        this.widows = widows;
        this.tv = tv;
        this.homeTeather = homeTeather;
    }

    public int getWidows(){
        return widows;
    }

    public boolean getTv(){
        return tv;
    }

    public boolean getHomeTeather(){
        return homeTeather;
    }

    public static LivingRoomBuilder builder(){
        return new LivingRoomBuilder();
    }
}
