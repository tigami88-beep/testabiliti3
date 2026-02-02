//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double principal = 1_000_000; // 1 миллион рублей
        double annualInterestRate = 9.99; // ставка 9,99%

        // Расчет для 1-го года
        double payment1Year = service.calculate(principal, annualInterestRate, 1);
        System.out.printf("На 1 год, платеж: %.0f рублей%n", payment1Year);

        // Расчет для 2 лет
        double payment2Years = service.calculate(principal, annualInterestRate, 2);
        System.out.printf("На 2 года, платеж: %.0f рублей%n", payment2Years);

        // Расчет для 3 лет
        double payment3Years = service.calculate(principal, annualInterestRate, 3);
        System.out.printf("На 3 года, платеж: %.0f рублей%n", payment3Years);
    }
}