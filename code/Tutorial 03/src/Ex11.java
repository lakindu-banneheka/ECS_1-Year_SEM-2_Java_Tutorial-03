public class Ex11 {
    public static void main(String[] args) {
        String[][] names = {{"Amali","Thilina","Vihara"},{"Kamal"},{}};
        System.out.println("Seat No    |   Student");
        for(int i = 0; i < names.length; i++){
            for(int j =0; j < names[i].length; j++) {
                System.out.println((i+1)+""+(j+1)+"         |  "+ names[i][j]);
            }
        }

    }
}
