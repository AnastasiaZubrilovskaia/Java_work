public class Line {
    private Point begin;
    private Point end;

    public Line (int x1, int y1, int x2, int y2){
        this (new Point(x1, y1), new Point(x2, y2));
    }
    public Line (Point begin, Point end){
        setBegin(begin);
        setEnd(end);
    }
    public Point getBegin(){
        return begin;
    }
    public Point getEnd(){
        return  end;
    }
    public void setBegin(Point begin){
        this.begin = new Point(begin.x, begin.y);
    }
    public void setEnd(Point end){
        this.end = new Point(end.x, end.y);
    }

    public int distance(){
        int x = end.x - begin.x;
        int y = end.y - begin.y;
        return  (int)Math.sqrt(x*x + y*y);
    }

    public String toString(){
        return "Линия от " + begin + " до " + end;
    }
}
