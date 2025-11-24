public class CreditPaymentService {
    private final double principal;
    private final double annualRatePercent;
    private final int termMonths;

    public CreditPaymentService(double principal, double annualRatePercent, int termMonths) {
        this.principal = principal;
        this.annualRatePercent = annualRatePercent;
        this.termMonths = termMonths;
    }

    public double calculate() {
        if (principal <= 0 || termMonths <= 0) {
            return 0.0;
        }
        double r = (annualRatePercent / 100.0) / 12.0; // месячная ставка
        double n = termMonths;
        // Если ставка нулевая, платеж просто principal / n
        if (r == 0.0) {
            return principal / n;
        }
        double numerator = r * Math.pow(1 + r, n);
        double denominator = Math.pow(1 + r, n) - 1;
        return principal * (numerator / denominator);
    }
}
