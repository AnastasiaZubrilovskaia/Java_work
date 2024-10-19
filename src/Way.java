public class Way {
    private City city;
    private int pay;
    public Way (City city, int pay){
        this.pay = pay;
        this.city = city;
    }
    public City getCity(){
        return city;
    }
    public int getPay(int pay){
        return pay;
    }
    public String toString(){
        return city.getName() + " : " + pay + " руб";
    }
}
