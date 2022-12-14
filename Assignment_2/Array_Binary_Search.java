package Assignment_2;
import java.util.*;
public class Array_Binary_Search {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i<arr.length;i++){
          arr[i] = sc.nextInt();
        }
        int item = sc.nextInt();
        System.out.println(Search(arr, item));

	}

	public static int Search(int []arr,int item) {

		int lo=0;
        int hi =arr.length-1;

		while(lo<=hi) {

			int mid=(lo+hi)/2;

			if(arr[mid]==item) {
				return mid;
			}

			else if(arr[mid]>item) {
				hi=mid-1;
			}

			else {
				lo=mid+1;
			}
		}

		return -1;
    }
}