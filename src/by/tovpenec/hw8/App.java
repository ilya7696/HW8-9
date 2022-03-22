package by.tovpenec.hw8;

/*
    Дз 8
    1. Класс Phone.
    1.1. Создайте класс Phone, который содержит переменные
        number, model и weight.
    2. Создайте три экземпляра этого класса.
    3. Выведите на консоль значения их переменных.
    4. Добавить в класс Phone методы:
        receiveCall, имеет один параметр – имя звонящего.
       Выводит на консоль сообщение “Звонит {name}”.
        getNumber – возвращает номер телефона.
       Вызвать эти методы для каждого из объектов.
    5. Добавить конструктор в класс Phone, который принимает на вход три
    параметра для инициализации переменных класса - number, model и weight.
    6. Добавить конструктор, который принимает на вход два параметра для
    инициализации переменных класса - number, model.
    7. Добавить конструктор без параметров.
    8. Вызвать из конструктора с тремя параметрами конструктор с двумя.
    9. Добавьте перегруженный метод receiveCall, который принимает два
    параметра - имя звонящего и номер телефона звонящего. Вызвать этот
    метод.
    10. Создать метод sendMessage с аргументами переменной длины.
    Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
    Метод выводит на консоль номера этих телефонов.
*/


public class App {

    public static void main(String[] args) {
        Phone phone1 = new Phone("375336268978", "JSN2", 156);
        Phone phone2 = new Phone("375296699291", "FAA2", 562);
        Phone phone3 = new Phone("375447738201", "GAS2", 312);
        Phone phone4 = new Phone();
        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();

        phone1.receiveCall("Мама");
        phone2.receiveCall("Папа");
        phone3.receiveCall("Жена");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.receiveCall("Mom", "375296632712");
        phone1.sendMessage("375296638289", "375296638290", "375296638291");
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}
