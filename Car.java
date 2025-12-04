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
      System.out.println(
    }
  }
}
