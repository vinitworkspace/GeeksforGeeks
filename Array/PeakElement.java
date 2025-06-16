import java.util.Scanner;

class PeakElement {

    public static int peakElement(int[] arr, int n) {
        boolean flag = false;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        peakElement(arr, n);
    }

}