public class Square {
    public Point leftTop;
    private int side;
    public Square(Point leftTop, int side){
        setSide(side);
        this.leftTop = leftTop;
    }
    public Square(int x, int y, int side){
        this(new Point(x,y), side);
    }

    public void setSide(int side){
        if(side <= 0) throw new IllegalArgumentException(" side must be positive");
        this.side = side;
    }
    public int getSide(){
        return side;
    }

    public  String toString(){
        return  "Квадрат в точке " + leftTop + "со стороной " + side;
    }
    public BrokenLine newBroken (){
        return new BrokenLine(leftTop,new Point(leftTop.x + side, leftTop.y) , new Point(leftTop.x + side, leftTop.y - side), new Point(leftTop.x, leftTop.y-side));
    }
}
