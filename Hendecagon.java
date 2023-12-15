
/**
 * Implement a circle
 * 
 * @author Mr. Jaffe 
 * @version 2017-07-14
 */
public class Hendecagon implements Shape
{
  private int side;
  private String color;

  /**
   * Constructor for objects of class Circle
   */
  public Hendecagon(int side)
  {
    this.side = side;
    this.color = color;
  }

  /**
   * Get the area
   * 
   * @return     returns the area of the circle
   */
  public double getArea()
  {
    return 9.365639907 * this.side * this.side;
  }

  /**
   * Get the perimeter
   * 
   * @return     returns the perimeter of the circle
   */
  public double getPerimeter()
  {
    return 11 * this.side;
  }

  /**
   * Get the color
   * 
   * @return     returns the color of the circle
   */
  public String getColor()
  {
    return this.color;
  }
}
