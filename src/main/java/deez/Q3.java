package deez;

public class Q3 {
    public static String getFirstElement(String[] names) {
        return names[0];
    }

    public static void main(String[] args) {
        String[] names = {"a", "b", "c", "fff"};
        System.out.println(getFirstElement(names));
    }
}
