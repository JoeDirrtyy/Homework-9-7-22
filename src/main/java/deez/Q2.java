package deez;

public class Q2 {

    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }


    public static void main(String[] args) {
        String []names = {"a","b","c", "fff"};
        System.out.println(getSecondToLastIndex(names));
    }
}