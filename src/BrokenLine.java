import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BrokenLine {
    public List <Point> points = new ArrayList<>();

    public BrokenLine(List<Point> points){
        this.points = points;
    }
    public BrokenLine(Point... points){
        this(Arrays.asList(points));
    }

    public void addNewPoints(Point... dots) {
        for (Point p : dots) {
            points.add(p);
        }
    }

    public double length(){
        double res = 0.0;
        for (int i = 0 ; i < points.size()-1; i++){
            res = res + new Line(points.get(i).x, points.get(i).y, points.get(i+1).x,points.get(i+1).y).distance();
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
