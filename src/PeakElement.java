import java.util.Scanner;

public class PeakElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(-1);
            return;
        }

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peakIndex = -1;

        for (int i = 0; i < n; i++) {

            // First element
            if (i == 0) {
                if (n == 1 || arr[i] >= arr[i + 1]) {
                    peakIndex = i;
                    break;
                }
            }
            // Last element
            else if (i == n - 1) {
                if (arr[i] >= arr[i - 1]) {
                    peakIndex = i;
                    break;
                }
            }
            // Middle elements
            else {
                if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                    peakIndex = i;
                    break;
                }
            }
        }

        System.out.println(peakIndex);
    }
}
