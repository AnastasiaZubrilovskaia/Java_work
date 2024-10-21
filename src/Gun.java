public class Gun {
    final int maxBullet;
    private int bullet;
    public Gun(int maxBullet){
        if(maxBullet < 0) throw new IllegalArgumentException(" number of bullets must be positive");
        this.maxBullet = maxBullet;
        bullet = 0;
    }
    public int getMaxBullet(){
        return maxBullet;
    }
    public int reload (int number){
        if (number < 0) throw new IllegalArgumentException("number of bullets must be positive");
        else if (number + bullet > maxBullet){
            int newNumber = number - (maxBullet - bullet);
            bullet = maxBullet;
            return newNumber;
        }
        else{
            bullet += number;
            return 0;
        }
    }
    public int unload (){
        int number = bullet;
        bullet = 0;
        return number;
    }
    public int getBullet(){
        return bullet;
    }
    public boolean isLoaded (){
        return bullet > 0;
    }

    public void  shoot(){
        if (bullet > 0){
            bullet--;
            System.out.println("Бах!");
        }else System.out.println("Клац!");
    }

}
