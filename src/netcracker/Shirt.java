package netcracker;

public class Shirt {
    String id;
    String description;
    String color;
    String size;

    Shirt(String id, String description, String color, String size){
        this.id = id;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString(){
        return String.format("id: " + this.id
                + "\nОписание: " + this.description
                + "\nЦвет: " + this.color
                + "\nРазмер: " + this.size
        );
    }
}
