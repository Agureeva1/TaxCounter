package TaxCount;

public class Tax_6 {

    public static long taxEarningsMinus_6(long income) {

        long tax = income * 6 / 100;
        if (tax >= 0) {
            return tax;
        } else {

            return 0;

        }
    }
}
