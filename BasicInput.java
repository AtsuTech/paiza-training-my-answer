import java.util.Scanner;


public class BasicInput {

    public static void main(String[] args) {

        //ex.1
        Scanner sc = new Scanner(System.in);

        String data[][] = new String[1000][];

        int i = 0;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            data[i]=line.split(" ");
            i++;
        }    
        
        for(String d[]:data){
            for(String x:d){
                System.out.println(x);
            }
        }  
    }

}
