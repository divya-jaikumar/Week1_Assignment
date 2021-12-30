package week1.assignment;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,5,8};
		Arrays.sort(arr);
		int i=0;
		for ( i = 0; i < arr.length; i++) {
			if(arr[i]!=i+1) {
				break;
			}
			else {
				continue;
			}
			
		}
		System.out.println("the missing element is"+" "+(i+1));
	}

}
