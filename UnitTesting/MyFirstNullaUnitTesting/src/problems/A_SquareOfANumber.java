


package problems;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class A_SquareOfANumber {
    public static void main(String[]args) throws FileNotFoundException{
        
        Scanner sc = new Scanner(new File("src/TestCases/A3.in"));
         
        int TestCases = sc.nextInt();
        while(TestCases > 0){
        int num = sc.nextInt();
        if(num<0){
            System.out.println("INVALID");
        }
        else if(num<1000){
            System.out.println(square(num));
        }
        else{
            System.out.println("TOO BIG");
        }
        
        
        TestCases--;
        
        }
        
        
    }
    public static int square(int num){
        return num*num;
    }
   
}
