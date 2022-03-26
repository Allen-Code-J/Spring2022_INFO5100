

package src.midterm;

public class Question2 {
    /**
     * difference between abstract class and interface
     *
     * 1.abstract class: "is a" relation class(mostly describe something's natual thing)
     *   interface: "has a" relation with class(mostly describe something's functions)
     *
     * 2.abstract class:could realize some methods
     *   interface: totally abstract, do not realize any methods
     *
     * 3.abstract class: son-class realize it in "extends"
     *    interface: use implements
     *
     * 4.abstract class:could have constructors
     *   interface: no constructors
     *
     * 5.abstract class: could have main method
     *  interface: could not have main method
     *
     * 6.abstract class: faster than interface
     *  interface:slower than abstract class
     */
    public static void main(String[] args) {
        alarmDoor door1 = new alarmDoor();
        door1.alarm();
        door1.close();
        door1.open();
    }
}

interface alarm{
    public void alarm();
        }

abstract class Door {
    public void open() {
        System.out.println("open the door");
    }

    public void close() {
        System.out.println("close the door");
    }

}

class alarmDoor extends Door implements alarm {
    public alarmDoor() {
    }

    public void open() {
        //....
    }

    public void close() {
        //....
    }

    public void alarm() {
        System.out.println("shout alarm");
    }
}




