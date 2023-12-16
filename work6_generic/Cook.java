
public class Cook {
    public static void main(String[] args) {
        Food pasta = new Food("Паста");
        pasta.prepare(new Cookable() {
            @Override
            public void cook() {
                System.out.println();
                System.out.println("Сварите пасту в кипящей подсоленной воде до готовности." +
                        "Откиньте на дуршлаг, дайте стечь воде." +
                        "Добавьте соус по вкусу и перемешайте." +
                        "Подавайте горячим, посыпав тертым сыром и зеленью.");
            }
        });

        Food crackers = new Food("Гренки");
        crackers.prepare(() -> {
            System.out.println(crackers);
            System.out.println("Хлеб нарезать тонкими ломтиками.\n" +
                    "Соединить сырое яйцо с молоком, всыпать сахар,\n" +
                    "взбить до однородности венчиком или вилкой.\n" +
                    "Обмакивать кусочки хлеба в яичную смесь и сразу\n" +
                    "выкладывать на сковороду с раскаленным сливочным маслом,\n" +
                    "обжаривать гренки с двух сторон до подрумянивания.\n");
        });
    }
}
