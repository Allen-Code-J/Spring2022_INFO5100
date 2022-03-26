package src.Assignment3;

public class Main {
    public static void main(String[] args) {
        SeattlePoliceDepartment seattlePoliceDepartment = new SeattlePoliceDepartment("SeattlePoliceDepartment");
        Person p1 = new Person("Tom", 25);
        Person p2 = new Person("Bill", 30);
        Person p3 = new Person("Candy", 35);
        Person p4 = new Person("Tim", 40);

        p1.subscribe(seattlePoliceDepartment);
        p2.subscribe(seattlePoliceDepartment);
        p3.subscribe(seattlePoliceDepartment);
        p4.subscribe(seattlePoliceDepartment);

        seattlePoliceDepartment.NotifyCitizens("First News");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p3.unsubscribe(seattlePoliceDepartment);
        p4.unsubscribe(seattlePoliceDepartment);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        seattlePoliceDepartment.NotifyCitizens("Second News");

    }
}
