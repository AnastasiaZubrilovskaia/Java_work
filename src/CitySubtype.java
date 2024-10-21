public class CitySubtype extends City{
    public CitySubtype (String name){
        super(name);
    }
    public CitySubtype(String name, Way... roads){
        super(name, roads);
    }
    @Override
    public void addWay(City city, int pay){
        if (!this.getWays().contains(new Way(city, pay))) {
            super.addWay(city, pay);
            if(!city.getWays().contains(new Way(this, pay))){
                city.addWay(this, pay);
            }
        }
    }
}
