public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone("123456789", "iPhone");
        Phone phone2 = new Phone("987654321", "Samsung", 0.3);
        Phone phone3 = new Phone("958756421", "iPhone",0.7);

        System.out.println("Phone 1: " + phone1.getNumber() + ", " + phone1.getModel() + ", " + phone1.getWeight());
        System.out.println("Phone 2: " + phone2.getNumber() + ", " + phone2.getModel() + ", " + phone2.getWeight());
        System.out.println("Phone 3: " + phone3.getNumber() + ", " + phone3.getModel() + ", " + phone3.getWeight());

        phone1.receiveCall("Alice", "789458625");
        phone2.receiveCall("Ivan", "554-1234");
        phone3.receiveCall("Bob", "678452984");

        phone1.sendMessage("552-1111", "555-2222", "587624513");
    }

}
