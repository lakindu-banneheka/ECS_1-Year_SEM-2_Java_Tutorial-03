public class Ex08 {
    public static void main(String[] args) {
        String str = "I'm a JaVa PrOgRaMmEr";
        int mCount = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'm' || str.charAt(i) == 'M') {
                if (mCount >= 3) {
                    System.out.print(str.charAt(i));
                }
                mCount++;

            } else {
                System.out.print(str.charAt(i));
            }
        }
    }
}
