public class Atelier {
    public void dressWoman(WomensClothing[] clothes) {
        for (WomensClothing clothing : clothes) {
            clothing.dressWoman();
        }
    }

    public void dressMan(MensClothing[] clothes) {
        for (MensClothing clothing : clothes) {
            clothing.dressMan();
        }
    }
}