public class Ex04 {
    public static void main(String args[]) {
        // method 1
        String str = "Sample Text";
        for (int i = str.length(); i > 0; i--) {
            System.out.print(str.charAt(i-1));
        }
        System.out.println("");
        // 2 method
        StringBuffer str1 = new StringBuffer("sample Text");
        System.out.println(str1.reverse());
    }
}
