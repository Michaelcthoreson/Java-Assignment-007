/**
 * @author Michael Thoreson
 * @author Trevor Hartman
 * @since 1.0
 */

import java.util.Scanner;

public class MyMath {
    /**
     * implementation of Euclid's Algorithm for finding GCF
     * @param numerator
     * @param denominator
     * @return Vector3 (Reduced numerator, reduced denominator, GCF)
     */
    public static int[] gcfMethod(int numerator, int denominator){
    int a = numerator;
    int b = denominator;
    int c = 0;
    int bOld = 0;
    while(b != 0){
        bOld = b;
        if (a > b){
            c = a%b;
            a= b;
            b = c;
        } else {
            c = b % a;
        }
    }
    int reducedN = numerator / bOld;
    int reducedD = denominator / bOld;
    int[] numDenom = {reducedN,reducedD, bOld};
            return numDenom;
    }
    public static void main(String[] args) {
        Scanner scandalous = new Scanner(System.in);
        System.out.println("Enter the numerator:");
        int inNum = scandalous.nextInt();
        System.out.println("Enter the denominator:");
        int inDenom = scandalous.nextInt();
        int[] gcfOutputMemory = gcfMethod(inNum, inDenom);
        System.out.printf("The reduced form is %d/%d. the GCF is %d.",gcfOutputMemory[0],gcfOutputMemory[1],gcfOutputMemory[2]);

    }
}
