

import java.util.*;

class test{
	
	public static int binarySearch(int arr[],int x){
		
		int l=0;
		int r=arr.length;
		int mid=0;
		while(l<=r){
			mid=l+(r-l)/2;

			if(arr[mid]==x)
				return mid;

			else if(x>arr[mid])
				l=mid+1;

			else
				r=mid-1;

		}

		return -1;
	}
	

	public static void main(String args[]){
		
		int arr[]={2,3,4,10,45,50};

		int res=binarySearch(arr,45);
		if(res==-1){
			
			System.out.println("no element found");
	
		}
		else{
			System.out.println("element found at index "+" "+res+" "+arr[res]);

			

		}

	}


}
