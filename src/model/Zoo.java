package model;

public class Zoo {
    private String zooName;
    private String location;
    private int animalsCount; // NEW ATTRIBUTE

    public Zoo(String zooName, String location, int animalsCount) {
        this.zooName = zooName;
        this.location = location;
        this.animalsCount = animalsCount;
    }

    public int getAnimalsCount() {
        return animalsCount;
    }
}
