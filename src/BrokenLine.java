import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BrokenLine {
    public List <Point> points = new ArrayList<>();

    public BrokenLine(List<Point> points){
        this.points = points;
    }
    public BrokenLine(Point... points){
        for (Point x: points) this.points.add(x);
    }

    public void addNewPoints(Point... dots) {
        for (Point p : dots) {
            points.add(p);
        }
    }

    public double length(){
        double res = 0.0;
        for (int i = 0 ; i < points.size()-1; i++){
            res = res + Math.sqrt(Math.pow(points.get(i+1).x - points.get(i).x, 2) + Math.pow(points.get(i+1).y - points.get(i).y, 2));
        }
        return res;
    }

    public String toString (){
        int count = 0 ;
        String res = "Линия [";
        for (Point x: points){
            res = res + " " + x;
            count++;
            if (count < points.size()) res = res + ",";
        }
        return res + "]";
    }
}
