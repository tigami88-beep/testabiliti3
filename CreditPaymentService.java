public class CreditPaymentService {
    public double calculate(double principal, double annualInterestRate, int years) {
        double monthlyRate = annualInterestRate / 100 / 12; // перевод годовой ставки в месячную
        int totalMonths = years * 12; // Общее число платежей (месяцев)
        // Формула аннуитетного платежа
        double numerator = monthlyRate * Math.pow(1 + monthlyRate, totalMonths);
        double denominator = Math.pow(1 + monthlyRate, totalMonths) - 1;
        double payment = principal * (numerator / denominator);
        return payment;
    }
}


