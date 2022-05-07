package src.finalTest;

/**
 * Question 2: String Compression:
 * Implement a method to perform basic string compression using
 * the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2b1c5a3.
 * If the "compressed" string would not become smaller than the original string,
 * your method should return the original string.
 * You can assume the string has only uppercase and lowercase letters (a - z).
 */

public class Problem2 {
    public static void main(String[] args) {
        String str = "aabcccccaaa";
        String str1 = "ab";
        String str2 = "aabbbcccddd";
        String str3 = "a";
        System.out.println(new SolutionTwo().compressString(str));
        System.out.println(new SolutionTwo().compressString(str1));
        System.out.println(new SolutionTwo().compressString(str2));
        System.out.println(new SolutionTwo().compressString(str3));
    }
}

class SolutionTwo{
    public String compressString(String str){
        if(str.length() <= 1) return str;
        //TODO: Write your code here
        int n = 1;
        StringBuffer result = new StringBuffer();
        int i = 0;
        for(i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == str.charAt(i + 1)){
                n = n + 1;
            }else{
                result.append(str.charAt(i));
                result.append(n);
                n = 1;
            }
        }
        if(str.charAt(str.length() - 1) == str.charAt(str.length() - 2)){
            result.append(str.charAt(i));
            result.append(n);
        }
        String result1 = result.toString();
        if(result1.length() >= str.length()) return str;
        else return result1;
    }
}
