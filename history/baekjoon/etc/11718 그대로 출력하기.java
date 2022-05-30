import java.util.Scanner;
public class Main{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
            String in = "";
            while(input.hasNextLine()){
                in = input.nextLine();
                System.out.println(in);
            }
            input.close();
    }
}