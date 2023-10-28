public abstract class Clothing {
    private ClothingSize size;
    private double cost;
    private String color;


    public Clothing(ClothingSize size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public ClothingSize getSize() {
        return size;
    }


    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}