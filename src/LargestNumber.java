public class LargestNumber {

    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 25;
        int num3 = 5;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The largest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("The largest number is: " + num3);
        }
    }
}
