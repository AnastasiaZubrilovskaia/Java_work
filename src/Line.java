public class Line {
    Point begin;
    Point end;

    public Line (Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }

    public String toString(){
        return "Линия от " + begin + " до " + end;
    }
}
