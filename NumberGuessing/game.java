package NumberGuessing;
import java.util.Scanner;
class NG 
{
  public static int Random() 
  {
    return (int) (Math.random() * 100);
  }  
}
public class game 
{
  public static void main(String[] args) 
  {
    NG obj = new NG();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Y/y to start game and N/n to exit: ");
    char input = sc.next().charAt(0);
    if (input == 'y' || input == 'Y') 
    {
      startGame(sc, obj);
    } else {
      System.out.println("End The Game");
    }
    sc.close();
  }
  private static void startGame(Scanner sc, NG obj) 
  {
    int comp = obj.Random();
    System.out.println("If you won Exit the game then click -1");
    System.out.print("Enter Your Number Between 0 to 100  : ");
    int input=sc.nextInt();;
    while (input != -1) 
    {
      if (input == comp) {
        System.out.println("You won!!");
        sc.close();
        break;
      } else if (input > 100 || input < 0) {
        System.out.println("your input must be in range (0-100)");
      } else if (input > comp) {
        System.out.println("Guess Lower Number");
      } else if (input < comp) {
        System.out.println("Guess Higher Number");
      }
      input = sc.nextInt();
    }
  }
}