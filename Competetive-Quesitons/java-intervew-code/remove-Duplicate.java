

import java.util.*;

class test{


	 public static int[] NaiveApproach(int arr[]){

		
		// take first element 
		// compare with rest if matches put 0 there
		
		int start=0;
		for(int i=0;i<arr.length;i++){
			start=arr[i];
			
			for(int j=i+1;j<arr.length;j++){
				
				if(start==arr[j]){
					arr[j]=0;
				}
			}

		}

		return arr;

	}

	//Using Hashmap 
	//not the best approach
	//first solution is in big(n2)
	//this one is O(n) but with n extra space 
	
	public static void SecondApproach(int arr[]){
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i])){
			}
			else{
				map.put(arr[i],1);
			}

		}

		System.out.print(map);



	}


	//store all the elements in the hashSet 
	//since hashset store only unique values

	public static void HashSetApproach(int arr[])
	{
		HashSet<Integer> set=new HashSet<>();

		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);

		}

		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}



	}



	public static void main(String args[]){

		System.out.println("hello world");

		int arr[]={1,2,3,4,1,2};
		
		//int res[]=NaiveApproach(arr);
		
		//SecondApproach(arr);

		//for(int a:res){
		//	System.out.print(a+" ");
		//}
		//

		//Third Approach
		
		HashSetApproach(arr);

	}	
	
}
