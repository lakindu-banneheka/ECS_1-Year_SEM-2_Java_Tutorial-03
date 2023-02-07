public class Ex10 {
    public static void main(String[] args) {
        double [] [] weights = {{54.5, 50, 48}, {43, 56.5, 67, 65.5,59}, {45, 55, 63, 45.5, 54.5}, {66, 49.5,
                56}};
        double sum = 0;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < weights[i].length; j++) {
                sum += weights[i][j];
            }
            System.out.println("avg "+ i + " : " + sum/weights[i].length);
            sum =0;

        }

    }
}
