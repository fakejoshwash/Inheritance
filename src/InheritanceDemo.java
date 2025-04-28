import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        /*
        Person newPerson = new Person("123456", "Josh", "Blank", "Mr.", 2005);
        Worker newWorker = new Worker(12);
        SalaryWorker newSalaryWorker = new SalaryWorker(9999);
        newWorker.setID("123457");
        newWorker.displayWeeklyPay(40);
        System.out.println(newWorker.getID());
        System.out.println(newWorker.toCSV());
        System.out.println(newWorker.toJSON());
        System.out.println(newWorker.toXML());
        System.out.println(newSalaryWorker.toCSV());
        System.out.println(newSalaryWorker.toJSON());
        System.out.println(newSalaryWorker.toXML());

         */
        Worker worker01 = new Worker(15);
        worker01.setID("000001");
        worker01.setFirstName("Jimbo");
        worker01.setLastName("Jones");
        worker01.setTitle("Mr.");
        worker01.setYOB(1990);
        Worker worker02 = new Worker(15);
        worker02.setID("000002");
        worker02.setFirstName("Jane");
        worker02.setLastName("Doe");
        worker02.setTitle("Mrs.");
        worker02.setYOB(1995);
        Worker worker03 = new Worker(15);
        worker03.setID("000003");
        worker03.setFirstName("John");
        worker03.setLastName("Awesome");
        worker03.setTitle("Mr.");
        worker03.setYOB(1990);
        SalaryWorker worker04 = new SalaryWorker(24000);
        worker04.setID("000004");
        worker04.setFirstName("Peanut");
        worker04.setLastName("Butter");
        worker04.setTitle("Mr.");
        worker04.setYOB(1990);
        SalaryWorker worker05 = new SalaryWorker(48000);
        worker05.setID("000005");
        worker05.setFirstName("Cool");
        worker05.setLastName("Guy");
        worker05.setTitle("Mr.");
        worker05.setYOB(1990);
        SalaryWorker worker06 = new SalaryWorker(12000);
        worker06.setID("000006");
        worker06.setFirstName("Hugh");
        worker06.setLastName("Neutron");
        worker06.setTitle("Mr.");
        worker06.setYOB(1980);
        workers.add(worker01);
        workers.add(worker02);
        workers.add(worker03);
        workers.add(worker04);
        workers.add(worker05);
        workers.add(worker06);

        // week 1
        System.out.println("--Week 1--");
        for (Worker worker : workers) {
            System.out.printf("%-20s%-20s%-5s\t\t$%.2f%n", worker.getID(), worker.getFirstName(), worker.getLastName(), worker.calculateWeeklyPay(40));
        }

        // week 2
        System.out.println("\n--Week 2--");
        for (Worker worker : workers) {
            System.out.printf("%-20s%-20s%-5s\t\t$%.2f%n", worker.getID(), worker.getFirstName(), worker.getLastName(), worker.calculateWeeklyPay(50));
        }

        // week 3
        System.out.println("\n--Week 3--");
        for (Worker worker : workers) {
            System.out.printf("%-20s%-20s%-5s\t\t$%.2f%n", worker.getID(), worker.getFirstName(), worker.getLastName(), worker.calculateWeeklyPay(40));
        }
    }
}
