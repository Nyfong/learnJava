package day2;

public class oldSwitch {
    public static void main(String[] args)
    {
        int coustumerID = 20;
        // if costumerID != 1 and != 20 so unknown Userid :)
        switch(coustumerID)
        {
            case 1:{
                System.out.println("User id 1");
                break;
            }
            case 20: {
                System.out.println("User id 20");
                break;
            }
            default:
                System.out.println("Unkown user ID");
        }
    }
}
