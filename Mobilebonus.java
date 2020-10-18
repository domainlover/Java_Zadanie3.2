public class Mobilebonus {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 1100;
        int bonus;
        int totalbalance;
        if (payment > 1000) {
            bonus = payment / 100;
            } else {
            bonus = 0;
        }
        totalbalance = balance + payment + bonus;
        System.out.println("Total Balance: " + totalbalance);
        System.out.println("Mobile Bonus: " + bonus);
    }

}