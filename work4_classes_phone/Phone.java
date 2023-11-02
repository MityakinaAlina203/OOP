import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
        this("", "", 0);
    }

    public Phone(String number, String model) {
        this(number, model, 0);
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.println("Звонит " + name + ", номер телефона: " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Отправляю сообщение на номера: " + Arrays.toString(numbers));
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
