import java.util.*;
public class MyClass{
	public static void main(String args[]){
    	int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
        	arr[i] = sc.nextInt();
        }
        int limit1 = sc.nextInt();
        int limit2 = sc.nextInt();
        int sum = 0, avg = 0,count = 0;
        for(int i=0;i<5;i++){
        	if(limit1 < arr[i] && arr[i] < limit2){
            	count++;
                sum+=arr[i];
            }
        }
        avg = sum/count;
        System.out.println(avg);
    }
}
