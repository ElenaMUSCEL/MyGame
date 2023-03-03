package class9;

public class Solution{
    public static void main(String[] args) {
        int[]array ={1,1,2};
        System.out.println(Solution.stray(array));
    }

    static int stray(int[] numbers){
        int numberToReturn = 0;
        for(int index = 1; index < numbers.length - 1; index++){
            if(numbers[index - 1] == numbers [index] ){
                numberToReturn = numbers [index];
            }
        }
        return numberToReturn;
    }
}
