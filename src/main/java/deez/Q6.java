package deez;

public class Q6 {

    public static int getSum(int[] ints) {
        int sum = 0;

        for (int x = 0; x < ints.length; x++) {
            // sum += ints[x];
            sum = sum + ints[x];
        }
        return sum;
    }


    public static void main(String[] args) {
        int []ints = {1,2,3,4};
        System.out.println(getSum(ints));

    }
}