public class EX03 {
    public static void main(String args[]) {
        String fullName = "Banneheka Mudiyanselage Lakindu Banula Sirimewan Banneheka";
        String[] myName = fullName.split(" ");
        for (int i = 0; i < myName.length; i++) {
            String s = myName[i];
            System.out.print(s.charAt(0)+ " ");
        }
    }
}
