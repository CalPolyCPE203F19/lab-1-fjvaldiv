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
   public double getAngle() {
      double val = y/x; 
      double amount = Math.atan(val);
      if (x < 0) {
         amount = amount + Math.PI;
      }
      return amount;
   }
   public Point rotate90() {
      double newX = -y;
      double newY = x;
      return new Point(newX, newY);
   }
}
   
