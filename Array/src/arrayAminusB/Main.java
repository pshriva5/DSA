package arrayAminusB;

import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		int[] A = {3,3,5,6,7,9};
		int[] B = {1,1,2,6,7,10,12,13};
		printComputedArrays(A, B);
	}

	private static void printComputedArrays(int[] a, int[] b) {
		// TODO Auto-generated method stub
		
		int i=0,j=0;
		ArrayList<Integer> Ad = new ArrayList<Integer>();
		ArrayList<Integer> Bd = new ArrayList<Integer>();
		while(i < a.length && j < b.length) {
			if(a[i]==b[j]) {
				i++;
				j++;
			}
			else if(a[i]<b[j]){
				Ad.add(a[i]);
				i++;	
			}
			else if (a[i]>b[j]) {
				Bd.add(b[j]);
				j++;
			}
		}
		while(i < a.length) {
			Ad.add(a[i]);
			i++;
		}
		while(j < b.length) {
			Bd.add(b[j]);
			j++;
		}
		System.out.println(Ad);
		System.out.println(Bd);
	}
}
