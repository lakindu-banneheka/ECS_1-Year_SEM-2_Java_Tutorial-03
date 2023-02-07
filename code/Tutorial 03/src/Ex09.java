public class Ex09 {
    public static void main(String[] args) {
        int[] Num = {40,28,10,81,23,45,47,18,76,64};
        int sum = 0;

        for(int i = 0; i < Num.length; i++){
            System.out.print(Num[i] + ", ");
            sum += Num[i];
        }

        System.out.println("Using For each: ");
        for (int number: Num) {
            System.out.print(number + ", ");
        }
        System.out.println("\nSum: " + sum);

    }
}
