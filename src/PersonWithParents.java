public class PersonWithParents {
    PersonWithName son;
    PersonWithName father;
    public PersonWithParents (PersonWithName son, PersonWithName father){
        this.son = son;
        this.father = father;
    }
    public String toString(){
        if (son.name.surname == null && father.name.surname != null){
            son.name.surname = father.name.surname;
        }
        if (son.name.middleName == null && father.name.personalName != null){
            son.name.middleName = father.name.personalName + "ович";
        }
        return son.name + " ";
    }
}
