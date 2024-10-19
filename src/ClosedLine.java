import java.util.List;

public class ClosedLine extends BrokenLine{
    public ClosedLine(Point ...points){
        super(points);
    }
    public ClosedLine(List<Point> points){
        super(points);
    }
    public double length(){
        return  super.length() + new Line(points.getFirst(), points.getLast()).distance();}
}