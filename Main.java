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
      System.out.println("Select whether you want to FILL, DRIVE or CHECKFUEL.");
      input = scan.nextLine();
      if (input.toUpperCase().equals("FILL"))
      {
        System.out.println("How many litres do you want to fill up? (Enter a decimal):");
        input = scan.nextDouble();
        car.fillUp(input);
      }
      else if (input.toUpperCase().equals("DRIVE"))
      {
        System.out.println("Enter the distance (decimal):");
        input = scan.nextDouble();
        car.takeATrip(input);
      }
      else if (input.toUpperCase().equals("CHECKFUEL"))
      {
        System.out.println(car.reportFuel());
      }
    }
  }
}
