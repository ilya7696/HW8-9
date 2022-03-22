package by.tovpenec.hw8;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone() {}

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);

        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String callerNumber) {
        System.out.println("Звонит " + name + " с номера " + callerNumber);
    }

    String getNumber() {
        return number;
    }

    void sendMessage(String... phoneNumbers) {

        for (String phoneNumber : phoneNumbers)
            System.out.println("Сообщение на номер: " + phoneNumber);
    }

    public void printInfo() {
        System.out.printf("""
                    Phone {
                        number: %s
                        model: %s
                        weight: %d
                    }
                                
                """, number, model, weight);
    }
}
