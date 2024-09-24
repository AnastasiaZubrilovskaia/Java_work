public class Time {
    public int seconds;
    public int second;
    public int minutes;
    public int hours;
    public Time(int seconds){
        this.seconds = seconds%(3600*24);
    }
    public String toString(){
        String res = "";
        hours = seconds / 3600;
        if (hours/10 == 0) res = res + "0" + hours + ":";
        else res = res +  hours + ":";
        minutes = seconds % 3600 / 60;
        if (minutes/10 == 0) res = res + "0" +  minutes + ":";
        else res = res +  minutes + ":";
        second = seconds % 60;
        if (second/10 == 0) res = res + "0" + second;
        else res = res +  second;

        return res;
    }
}
