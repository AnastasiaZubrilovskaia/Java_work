public class House {
    public int numberOfFloors;
    public House (int numberOfFloors){
        this.numberOfFloors = numberOfFloors;
    }
    public  String toString(){
        if (numberOfFloors == 1){
            return "дом с " + numberOfFloors + " этажом";
        }
        return "дом с " + numberOfFloors + " этажами";
    }
}
