public class Skirt extends Clothing implements WomensClothing {
    public Skirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надевает юбку размера "+ getSize()+"("+ getSize().getDescription() +")"+ "европейского размера:" + getSize().getEuroSize()+ ", цвета " + getColor() + ", стоимостью " + getCost() + " рублей");
    }
}
