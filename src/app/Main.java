package app;

public class Main {
    static double tax;
    static double income;
public static void main (String[] args){

    income = 15000;

    if (income <= 10000) {
        tax = income * 2.5 / 100;
    } else if (income <= 25000) {
        tax = 10000 * 2.5/100 + (income - 10000) * 4.3/100;
    } else {
        tax = 10000 * 2.5/100 + 15000 * 4.3/100 +
                (income - 25000) * 6.7/100;
         }
    System.out.printf("Total income: %.2f.  %nTax amount: %.2f.",
            income, tax);
//    System.out.println("Total income: " + income);
//    System.out.println("Tax amount:  " + tax);
    }
}
