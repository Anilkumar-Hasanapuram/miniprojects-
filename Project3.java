import java.util.Scanner;
public class Project3{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age;
		long phone;
		double gpa;
        String name,email,dob;
        System.out.println("..............💐💐💐.WELCOME TO MTIET UNIVERSITY ADMISSIONS ...💐💐💐......");
        System.out.println("enter your name : ");
        name=sc.nextLine();
		System.out.println("Please enter your age: ");
		age = sc.nextInt();
        System.out.println("enter your date of birth : ");
        dob=sc.next();
        System.out.println("enter your e-mail address : ");
        email=sc.next();
        System.out.println("enter your phone number: ");
        phone=sc.nextInt();
		System.out.println("Please enter your GPA that you got recently :  ");
		gpa = sc.nextDouble();
        System.out.println("PLEASE CHECK YOUR DETAILS THAT ARE GIVEN BELOW: \n ");
        System.out.println("name  of the student :"+name);
        System.out.println("student age :"+age);
        System.out.println(" date of birth  :"+dob);
        System.out.println("email  :"+email);
        System.out.println("student phone no    :"+phone);
        Test t=new Test();
        t.test(age,gpa);
        Payment p=new  Payment();
        p.pay();
       Course c=new Course(); 
      c.menu();


	}

}
class Test
{
     void test(int age,double gpa)
    {
    Scanner sc1=new Scanner(System.in);
    int testScore=0;
    System.out.println("are you ready for the test(Y)");
    String ch=sc1.nextLine();
    if(ch.equals("y") || ch.equals("Y"))
    {
    System.out.println("we are preparing questions for you.......📜📄.\n");
    System.out.println(".....whose one of the following correct answer  💯 : ");
    System.out.println(" 1)what is  1+1 ?");
    System.out.println("a) 1   b) 2  c)3  d)4");
    String ans1=sc1.next();
    System.out.println("2)what is  1+2 ?");
    System.out.println("a) 1   b) 2  c)3  d)4");
    String ans2=sc1.next();
    System.out.println(" 3)what is  1+3 ?");
    System.out.println("a) 1   b) 2  c)3  d)4");
    String ans3=sc1.next();
    if(ans1.equals("b") || ans2.equals("c")|| ans3.equals("d")) 
    {
    System.out.println("the questions are correct👌  " );
    testScore=100;
    }
    else if(ans1.equals("b") || ans2.equals("c")|| ans3!="d" && ans1.equals("b") || ans2!="c"|| ans3.equals("d") &&ans1!="b" || ans2.equals("c")|| ans3.equals("d")) 
    {
    System.out.println("you loose one point .😊." );
    testScore=75;
    }
   else if(ans1!="b" || ans2!="c"|| ans3.equals("d" )&& ans1!="b"|| ans2=="c"|| ans3!="d" && ans1=="b" || ans2!="c"|| ans3!="d") 
   {
    System.out.println("you loose two point .😢." );
    testScore=75;
    }
    if(age >= 18 && gpa >= 2.0 && testScore >=50) 
    {
	System.out.println("You are eligible for admission  !😁");
   } else 
   {
			System.out.println("Sorry, you are not eligible for admission. 🥺");
  }
    }
  
}

}
class Payment
{
      void pay()
        
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("details bar");
            System.out.println("1. college fee only  \n 2.college +hostel fee \n 3.college fee+bus fee");
            int pay=sc.nextInt();
            switch(pay)
            { 
                                                          
            case 1:System.out.println(" college fee is   100000");
                    System.out.println("enter fee   :💵");
                    int  amount1=100000;
                    int  fee1=sc.nextInt();
                    amount1=amount1-fee1;
                    System.out.println("the amount you paid to college is  :"+fee1+" the balance fee is"+amount1);
                    break;
            case 2:System.out.println("college fee +hostel fee is      200000");
                    System.out.println("enter fee   :💵");
                    int fee2=sc.nextInt();
                    int amount2=200000;
                    amount2=amount2-fee2;
                    System.out.println("the amount you paid to college is  :"+fee2+" the balance fee is"+amount2);
                     break;
            case 3:System.out.println("collge fee+ bus fee is     150000" );
                   System.out.println("enter fee   :💵");
                   int amount3=150000;
                    int fee3=sc.nextInt();
                    amount3=amount3-fee3;
                    System.out.println("the amount you paid to college is  :"+fee3+" the balance fee is"+amount3);
                   break;
                 }
         }

}
class Course 
{
      void menu()
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("details bar");
        System.out.println(" 1.CSE           2.ECE             3.EEE");
        int pay=sc.nextInt();
        switch(pay)
 {
    case 1:System.out.println("...welcome to CSE branch ...");
           System.out.println("college opens on 22-22-2222");
           System.out.println("the class no CSE45 is waiting for you....................");
        break;
    case 2:System.out.println("...welcome to ECE branch ...");
            System.out.println("college opens on 22-22-2222");
            System.out.println("the class no ECE45 is waiting for you.................");
            break;
    case 3:System.out.println("...welcome to EEE branch ...");
           System.out.println("college opens on 22-22-2222");
          System.out.println("the class no EEE45 is waiting for you...........");
         break;
}
System.out.println(".......************ALL THE BEST👍 ***********..........");
         }

}
