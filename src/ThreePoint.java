public class ThreePoint extends Point{
    public int z;
    public ThreePoint(int x, int y, int z){
        super(x,y);
        this.z = z;
    }
    @Override
    public String toString(){
        return "{" + x + ";" + y + ";" + z +"}";
    }
}
