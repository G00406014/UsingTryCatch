import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {
        System.out.println("please enter a number betWeen 0-9 :");
        Scanner myscan = new Scanner(System.in);
        try {
            int myNum = myscan.nextInt();

            if (myNum <= 9 && myNum > 0) {
                System.out.println("you entered " + myNum);
            } else

            {
               if  (myNum >= 10);
               System.out.println("not a valid number");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

