package src.Assignment3;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void subscribe(SeattlePoliceDepartment seattlePoliceDepartment) {
        if (!seattlePoliceDepartment.people.contains(this)) {
            seattlePoliceDepartment.people.add(this);
        }
    }
    public void unsubscribe(SeattlePoliceDepartment seattlePoliceDepartment) {
        seattlePoliceDepartment.people.remove(this);
    }

    public void getNotification(SeattlePoliceDepartment seattlePoliceDepartment) {
        System.out.println("**********");

        System.out.println("Message from: " + seattlePoliceDepartment.getDepartmentName());
        System.out.println("Person Name: " + this.getName());
        System.out.println("News title:" + seattlePoliceDepartment.news);
        System.out.println("**********");
    }






}
