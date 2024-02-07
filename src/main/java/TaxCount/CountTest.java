package TaxCount;

import java.util.Scanner;

import static TaxCount.Tax_15.taxEarningsMinusSpendings;

public class CountTest {
    public static void start() {
        int number = 0;
        long income = 0L;
        long expense = 0L;
        long tax_6 = 0;
        long tax_15 = 0;
        String makeChoice = "Выберите одну из операций или =end=";
        String notNumber = "Извините, но это явно не число. ";
        System.out.println(makeChoice + "\n 1. Ввести доход  " +
                "\n 2. Ввести расход \n 3. Рассчитать налог  ");

       // Scanner scanner = new Scanner(System.in);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                switch (number) {
                    case 1:
                        System.out.println("Введите доход");
                        if (scanner.hasNextLong()) {
                        income += scanner.nextLong();
                        System.out.println(makeChoice);
                            continue;}
                        else {
                            System.out.println(notNumber + makeChoice);
                            continue;
                        }


                    case 2:
                        System.out.println("Введите расход");
                        if (scanner.hasNextLong()) {
                        expense += scanner.nextLong();
                        System.out.println(makeChoice);
                        continue;}
                        else {
                            System.out.println(notNumber + makeChoice);
                            continue;
                        }

                    case 3:
                        System.out.println("Укажите систему налогооблажения (6% или 15%)");
                        tax_6 = Tax_6.taxEarningsMinus_6(income);
                        tax_15 = taxEarningsMinusSpendings(income, expense);
                        scanner.nextLine();
                        String taxSize = scanner.nextLine();
                        switch (taxSize) {
                            case "6%":
                                System.out.println("При системе налогооблажения 6% размер налога составил " + tax_6);
                                System.out.println("При системе налогооблажения 15% размер налога составил БЫ " + tax_15);
                                if (tax_6>tax_15) System.out.println("Переходите на налог 15 %, в этом случае вы экономите " + (tax_6-tax_15));
                                if (tax_6<tax_15) System.out.println("Оставайтесь на текущем налоговом режиме 6 %, так вы экономите " + (tax_15 - tax_6));
                                System.out.println(makeChoice);
                                continue;
                            case "15%":
                                System.out.println("При системе налогооблажения 15% размер налога составил " + tax_15);
                                if (tax_6<tax_15) System.out.println("Переходите на налог 6 %, в этом случае вы экономите " + (tax_15-tax_6));
                                if (tax_6>tax_15) System.out.println("Оставайтесь на текущем налоговом режиме 15 %, так вы экономите " + (tax_6 - tax_15));
                                System.out.println(makeChoice);
                                continue;
                            default:
                                System.out.println("Такой системы налогооблажения нет. Выберите одну из операций");
                       //         break;
                                continue;

                        }
                   default:
                       System.out.println("Такой операции нет. " + makeChoice);
                       break;

                }

            } else if (scanner.hasNext("end")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println(notNumber);
                continue;
            }
        }
    }
}
