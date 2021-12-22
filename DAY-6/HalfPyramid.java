import java.util.Scanner;
public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();
        printpattern(rows);
    }
    public static void printpattern(int rows) {
        for(int i=1; i<=rows; ++i) {
            for(int j=1; j<=i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}