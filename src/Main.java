public class Main {
    public static void main(String[] args) {

        int account = 100; // начальный счет
        int payment = 1869; // сумма пополнения
        int rate = 100; // количество рублей от суммы пополения для начисления бонусного 1 рубля на счет
        int bonus; // количество бонусных рублей
        int total; // всего рублей на счету

        if (payment > 1000) {
            bonus = payment / rate;
        } else {
            bonus = 0;
        }

        total = account + payment + bonus;

        System.out.println("Бонусных рублей " + bonus + ". Всего на счете " + total + " рублей.");

    }
}
