import java.util.Scanner;
public class lib {

    static int get_num(){
        Scanner iScanner = new Scanner (System.in);
        System.out.println("Введите N: ");
        int n = iScanner.nextInt();
        iScanner.close();
        return n;
        }

    
    static int triangle_num(int input_num){
        input_num = input_num*(input_num+1)/2;
        return input_num;
        }
    public static void main(String[] args) {
        
    }
    
    
}
