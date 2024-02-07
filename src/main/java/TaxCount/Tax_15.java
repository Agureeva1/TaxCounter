package TaxCount;

public class Tax_15 {

//        long income = 0L;
    //       long expense = 0L;

    public static long taxEarningsMinusSpendings(long income, long expense) {

        long tax = (income - expense) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {

            return 0;

        }
    }
}


