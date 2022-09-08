package deez;

public class Q9 {
    public static String extractAllEvenNumbers(int[] numbers) {
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i]%2==0){
                    return String.valueOf((numbers[i]));
                }
            }
            return "there are even numbers";
        }

        public static void main(String[] args) {
            int[] ints = {1, 2, 3, 4};
            System.out.println(extractAllEvenNumbers(ints));
        }
    }

