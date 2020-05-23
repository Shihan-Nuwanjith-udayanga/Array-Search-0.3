import java.util.*;
class SearchArray{
	public static int firstIndexOf(int[]x, int key){
		for (int i=0; i<x.length; i++){
			if(x[i]==key){
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]){
		int[] x={2,54,33,12,66,43,54,2,66,98};
		System.out.println(Arrays.toString(x));
		
		int index;
		index=firstIndexOf(x,2);
		System.out.println("Index of 2 :"+index);
		
		index=firstIndexOf(x,66);
		System.out.println("Index of 66 :"+index);
		
	}
}
