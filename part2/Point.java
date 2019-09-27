import java.lang.Math;
public class Point
{
   private double x;
   private double y;

   public Point(double x, double y) {
      this.x = x;
      this.y = y;
   }

   public double getX() { return x; }
   public double getY() { return y; }
   public double getRadius() {
      return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
   }
   
   public static void main(String[] args) {
   
      Point p1 = new Point(1, 1);

      System.out.println(p1.getRadius());
   }
}
   