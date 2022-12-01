//Let us rock and roll
import java.util.Scanner;
import java.io.*;
class Admin
{
    private String accno;
    private String name;
    private long balance;
    Scanner sc1=new Scanner(System.in);
    // method to open an account
    void openAccount()
    {
        System.out.println("ENTER YOUR ACCOUNT NUMBER :");
        accno=sc1.nextLine();
        System.out.println("ENTER YOUR NAME :");
        name=sc1.nextLine();
        System.out.println("ENTER INTITIAL BALANCE TO OPEN ACCOUNT :");
        balance=sc1.nextLong();
        
    }
    //method to display account details
    void showAccount()
    {
        System.out.println("ACCOUNT NO :  "+accno);
        System.out.println("A/C HOLDER NAME :  "+name);
        System.out.println(" A/C BALANCE :  "+balance);
    }
    //method to deposit money
    void deposit()
    {
        System.out.println("ENTER THE MONEY TO DEPOSIT💰");
        Long money;
        money=sc1.nextLong();
        balance=balance+money;
        
    }
    //method to withdraw money
    void withdraw()
    {
        System.out.println("ENTER THE MONEY TO WITHDRAW :💸");
        Long amt;
        amt=sc1.nextLong();
        if(amt>balance)
        {
            System.out.println("INSUFFICIENT BALANCE !! 😢");
        }
        else
        {
            balance=balance-amt;
        }
    }
    //method to check the balance
    boolean search(String acn)
    {
         if(accno.equals(acn))
         {
             showAccount();
             return true;
         }
       return (false);
    }
}
//main class

public class Bank
{
    public static void main(String args[])
    {
        Scanner sc1=new Scanner(System.in);
        //create initial account
        System.out.println("HOW MANY CUSTOMERS DO YOU WANT ? ");
        int n=sc1.nextInt();
        Admin c[] =new Admin[n];
        for(int i=0;i<c.length;i++)
        {
            c[i]=new Admin();
            c[i].openAccount();
        }
        //run the loop until 5 is pressed
        int ch;
        do{
            System.out.println(".........................WELCOME TO AK BANK...................");
            System.out.println("1.DISPLAY ACCOUNT DETAILS \n 2.SEARCH ACCOUNT \n 3.DEPOSIT\n 4.WITHDRAW");
            System.out.println("ENTER YOUR CHOICE🔑");
            ch=sc1.nextInt();
            switch(ch)
            {
                case 1:
                    for(int i=0;i<c.length;i++)
                   {
                     c[i].showAccount();
                   }
                    break;
                case 2:
                    System.out.println("ENTER ACCOUNT NUMBER THAT YOU WANT :");
                    String acn=sc1.next();
                    boolean found=false;
                    for(int i=0;i<c.length;i++)
                    {
                        found=c[i].search(acn);
                        if(found)
                        {
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("SEARCH FAILED UR ACCOUNT DOES'NT EXIST");
                    }
                    break;
                case 3:
                     System.out.println("ENTER A/C NUMBER :");
                     acn=sc1.next();
                     found=false;
                     for(int i=0;i<c.length;i++)
                     {
                         found=c[i].search(acn);
                         if(found)
                         {
                             c[i].deposit();
                             break;
                         }
                     }
                     if(!found)
                     {
                         System.out.println("ACCOUNT DOESNOT EXIST");
                     }
                    break;
                case 4:
                System.out.println("ENTER A/C NUMBER :");
                     acn=sc1.next();
                     found=false;
                     for(int i=0;i<c.length;i++)
                     {
                         found=c[i].search(acn);
                         if(found)
                         {
                             c[i].withdraw();
                             break;
                         }
                     }
                     if(!found)
                     {
                         System.out.println("ACCOUNT DOESNOT EXIST");
                     }
                    break;
                case 5:
                    System.out.println("GOOD BYE 👋");
                    break;

               }
            
        }while(ch!=5);
        
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
