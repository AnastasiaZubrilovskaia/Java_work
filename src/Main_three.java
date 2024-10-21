public class Main_three {
    public static void main (String[] args){
//        CitySubtype city1 = new CitySubtype("Saratov");
//        CitySubtype city2 = new CitySubtype("Moscow");
//        CitySubtype city3 = new CitySubtype("Piter");
//        city1.addWay(city2, 345);
//        city1.addWay(city3,800);
//        System.out.println(city1);
//        System.out.println(city2);
//        System.out.println(city3);
        Pistol gun1 = new Pistol(10, 2);
        gun1.reload(9);
        gun1.shoot();
        gun1.shoot();
        gun1.shoot();
        gun1.shoot();
        gun1.shoot();
        Pistol gun2 = new Pistol(10, 2);
        gun2.reload(9);
        System.out.println("2");
        gun2.shootN(2);
        System.out.println("1");
        gun2.shoot();
        System.out.println("1");
        gun2.shoot();
        System.out.println("1");
        gun2.shoot();

    }
}
