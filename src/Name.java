public class Name {
    public  String surname;
    public String personalName;
    public String middleName;
    public Name(String surname, String personalName, String middleName){
        this.surname = surname;
        this.personalName = personalName;
        this.middleName = middleName;
    }
    public Name(String personalName){
        this.personalName = personalName;
    }
    public Name(String surname, String personalName){
        this.surname = surname;
        this.personalName = personalName;
    }
    public String toString(){
        if (surname != null && middleName == null){
            return surname + " " + personalName;
        } else if (surname == null) {
            return personalName;
        }
        return surname + " " + personalName + " " + middleName;
    }
}
