package deez;

public class Q7 {
    public static int getAverage(int[] ints) {
        int average = 0;

        for (int x = 0; x < ints.length; x++) {
            average = average + ints[x];
        }

        return average / ints.length;

    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4};
       System.out.println(getAverage(ints));
    }
}
