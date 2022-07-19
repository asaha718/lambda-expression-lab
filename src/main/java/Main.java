import java.util.function.IntUnaryOperator;

public class Main {
	// write the nextOddNum here
    @FunctionalInterface
    interface OddNum{
        int applyAsInt(int num);
    }
    public static void main(String[] args) {
        int num = 5;
        int num2 = 10;

        OddNum nextOddNum = (n) -> n % 2 == 0 ? n + 1 : n + 2;

        System.out.println(nextOddNum.applyAsInt(num)); // 7
        System.out.println(nextOddNum.applyAsInt(num2)); // 11
    }
}
