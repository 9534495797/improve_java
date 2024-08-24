package improve_java;
import java.util.*;
public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int sum=1;
        while(num>0){
            int rem=num%10;
            sum+=num;;
num/=10;
rev=rev*10+rem;
        }
        System.out.println(rev);
    }
}