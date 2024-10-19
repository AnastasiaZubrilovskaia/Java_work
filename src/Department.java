import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    Worker boss;
    private List<Worker> workers;

    public Department(String name, List<Worker> workers) {
        setName(name);
        setWorkers(workers);
    }
    public Department(String name){
        this(name, null);
    }

    public String getName() {
        return name;
    }

    public List<Worker> getWorkers() {
        return new ArrayList<>(workers);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = new ArrayList<>(workers);
    }

    public void addEmployee(Worker worker){
        if (worker == null) return;
        if (worker.getDepartment() != this) return;
        worker.setDepartment(this);
        this.workers.add(worker);
    }

    public void removeEmployee(Worker worker){
        if (worker == null) return;
        if (!workers.contains(worker)) return;;
        if (boss == worker) boss = null;
        workers.remove(worker);
        worker.setDepartment(null);
    }

    public String toString(){
        String res = "department " + name + " with workers " + workers;
        if (boss == null){
            return res + " without boss";
        }
        return res + " boss is " + boss.getName();
    }



//    private String name;
//    private Worker boss;
//    private List <Worker> workers = new ArrayList<>();
//
//    public Department (String name){
//        setName(name);
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setBoss(Worker worker){
//        this.boss = worker;
//        worker.setDepartment(boss.getDepartment());
//        workers.add(boss);
//    }
//    public Worker getBoss(){
//        return boss;
//    }
//    public void isWorker (Worker worker){
//        if (!workers.contains(worker) && worker.getDepartment().getName() == name){
//            workers.add(worker);
//        }
//    }
////    public void removeWorker (Worker worker){
////        workers.remove(worker);
////    }
//    public String toString(){
//        String res = "department " + name;
//        if (boss == null){
//            return res + " without boss";
//        }
//        return res + " boss is " + boss.getName();
//    }
//    public String getWorkers(){
//        String res =  name + ": ";
//        int count = 0;
//        for (Worker x : workers){
//            res = res + x.getName();
//            count++;
//            if (count < workers.size()) res = res + ",";
//        }
//        return  res;
//    }
}
