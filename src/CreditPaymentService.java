public class CreditPaymentService {
    public double calculate(int summ, int time, double percentYear) {
        double monthPay;
        double partMonthPercent = (percentYear / 12) / 100;
        monthPay = summ * (partMonthPercent + partMonthPercent / (Math.pow((1 + partMonthPercent), time) - 1));
        return monthPay;
    }

}
