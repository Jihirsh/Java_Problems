import java.util.*;


public class RockPaperScissor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
                int min = 0;
                int max = 2;
        int randomNumber = random.nextInt((max - min) + 1) + min;


        System.out.println("Enter 0 for rock, 1 for paper or 2 for scissor");

        int userhand = sc.nextInt();

        if (userhand == randomNumber) {
            System.out.println("Tie");
            System.out.println("computer had chose :"+randomNumber);
        }
        else if (userhand == 0 && randomNumber == 1 || userhand == 1 && randomNumber == 2 || userhand == 2 && randomNumber == 0) {
            System.out.println("Computer won");
            System.out.println("computer had chose :"+randomNumber);
        }
        else if (userhand == 0 && randomNumber == 2 || userhand == 1 && randomNumber == 0 || userhand == 2 && randomNumber == 1) {
            System.out.println("User won");
            System.out.println("computer had chose :"+randomNumber);

        }
        else{
            System.out.println("please enter within the given  range!!");
        }

    }
}
