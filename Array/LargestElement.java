
// Given an array arr[]. The task is to find the largest element and return it.
// Examples:
// Input: arr[] = [1, 8, 7, 56, 90]
// Output: 90
// Explanation: The largest element of the given array is 90.
import java.util.Scanner;

public class LargestElement {
    public static void largestElement(int []arr,int ele) {

        int largest = arr[0];
        for(int i=0;i<ele;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("Largest Element Is: "+largest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number Of Elements: ");
        int ele = sc.nextInt();
        int []arr= new int[ele];

        for(int i=0;i<ele;i++)
        {
            arr[i]=sc.nextInt(); // [1, 8, 7, 56, 90].
        }
        largestElement(arr,ele);
    }

}
