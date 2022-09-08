package deez;

public class Q10 {
    public static boolean contains(String[] names, String element) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] == element) {
                return true;
            }

        }
        return false;
    }


    public static void main(String[] args) {
        String[] names = {"a", "b", "c", "fff"};
        System.out.println(contains(names, "c"));
    }
}

