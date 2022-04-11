package design.pattern.structural.adapter;

public class Math {
    public static double multiply(double num) {
        return num*2;
    }

    public static double half(double num) {
        return num/2;
    }

    // 수정된 multiply
    public static Double multiply2(Double num) {
        return num*2;
    }
}
