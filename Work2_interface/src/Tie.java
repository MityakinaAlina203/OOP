public class Tie extends Clothing implements MensClothing {
    public Tie(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает галстук размера " + getSize() +"("+ getSize().getDescription() +")"+ "европейского размера:" + getSize().getEuroSize()+ ", цвета " + getColor() + ", стоимостью " + getCost() + " рублей");
    }
}
