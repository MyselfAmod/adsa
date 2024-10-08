import java.util.*;
public class array {
    public static void main(String[] args) {
        //int marks[]= {70,60,65};
        //marks[0] = 70;
        //marks[1] = 60;
       // marks[2] = 80;
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int numbers[] = new int[size];
       //input
       for(int i =0; i<size;i++){
        numbers[i] = sc.nextInt();
       }
       int x = sc.nextInt();
       //output 
       for(int i =0; i<size; i++){
            if(numbers[i]==x){
                System.out.println("x found" + i );

            }
           // System.out.println(numbers[i]);
        }


    }
    
}
