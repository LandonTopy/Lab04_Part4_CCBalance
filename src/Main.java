public class Main {
    public static void main(String[] args) {

        //Variables
        int ccBalance = 5000;
        double interest = 1.17;
        double month1 = ccBalance * interest;
        double month2 = month1 * interest;

        System.out.println("The total balance after interest after 1 month is $" + month1);
        System.out.println("The total balance after interest after 2 months is $" + month2);
    }
}