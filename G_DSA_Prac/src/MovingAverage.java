import java.util.*;
import java.lang.*;
import java.io.*;

class MovingAverage {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    int avg = 0;
        int lastsum = 0;
	    for (int i=0; i<tc; i++){
	        int len = sc.nextInt();
	        int[] arr = new int[len];
			lastsum = 0;
	        for(int j=0;j<len;j++){
	           arr[j]=sc.nextInt();
	           lastsum = lastsum + arr[j];
	           avg = lastsum/(j+1);
	           System.out.print(avg + " ");   
	        }
	        System.out.println();
	    }
	    
		
	}
	}


