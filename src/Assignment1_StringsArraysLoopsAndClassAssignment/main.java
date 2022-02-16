package Assignment1_StringsArraysLoopsAndClassAssignment;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        String str = "abba";
        //Question1
        System.out.println("Question1:");
        System.out.println(new isPalindrome().isPalindrome(str));
        //Question2
        System.out.println("Question2:");
        System.out.println(new isHasAllUniqueCharacters().isHasAllUniqueCharacters(str));
        //Question3
        System.out.println("Question3:");
        System.out.println(new ifStringContainsDuplicates().ifStringContainsDuplicates(str));
        //Question4
        String str1 = "baab";
        System.out.println("Question4:");
        System.out.println(new isAnagrams().isAnagrams(str, str1));
        //Question5
        int num = 2022;
        System.out.println("Question5:");
        System.out.println(new isLeapYear().isLeapYear(num));
        //Question6
        System.out.println("Question6:");
        int calls = 250;
        System.out.println(new telephoneBills().telephoneBills(calls));

        //Question7
        System.out.println("Question7:");
        String ransomNote = "abc";
        String Magazine = "aabbbccc";
        System.out.println(new ransomNoteAndMagazine().ransomNoteAndMagazine(ransomNote, Magazine));
        //Question8
        System.out.println("Question8");
        char ch = 'A';
        new Grade().Grade(ch);
        //Question10
        System.out.println("Question10:");
        double width = 10;
        double height = 10;
        double depth = 10;
        System.out.println(new Box().volume(width,height,depth));

    }

}

//Question1
class isPalindrome {
    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            } else {
                left = left + 1;
                right = right - 1;
            }
        }
        return true;
    }
}

//Question2
class isHasAllUniqueCharacters {
    public boolean isHasAllUniqueCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}

//Question3
class ifStringContainsDuplicates {
    public boolean ifStringContainsDuplicates(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}

//Question4
class isAnagrams {
    public boolean isAnagrams(String str1, String str2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < str1.length(); i++) {
            char ch = str2.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        return map1.equals(map2);
    }
}

//Question5
class isLeapYear {
    public boolean isLeapYear(int num) {
        if (num % 100 == 0) {
            if (num % 400 == 0) {
                return true;
            }
        } else {
            if (num % 4 == 0) {
                return true;
            }
        }
        return false;
    }
}

//Question6
class telephoneBills {
    public double telephoneBills(int calls) {
        double bills;
        switch (calls / 100) {
            case 0:
                return 200;

            case 1:
                if(calls <= 150){
                    return 200+(calls-100)*0.6;
                }else{
                    return 200 + 50*0.6+(calls-150)*0.5;
                }

            default:
                return 200 + 50*0.6+50*0.5+(calls-200)*0.4;
        }
    }

}


//Question7
class ransomNoteAndMagazine {
    public boolean ransomNoteAndMagazine(String ransomNote, String Magazine) {
        Map<Character, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < Magazine.length(); i++) {
            char ch = Magazine.charAt(i);
            hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            hashmap.put(ch, hashmap.getOrDefault(ch, 0) - 1);
        }
        for (char key : hashmap.keySet()) {
            if (hashmap.get(key) < 0) {
                return false;
            }
        }
        return true;
    }
}

//Question 8
class Grade {
    public void Grade(char ch) {
        switch (ch) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Deficient");
                break;
            case 'E':
                System.out.println("Failing");
        }
    }
}

//Question9
class Book {
    String name;
    int bookID;
    String genres;
    double price;


    public Book() {
    }

    public Book(String name, int bookID, String genres, double price) {
        this.name = name;
        this.bookID = bookID;
        this.genres = genres;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}

//Question10
class Box {
    double width;
    double height;
    double depth;

    public Box() {
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    public double volume(double width, double height, double depth) {
        double volume = width * height * depth;
        return volume;
    }

}