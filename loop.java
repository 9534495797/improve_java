package improve_java;

public class loop {
    public static void main(String[] args) {
        
    
    for(int i=0;i<=5;i++){
        System.out.println(i);
    }

    for(int i = 0; i <= 10; i++) {
        for(int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println(); // Move to the next line after printing `i` asterisks
    }
    //while loop
    int i=10;
    while(i>0){
        System.out.println(i);
        i--;
    }
}
}