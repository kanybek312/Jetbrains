/**
 Write a program that reads an array of integers and an integer. The program must check if the array contains that number.
 Input data format
 The first line: the size of an array.
 The second line: all the elements of the array separated by the space.
 The third line: one integer.
 Output data format
 Only a single value: true or false. **/
package Arrays;
import java.util.Scanner;
public class ArrayContainN {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int [] second = new int [first];
        int count = 0;
        boolean check = false;
        for (int i = 0; i < first; i++){
            second[i] = sc.nextInt();
        }
        int third = sc.nextInt();
        for (int j = 0; j < second.length; j++) {
            if (second[j] == third) {
                System.out.println("true");
                break;
            }
            count++;
        }
        if (count == first) {
            System.out.println("false");
        }
    }
}
