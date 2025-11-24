//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Первый кредит: 1 000 000, 12% годовых, на 24 месяца
        CreditPaymentService cs1 = new CreditPaymentService(1_000_000, 12.0, 24);
        double payment1 = cs1.calculate();
        System.out.printf("Ежемесячный платеж 1: %.2f%n", payment1);

        // Второй кредит: 50000, 7.5% годовых, на 60 месяцев
        CreditPaymentService cs2 = new CreditPaymentService(50_000, 7.5, 60);
        double payment2 = cs2.calculate();
        System.out.printf("Ежемесячный платеж 2: %.2f%n", payment2);

        // Третий кредит: 250000, 0% годовых, на 36 месяцев
        CreditPaymentService cs3 = new CreditPaymentService(250_000, 0.0, 36);
        double payment3 = cs3.calculate();
        System.out.printf("Ежемесячный платеж 3: %.2f%n", payment3);
    }
}