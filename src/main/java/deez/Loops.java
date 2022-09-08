package deez;
public class Loops {

    //Q1
    public static int getLastIndex(String[] names) {
        return  names.length - 1;
    }


    public static void main(String[] args) {
        String []names = {"a","b","c", "fff"};
        System.out.println( getLastIndex(names));
    }
}



