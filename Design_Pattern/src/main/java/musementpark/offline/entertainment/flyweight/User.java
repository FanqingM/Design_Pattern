package musementpark.offline.entertainment.flyweight;

public class User {

    private String color;
    private String size;
    private String name;

    //外部状态
    public User(String color, String size) {
        super();
        this.color = color;
        this.size = size;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

}