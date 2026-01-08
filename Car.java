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
  private double tiresAir;

  public Car(double m)
  {
    efficiency = m;
    litres = 0;
    maxFuel = 90.0;
    minFuel = 9.0;
    tiresAir = 100.0;
  }

  public void fillUpFuel(double fill)
  {
    if (litres + fill > maxFuel)
    {
      System.out.println("Sorry, that's too much fuel for this tank. You currently have " + litres + "/" + maxFuel + "L. Your gas tank will now be filled completely.");
      litres = maxFuel;
    }
    else
    {
      litres += fill;
      System.out.println("Gas tank filled. Current fuel amount: " + litres + "/" + maxFuel + "L.");
    }
  }
    
  public void takeATrip(double distance)
  {
    usedFuel = efficiency * (distance / 100);
    if (litres - usedFuel < minFuel)
    {
      System.out.println("You can't drive that distance, you don't have enough fuel (you must keep at least 9L in reserve.)");
    }
    else if (tiresAir > 20.0)
    {
      litres = litres - usedFuel;
      System.out.println("You drove " + distance + " KM.");
      tiresAir -= distance * 0.1;
      System.out.println("Your tires are now " + tiresAir + "% the recommended tire pressure.");
    }
    else
    {
      System.out.println("Your tires are dangerously underinflated, you may not drive.");
    }
  }

  public double reportFuel()
  {
    return litres;
  }

  public void fillUpTires()
  {
    tiresAir = 100;
    System.out.println("Tires successfully inflated.");
  }
}
