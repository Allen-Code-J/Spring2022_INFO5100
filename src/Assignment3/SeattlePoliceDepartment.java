package src.Assignment3;

import java.util.ArrayList;

public class SeattlePoliceDepartment {

    String SeattlePoliceDepartment;
    String news;
    ArrayList<Person> people;

    public String getDepartmentName() {
        return SeattlePoliceDepartment;
    }

    public void setDepartmentName(String SeattlePoliceDepartment) {
        this.SeattlePoliceDepartment = SeattlePoliceDepartment;
    }

    public String getNewsName() {
        return news;
    }

    public void setNewsName(String newsName) {
        this.news = news;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public void NotifyCitizens(String news) {
        this.news = news;
        for (Person person : people) {
            person.getNotification(this);
        }
    }

    public SeattlePoliceDepartment(String SeattlePoliceDepartment) {
        this.SeattlePoliceDepartment = SeattlePoliceDepartment;
        this.people = new ArrayList<>();
    }


}
