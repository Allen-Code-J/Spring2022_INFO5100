package src.midterm;

public class Question3 {
    public static void main(String[] args) {
        Moody moody1 = new Moody() {
            @Override
            void ExpressFeelings() {
                System.out.println("heeehee....hahahah...HAHAHA!!");
            }
        };
        Moody moody2 = new Moody() {
            @Override
            void ExpressFeelings() {
                System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob’");
            }
        };
        Psychiatrist psychiatrist = new Psychiatrist();
        //moody1
        psychiatrist.examine(moody1);
        moody1.queryMood("Happy");
        moody1.ExpressFeelings();


        //moody2
        psychiatrist.examine(moody1);
        moody1.queryMood("Sad");
        moody1.ExpressFeelings();
        System.out.println(psychiatrist.toString(moody1.getMood("Sad")));
    }

}


// Return the mood : sad or happy – depending on which object sends the message
abstract class Moody {
    public Moody() {
    }

    public String getMood(String mood) {
        return mood;
    }

    // Each Object expresses a different motion
    abstract void ExpressFeelings();


    //an object responds according to how it feels, print ”I feel Happy(or Sad) today!!”
    public void queryMood(String mood) {
        System.out.println("I feel "+ mood +"today!!");
    }
}

abstract class Sad extends Moody {

    public String getMood() {
        String mood = "Sad";
        return mood;
    }

    // Each Object expresses a different motion
    @Override
    void ExpressFeelings() {
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob’");
    }

    //an object responds according to how it feels, print ”I feel Happy(or Sad) today!!”
    //returns message about self : “Subject cries a lot”
    public String toString() {
        return "Subject cries a lot";
    }
    public void queryMood() {
        System.out.println("I feel sad today!!");
    }
}

abstract class Happy extends Moody {

    public String getMood(String mood) {
        mood = "Happy";
        return mood;
    }

    // Each Object expresses a different motion
    @Override
    void ExpressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    //an object responds according to how it feels, print ”I feel Happy(or Sad) today!!”
    //returns message about self : “Subject cries a lot”
    public String toString() {
        return "Subject laughs a lot";
    }
    public void queryMood() {
        System.out.println("I feel happy today!!");
    }
}

class Psychiatrist {
    //asks moody object about its mood
    public void examine(Moody moodyObject) {
        System.out.println("How are you feeling today?");
    }

    //a moodyObject is observed to either laugh or cry
    public void observe(Moody moodyObject) {
        System.out.println("How are you feeling today?");
    }

    //returns message about self: “Subject laughs a lot”
    public String toString(String mood) {
        if (mood == "Happy") return "Observation: Subject laughs a lot";
        if (mood == "Sad") return "Observation: Subject cries a lot";
        return "Error";
    }
}