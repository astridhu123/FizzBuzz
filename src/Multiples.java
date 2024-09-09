public class Multiples {
    //write a main method that **prints** how many multiples of 3 or 5 there are below 1000.
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i < 1000; i++) {
            boolean multipleOf3 = (i % 3 == 0);
            boolean multipleOf5 = (i % 5 == 0);

            if (multipleOf3 || multipleOf5) {
                count++;
            }
        }
        System.out.println(count);
    }
}





