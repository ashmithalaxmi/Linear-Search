import java.util.Scanner;

public class LinearSearch {
    public  static  int findOccurrence(int n, int[] arr, int b){
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==b){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] asrgs) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int b = scanner.nextInt();
        int count = findOccurrence(n, arr, b);
        System.out.println(count);
    }
}
