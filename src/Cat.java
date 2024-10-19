public class Cat {
    public String name;
    public Cat(String name){
        this.name = name;
    }
    public String meow(){
        return name + ": мяу!" ;
    }
    public String meow(int count){
        String res = name + ": ";
        for (int i = 0; i < count; i++){
            res= res + "мяу";
            if (i < count-1) res= res + "-";
            else res= res + "!";
        }
        return res ;
    }
    public String toString(){
        return "кот: " + name;
    }
}