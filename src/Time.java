public class Time {
    public int seconds;
    public int second;
    public int minutes;
    public int hours;
    public Time(int seconds){
        this.seconds = seconds%(3600*24);
    }
    public String toString(){
        hours = seconds / 3600;
        minutes = seconds % 3600 / 60;
        second = seconds % 60;
        return hours + ":" + minutes + ":" + second;
    }
}
