//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Stack stack1 = new Stack(10);
//        stack1.push(12);
//        stack1.push(11);
//        System.out.println(stack1.toString());
//        System.out.println(stack1.pop());
//        Department department= new Department("VrLab");
//        System.out.println(department);
//        Worker worker = new Worker("Korolev");
//        department.boss = worker;
//        worker.department = department;
//        System.out.println(department);
//        System.out.println(worker);
        // number 1.1.1
        System.out.println("1.1.1:");
        Point a = new Point(13,45);
        Point b = new Point(45,60);
        Point c = new Point(11,20);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // number 1.1.2
        System.out.println("1.1.2:");
        Person person1 = new Person("Клеопатра", 152);
        Person person2 = new Person("Пушкин", 167);
        Person person3 = new Person("Владимир", 189);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        // number 1.1.3
        System.out.println("1.1.3:");
        Name name1 = new Name("Клеопатра");
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич" );
        Name name3 = new Name("Маяковский","Владимир");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        // number 1.1.4
        System.out.println("1.1.4:");
        Time time1 = new Time (10);
        Time time2 = new Time (10000);
        Time time3 = new Time (100000);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        // number 1.1.5
        System.out.println("1.1.5:");
        House house1 = new House(1);
        House house2 = new House(5);
        House house3 = new House(23);
        System.out.println(house1);
        System.out.println(house2);
        System.out.println(house3);
        //number 1.2.1
        System.out.println("1.2.1:");
        Point A = new Point(1,3);
        Point B = new Point(23,8);
        Point C = new Point(5,10);
        Point D = new Point(25,10);
        Line line1 = new Line(A, B);
        Line line2 = new Line(C, D);
        Line line3 = new Line (line1.begin, line2.end);
        System.out.println("1)" + line1);
        System.out.println("2)" + line2);
        System.out.println("3)" + line3);
        A.x=12;
        A.y=122;
        D.x=1;
        D.y=14;
        System.out.println("4)" + line1);
        System.out.println(line2);
        System.out.println(line3);
        Point X = new Point(100,100);
        Point Y = new Point(250,150);
        line1 = new Line (X,Y);
        System.out.println("5)" + line1);
        System.out.println(line2);
        System.out.println(line3);
        //number 1.2.2
        System.out.println("1.2.2:");
        PersonWithName person4 = new PersonWithName(person1, name1);
        PersonWithName person5 = new PersonWithName(person2, name2);
        PersonWithName person6 = new PersonWithName(person3, name3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);
        //number 1.2.3
        System.out.println("1.2.3:");
        Name name7 = new Name("Чудов", "Иван");
        Name name8 = new Name("Чудов", "Петр" );
        Name name9 = new Name("Борис");
        PersonWithName person7 = new PersonWithName(person1, name7);
        PersonWithName person8 = new PersonWithName(person2, name8);
        PersonWithName person9 = new PersonWithName(person3, name9);
        PersonWithParents people1 = new PersonWithParents(person8, person7);
        PersonWithParents people2 = new PersonWithParents(person9, person8);
        System.out.println(people1);
        System.out.println(people2);
        System.out.println(person7.name);
        //1.2.4
        System.out.println("1.2.4:");
        Worker worker2 = new Worker("Петров");
        Worker worker3 = new Worker("Козлов");
        Worker worker4 = new Worker("Сидоров");
        Department department1 = new Department("IT");
        worker2.department = department1;
        worker3.department = department1;
        worker4.department = department1;
        department1.boss = worker3;
        System.out.println(worker2);
        System.out.println(worker3);
        System.out.println(worker4);

    }
}