package day2;

public class switch01 {
    public static void main(String[] args)
    {
        int userOption =1;
        switch(userOption)
        {
            case 1 ->{
                System.out.println("user clicked 1");
            }
            case 2 ->{
                System.out.println("user clicked 2");
            }
            default -> System.out.println("Unknown option");
        }
    }
}
