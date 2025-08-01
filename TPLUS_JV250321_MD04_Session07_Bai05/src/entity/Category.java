package entity;

public class Category {
    private int id;
    private String name;
    private String description;

    public Category () {
    }

    public Category (int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public String display () {
        return String.format("ID: %2d, Name: %5s, Description: %10s",
                this.id, this.name, this.description);
    }
}