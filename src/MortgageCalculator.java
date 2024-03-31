public class MortgageCalculator {
    private static final double DEFAULT_INTEREST_RATE = 0.04;
    private static final int DEFAULT_LOAN_TERM = 30;

    public static double calculateMonthlyPayment(double loanAmount, double interestRate, int loanTerm) {
        double monthlyInterestRate = interestRate / 12;
        int numberOfPayments = loanTerm * 12;
        return (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
    }

    public static void main(String[] args) {
        double loanAmount = 200000;
        double interestRate = DEFAULT_INTEREST_RATE;
        int loanTerm = DEFAULT_LOAN_TERM;
        double monthlyPayment = calculateMonthlyPayment(loanAmount, interestRate, loanTerm);

        System.out.println("Loan Amount: $" + loanAmount);
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
        System.out.println("Loan Term: " + loanTerm + " years");
        System.out.println("Monthly Payment: $" + monthlyPayment);
    }
}
