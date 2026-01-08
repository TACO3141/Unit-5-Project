/* Chosen car: Bentley Continental GT W12
* Fuel efficiency of 13.1
* Gas tank size 90L
*/
public class Car
{
  private double efficiency;
  private double litres;
  private double maxFuel;
  private double minFuel;
  private double usedFuel;

  public Car(double m)
  {
    efficiency = m;
    litres = 0;
    maxFuel = 90.0;
    minFuel = 9.0;
  }

  public void fillUp(double fill)
  {
    if (litres + fill > maxFuel)
    {
      System.out.println("Sorry, that's too much fuel for this tank. You currently have " + litres + "/" + maxFuel + "L. Your gas tank will now be filled completely.");
      litres = maxFuel;
    }
    else
    {
      litres += fill;
      System.out.println("Gas tank filled. Current fuel amount: " + litres + "/" + maxFuel + "L.")
    }
  }
    
  public void takeATrip(double distance)
  {
    usedFuel = efficiency * (distance / 100);
    if (litres - usedFuel < minFuel)
    {
      System.out.println("You can't drive that distance, you don't have enough fuel (you must keep at least 9L in reserve.)");
    }
    else
    {
      litres = litres - usedFuel;
      System.out.println("You drove " + distance + " KM.");
    }
  }

    public double reportFuel()
    {
      return litres;
    }
    
}
