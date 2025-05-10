public class MethodReturnValue {
    static int addnumber(int num1 ,int num2){
        int sum = num1 + num2;
        return sum;

    }
    public static void main(String[] args){
        int result1 = addnumber(10,20);
        System.out.println("sum of 10 & 20:"+result1);

        int result2 = addnumber(5,10);
        System.out.println("sum of 5 & 10:"+result2);
    }

    }




