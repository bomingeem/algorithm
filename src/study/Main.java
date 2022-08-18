package study;

public class Main {
    public static void main(String[] args) {
        int deliveryFee = 3000;
        double pointAmount = 20850;
        double totalAmount = 49900;
        double actualDiscountRate = (pointAmount / totalAmount) * 100;
        System.out.println(actualDiscountRate);
        System.out.println((int) (deliveryFee * (actualDiscountRate / 100)));

    }
}


