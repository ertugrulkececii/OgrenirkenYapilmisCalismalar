package BasitGiderHesaplama;

import java.util.Scanner;

public class hesap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = 0;
        double expenses = 0;
        System.out.print("aylık gelirinizi girin: ");
        income = scanner.nextDouble();
        System.out.print("Gider kategorilerinin sayısını giriniz: ");
        int numCategories = scanner.nextInt();
        for (int i = 0; i < numCategories; i++) {
            System.out.print("Gider kategorisinin adını girin: ");
            String category = scanner.next();
            System.out.print("bu kategoride harcanan tutarı girin: ");
            double amount = scanner.nextDouble();
            expenses += amount;
            System.out.println("You have spent " + amount + " in the " + category + " category.");
        }
        double balance = income - expenses;
        System.out.println("Your monthly balance is: " + balance);
    }
}
