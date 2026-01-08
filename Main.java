import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    String input = "";
    boolean continueLoop = true;
    Scanner scan = new Scanner(System.in);
    System.out.println("Please input the fuel efficiency value as a decimal.");
    efficiency = scan.nextDouble();
    Car car = new Car(efficiency);
    while (continueLoop = true)
    {
      System.out.println("Select whether you want to FILLFUEL, DRIVE, CHECKFUEL or FILLTIRES.");
      input = scan.nextLine();
      if (input.toUpperCase().equals("FILLFUEL"))
      {
        System.out.println("How many litres do you want to fill up? (Enter a decimal):");
        input = scan.nextDouble();
        car.fillUpFuel(input);
        System.out.println("Do you want to continue?");
        input = scan.nextLine();
        if (input.toUpperCase().equals("NO"))
        {
          continueLoop = false;
        }
      }
      else if (input.toUpperCase().equals("DRIVE"))
      {
        System.out.println("Enter the distance (decimal):");
        input = scan.nextDouble();
        car.takeATrip(input);
        System.out.println("Do you want to continue?");
        input = scan.nextLine();
        if (input.toUpperCase().equals("NO"))
        {
          continueLoop = false;
        }
      }
      else if (input.toUpperCase().equals("CHECKFUEL"))
      {
        System.out.println(car.reportFuel());
        System.out.println("Do you want to continue?");
        input = scan.nextLine();
        if (input.toUpperCase().equals("NO"))
        {
          continueLoop = false;
        }
      }
      else if (input.toUpperCase().equals("FILLTIRES"))
      {
        car.fillUpTires();
        System.out.println("Do you want to continue?");
        input = scan.nextLine();
        if (input.toUpperCase().equals("NO"))
        {
          continueLoop = false;
        }
      }
      else
      {
        System.out.print("You did not type FILLFUEL, DRIVE, CHECKFUEL or FILLTIRES.")
        System.out.println("Do you want to continue?");
        input = scan.nextLine();
        if (input.toUpperCase().equals("NO"))
        {
          continueLoop = false;
        }
      }
    }
  }
}
