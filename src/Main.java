public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int summ = 1_000_000;
        int time = 12;
        double percentYear = 9.99;
        double monthPay = service. calculate(summ, time, percentYear);
        System.out.println("Ежемесячный платеж по кредиту: " + (int) monthPay);
    }


}
