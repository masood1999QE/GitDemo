import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Class23{
	
}

public class Class1 {
	
	int data1=10;
	static int a=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  HashMap<Integer,Integer> map=new  HashMap<>();
		  	
		  	int[] nums= {7,1,5,4,3,4,6,0,9,5,8,2};
	        int[] arr=new int[2];
	        int j=0;
	        for(int number:nums)
	        {
	            int numberCount=map.getOrDefault(number,0);
	            System.out.println("Before Number:"+number+" numberCount:"+numberCount);
	            if(numberCount>0)
	            {
	                arr[j]=number;
	                j++;
	            }
	            numberCount+=1;
	            System.out.println("After Number:"+number+" numberCount:"+numberCount);
	            map.put(number,numberCount);
	        }
		System.out.println(arr[0]+" "+arr[1]);
	}
	
	public  void display() {
		System.out.println("Hii Updated Class1");
	}

}
