//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Stack stack1 = new Stack(10);
//        stack1.push(12);
//        stack1.push(11);
//        System.out.println(stack1.toString());
//        System.out.println(stack1.pop());
        Department department= new Department("VrLab");
        System.out.println(department);
        Worker worker = new Worker("Korolev");
        department.boss = worker;
        System.out.println(department);
        System.out.println(worker);
        // number 1.1.1
        System.out.println("1.1.1:");
        Point a = new Point(13,45);
        Point b = new Point(45,60);
        Point c = new Point(11,20);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        // number 1.1.2
        System.out.println("1.1.2:");
        Person person1 = new Person("Клеопатра", 152);
        Person person2 = new Person("Пушкин", 167);
        Person person3 = new Person("Владимир", 189);
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        // number 1.1.3
        System.out.println("1.1.3:");
        Name name1 = new Name("Клеопатра");
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич" );
        Name name3 = new Name("Маяковский","Владимир");
        System.out.println(name1.toString());
        System.out.println(name2.toString());
        System.out.println(name3.toString());
        // number 1.1.4
        System.out.println("1.1.4:");
        Time time1 = new Time (10);
        Time time2 = new Time (10000);
        Time time3 = new Time (100000);
        System.out.println(time1.toString());
        System.out.println(time2.toString());
        System.out.println(time3.toString());
        // number 1.1.5
        System.out.println("1.1.5:");
        House house1 = new House(1);
        House house2 = new House(5);
        House house3 = new House(23);
        System.out.println(house1.toString());
        System.out.println(house2.toString());
        System.out.println(house3.toString());
        //number 1.2.1
        System.out.println("1.2.1:");
        Point A = new Point(1,3);
        Point B = new Point(23,8);
        Point C = new Point(5,10);
        Point D = new Point(25,10);
        Line line1 = new Line(A, B);
        Line line2 = new Line(C, D);
        Line line3 = new Line (line1.begin, line2.end);
        System.out.println(line1.toString());
        System.out.println(line2.toString());
        System.out.println(line3.toString());
        A.x=12;
        A.y=122;
        D.x=1;
        D.y=14;
        System.out.println(line1.toString());
        System.out.println(line2.toString());
        System.out.println(line3.toString());
        //number 1.2.2
        System.out.println("1.2.2:");
        PersonWithName person4 = new PersonWithName(person1, name1);
        PersonWithName person5 = new PersonWithName(person2, name2);
        PersonWithName person6 = new PersonWithName(person3, name3);
        System.out.println(person4.toString());
        System.out.println(person5.toString());
        System.out.println(person6.toString());
    }
}