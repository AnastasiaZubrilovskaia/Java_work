public class PersonWithName {
    public Person height;
    public Name name;
    public PersonWithName (Person height, Name name){
        this.height = height;
        this.name = name;
    }
    public String toString (){
        return "Человек с именем " + name + " и ростом " + height.height;
    }
}
