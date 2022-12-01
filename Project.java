import java.util.Scanner;

public class Project{

     //private static Cab[] cab = new Cab[100];

     //private static int totalcab=0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to BookMyCab!");

        int input = 0;

        do {
            System.out.println("1. ADD A CAB 🚕 ");
            System.out.println("2. REMOVE A CAB    🚖");
            System.out.println("3. BOOK A CAB  ..");
            System.out.println("4. EXIT ");
            System.out.println("ENTER YOUR CHOICE ::");

           input = scanner.nextInt();

            if (input == 1) 
{
       String make,model;
        System.out.println("ENTER YOUR LICENCE NUMBER  : ");
           int number = scanner.nextInt();
        System.out.println(" ENTER YOUR TYPE OF VEHICLE  : ");
         make = scanner.next();
        System.out.println(" ENTER YOUR MODEL OF VEHICLE : ");
       model = scanner.next();
        System.out.println("ENTER YOUR VEHICLE YEAR THAT YOU BROUGHT : ");
        int year = scanner.nextInt();
        System.out.println("ENTER NO OF SEATS: ");
        int seats = scanner.nextInt();
        System.out.println("ENTER YOUR PRICE PER KILOMETER : ");
        double pricePerKilometer = scanner.nextDouble();
 System.out.println("..................THANKS FOR FILLING DETAILS PLEASE CHECK YOUR DETAILS ............................................... \n \n ");
       // Cab cab1= new Cab();
   System.out.println("\t LICENSE NUMBER   :"+number);
  System.out.println("\t YOUR VECHILE TYPE   :  "+make);
System.out.println("\t YOUR VEHICLE MODLE  :"+model);
System.out.println("\t YOUR VEHICLE YEAR   :"+year);
System.out.println("\t NO OF SEATS YOUR VEHICLE HAVING :"+seats);
System.out.println("\t PRICE THAT U ARE CHARGING PER KILOMETER :"+pricePerKilometer);
  

            } else if (input == 2) {
               System.out.println("Enter the license plate number of the cab to be removed:");
        int licenselicensePlateNumber1= scanner.nextInt();
   if(licenselicensePlateNumber1==12345)
{
       System.out.println("\t YOUR CAB IS FOUND AND DELETED SUCESS FULLY");
}
else
{
System.out.println("\t NO CAB FOUND WITH THE LICENSE PLATE NUMBER ENTERED");
}
            } else if (input == 3) {
            Scanner scanner2 = new Scanner(System.in);
        System.out.println("\t ENTER YOUR NAME :");
        String name=scanner2.nextLine();
        System.out.println(" \t ENTER YOUR  MOBILE NUMBER :");
        int  mobile=scanner2.nextInt();
         System.out.println("\t  ENTER YOUR  CURRENT PLACE  :");
        String s=scanner2.next();
       System.out.println("\t  ENTER YOUR DESTINATION PLACE  :");
        String s1=scanner2.next();
        System.out.println("\t  ENTER  TOTAL DISTANCE FROM :"+s+" TO " +s1);
         int distance=scanner2.nextInt();
        System.out.println("\t CAB TYPE (A/C) OR (NON-A/C)");
         String type=scanner2.next();
      if(type.equals("ac"))
     {
              System.out.println("\t .............YOU SELECTED A/C CAB:.....!");
             int total=distance*100;
              System.out.println("\t PRICE OF A/C CAB FROM"+s+"TO "+s1+" IS : "+total);
              System.out.println("\t !!!!!!!!!!!!!!!!  YOUR CAB IS BOOKED SUCESSFULLY  !!!!!!!!!!!!!");
System.out.println("\t \t ENJOY YOUR TRIP  💐💐........... HAPPY JOURNEY........💐)" ); 
     }
   else
{
 
 System.out.println("\t .............YOU SELECTED NON -A/C CAB:.....!");
             int total1=distance*50;
              System.out.println("PRICE OF A/C CAB FROM"+s+"TO "+s1+" IS : "+total1);
              System.out.println("\t !!!!!!!!!!!!!!!!  YOUR CAB IS BOOKED SUCESSFULLY  !!!!!!!!!!!!!");
System.out.println("\t \t ENJOY YOUR TRIP  💐💐........... HAPPY JOURNEY........💐)" ); 
}
            }
    if(input==4)
    {
        break;
    }

} while (input != 4);
    }
}
