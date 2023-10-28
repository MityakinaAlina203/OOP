public class Pants extends Clothing implements MensClothing, WomensClothing {
    public Pants(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает брюки размера " + getSize() +"("+ getSize().getDescription() +")"+ "европейского размера:" + getSize().getEuroSize()+ ", цвета " + getColor() + ", стоимостью " + getCost() + " рублей");
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надевает брюки размера " + getSize() +"("+ getSize().getDescription() +")"+ "европейского размера:" + getSize().getEuroSize()+ ", цвета " + getColor() + ", стоимостью " + getCost() + " рублей");
    }
}
