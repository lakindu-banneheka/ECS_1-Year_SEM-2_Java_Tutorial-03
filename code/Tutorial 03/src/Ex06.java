public class Ex06 {
    public static void main(String args[]) {
        String original ="software";
        StringBuilder result = new StringBuilder("hi");
        int index =original.indexOf('a');// index = 5
        result.setCharAt(0, original.charAt(0)); // result = si
        result.insert(1, original.charAt(4));// result = swi
        result.append(original.substring(1, 4)); // result = swioft
        result.insert(3, (original.substring(index, index+2) + "")); // result = swiaroft
        System.out.println(result);
    }
}
