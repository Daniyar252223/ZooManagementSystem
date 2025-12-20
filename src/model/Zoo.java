package model;

public class Zoo {
    private String zooName;
    private String location;
    private int animalsCount;

    public Zoo(String zooName, String location, int animalsCount) {
        this.zooName = zooName;
        this.location = location;
        this.animalsCount = animalsCount;
    }
    public String ZooName() {
        return zooName;
    }
    public String Location() {
        return location;
    }
    public int getAnimalsCount() {
        return animalsCount;
    }
}
