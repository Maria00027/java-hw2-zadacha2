public class Main {
    public static void main(String[] args) {
        int balance = 300;
        int replenishBalance = 1500;

        int bonus = replenishBalance >= 1000 ? replenishBalance / 100 : 0;

        int overallBalance = replenishBalance + balance + bonus;
        System.out.println("Общий баланс:" + overallBalance);
        System.out.println("Бонус:" + bonus);
    }
}