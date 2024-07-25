package AtmMachine;
import java.util.Scanner;
class ATM{
    float Balance = 20000;
    int PIN=5674;
    public void checkPin()
    {
        System.out.println("Enter your pin :");
        Scanner sc =new Scanner(System.in);
        int EnterPin =sc.nextInt();
        if(EnterPin==PIN)
        {
            menu();
        }
        else{
            System.out.println("Invalid Pin");
        }
    }
     public void menu(){
        System.out.println("1. Check A/C Balance ");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposite Money");
        System.out.println("4. Exit");

        Scanner sc =new Scanner(System.in);
        System.out.println("Choose any Option : ");
        int opt = sc.nextInt();
        if(opt ==1)
        {
            CheckBalance();
        }
        else if(opt==2){
            WithDraw();
        }
         else if(opt==3)
        {
            Deposite();
        }
        else if(opt==4)
        {
            return;
        }
        else
        {
          System.out.println("Please make valide choise");
        }
     }
     public void CheckBalance()
     {
        System.out.println("Your Balance : " +Balance);
        menu();
     }
     public void WithDraw()
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount to withdrow : ");
        int withdrow = sc.nextInt();
        if( withdrow<=Balance)
        {
           Balance = Balance-withdrow;
           System.out.println("You Withdrow : " + withdrow + " Amount");
          
        }
        else
        {
            System.out.println("Insufficent Balance");
        }
        menu();
     }
     public void Deposite()
     {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Amount Of Deposite Money : ");
        int Dep = sc.nextInt();
        Balance =Balance+Dep;
        System.out.println("Money Deposite SucessFully");
        menu();
     }
}
public class main{
    public static void main(String[] args) {

        ATM obj =new ATM();
        obj.checkPin(); 
    }
}