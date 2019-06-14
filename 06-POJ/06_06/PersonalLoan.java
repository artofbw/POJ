// praca w parach: Łukasz Ćwikliński s19334, Maciej Rybacki s18553

package 06_06;

public class PersonalLoan extends Loan {
    private final double personal_interest = 2;

    public PersonalLoan()
    {
        super("None", 0, 0);
        super.setInterest(0 + personal_interest);
    }

    public PersonalLoan(String last_name, double amount, int term, double interest)
    {
        super(last_name, amount, term);
        super.setInterest(interest + personal_interest);
    }
}