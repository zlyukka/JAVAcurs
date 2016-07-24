import java.util.Scanner;
class TestCalculator {
    public static void main(String[] arg) {
        int i=-10,k=20;
        System.out.println("Test");
        final Calculator calc = new Calculator();
        while (i<10) {
            System.out.println("Num1="+i+" Num2="+k);
            calc.startCalculation(i, k);
            System.out.println("result sum=" + calc.getResultSun());
            System.out.println("result minus=" + calc.getResultMin());
            System.out.println("result mnog=" + calc.getResultMnog());
            System.out.println("result del=" + calc.getResultDel());
            calc.resetZnch();
            i++;
            k--;
        }
    }
}