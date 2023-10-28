public class Main {
    public static void main(String[] args) {
        TShirt tShirtW = new TShirt(ClothingSize.M, 900, "Красный");
        Pants pantsW = new Pants(ClothingSize.M, 1890, "Черный");
        Skirt skirt = new Skirt(ClothingSize.S, 2500, "Синий");
        TShirt tShirtM = new TShirt(ClothingSize.M, 1200, "Синий");
        Pants pantsM = new Pants(ClothingSize.M, 2200, "Коричневый");
        Tie tie = new Tie(ClothingSize.XXS, 800, "Зеленый");

        WomensClothing[] womensClothes = {tShirtW, pantsW, skirt};
        MensClothing[] mensClothes = {tShirtM, pantsM, tie};

        Atelier atelier = new Atelier();
        atelier.dressWoman(womensClothes);
        atelier.dressMan(mensClothes);
    }
}
