package day1;

public class MathJavaTest {
    public static void main(String[] args)
    {
        int Num1 = 10;
        int Num2 = 20;
        int result, resultMin;
        resultMin = Math.min(Num1, Num2);
        result = Math.max(Num1, Num2);
        System.out.println("Find the max result bettween "+Num1+" and "+ Num2+ " = "+result);
        System.out.println("Find the min result bettween "+Num1+" and "+ Num2+ " = "+resultMin);
        System.out.println("Find the square root result"+ Num1+" = "+ Math.sqrt(Num1));
        // Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        System.out.println("Find the Random number = "+ Math.random()*10);
    }

}
