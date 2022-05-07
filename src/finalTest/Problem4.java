package src.finalTest;

public class Problem4 {
    public static void main(String[] args) {
        int n = 12;

        int[] result = new SolutionFour().sumZero(n);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}

class SolutionFour {
    public int[] sumZero(int n) {
        int[] result = new int[n];

        int num = 1;
        if(n % 2 == 0){
            for(int i = 0; i < n; i = i + 2){
                result[i] = num;
                result[i+1] = -num;
                num++;
            }
        }else if(n % 2 != 0){
            for(int j = 1; j < n; j = j + 2){
                result[j] = num;
                result[j+1] = -num;
                num++;
            }
            result[0] = 0;
        }
        return result;
    }
}