import java.util.Scanner;
public class Solution {
    public static void getSecondLargest(int[] arr,int ele) {
        
        int Largest = 0;
        int SecondLargest = 0;
        
        for(int i=0;i<ele;i++)
        {
            if(arr[i]>Largest)
            {
                SecondLargest = Largest;
                Largest = arr[i];
            }
            else if (arr[i]>SecondLargest && arr[i]!=Largest) {
                SecondLargest = arr[i];
            }
        }
        System.out.println(SecondLargest);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements in array: ");
        int ele = sc.nextInt();
        int []arr = new int[ele];
        
        for(int i=0;i<ele;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        getSecondLargest(arr,ele);
    }
}