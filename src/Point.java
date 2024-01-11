
import java.lang.Math;
public class Point {

    private int x;
    private int y;

   public  Point(int x,int y){
       this.x=x;
       this.y=y;
   }

   public int getX(){
       return this.x;
   }

   public void setX(int x){
       this.x=x;
   }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public double distance(){

       double result;
       result=Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
       return result;
    }

    public double distance(Point p){

        double result;
        result=Math.sqrt(Math.pow(this.x- p.x,2)+Math.pow(this.y-p.y,2));
       return result;
    }

    public double distance(int x,int y){

       double result;
        result=Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
        return result;
    }

}
