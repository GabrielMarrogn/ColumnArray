import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double[][] arr = new double[12][12];

        int column = Integer.parseInt(br.readLine());
        String calc = br.readLine();

        for(int i = 0; i < arr.length; i++){
            for(int k = 0; k < arr[i].length; k++){
                double a = Double.parseDouble(br.readLine());
                arr[i][k] = a;
            }
        }

        if(calc.equals("S")){
            double soma = 0;
            DecimalFormat decimal = new DecimalFormat("0.0");
            for(int i = 0; i < arr.length; i++){
                soma += arr[i][column];
            }
            System.out.println(decimal.format(soma));
        }
        else if(calc.equals("M")){
            double media = 0;
            DecimalFormat decimal = new DecimalFormat("0.0");
            for(int i = 0; i < arr.length; i++){
                media += arr[i][column];
            }
            media = media/12;
            System.out.println(decimal.format(media));
        }
    }
}
