import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
            
        }
        scanner.close();
    }
}
