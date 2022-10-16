import java.util.Scanner;
import java.util.Random;

public class craps {
    public static void main(String[] args) {
        String player1Move;
        int accepted;
        Random rnd = new Random();
        String playagain;
        do {
            System.out.println("Rolling Dice. Press enter to continue");
            Scanner scanner = new Scanner(System.in);
            player1Move= scanner.nextLine();
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int sum = die1+die2;
            System.out.println(die1);
            System.out.println(die2);
            if(sum == 2||sum==3||sum==12){
                System.out.println("Craps! You lose.");
            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural! You win.");
            }else {
                System.out.println("The point is " +sum);
                do {

                    System.out.println("Rolling Dice. Press enter to continue");
                    Scanner map = new Scanner(System.in);
                    player1Move= map.nextLine();
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    int sum2 = die1 + die2;
                    System.out.println(die1);
                    System.out.println(die2);
                    if (sum2 == 7) {
                        System.out.println("A 7! You lose.");
                        accepted = 0;
                    } else if (sum2 == sum) {
                        System.out.println("You got the point! You win.");
                        accepted = 0;
                    } else {
                        accepted = 1;
                        System.out.println("Not the point nor a 7. Rolling again. Press enter to continue");
                        Scanner cont = new Scanner(System.in);
                        player1Move= cont.nextLine();
                    }
                } while (accepted == 1);
            }
            System.out.println(" Play Again? Y/N");
            Scanner in = new Scanner(System.in);
            playagain = in.nextLine();
        }while(playagain.equalsIgnoreCase("y"));
    }
}