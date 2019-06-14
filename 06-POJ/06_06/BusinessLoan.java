// praca w parach: Łukasz Ćwikliński s19334, Maciej Rybacki s18553

package 06_06;

public class BusinessLoan extends Loan {
    private final double business_interest = 1;

    public BusinessLoan() {
        super("None", 0, 0);
        super.setInterest_rate(0 + business_interest);
    }

    public BusinessLoan(String last_name, double amount, int term, double interest_rate) {
        super(last_name, amount, term)
        super(interest_rate + business_interest);
    }
}