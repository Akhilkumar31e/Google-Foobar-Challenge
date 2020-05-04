public class Solution{
	public int solution(int total_lambs){		
	int min=0;
        int i=1;
        int total=0;
        while(true){
            total+=i;
            if(total>total_lambs) break;
            i=i*2;
            min++;
        }
        total=total-i;
       
        int max=1;
        int prev=1;
        int fib=1;
        total=1;
        int temp=0;
        while(true){
            total+=fib;
            if(total>total_lambs) break;
            temp=fib;
            fib=prev+fib;
            prev=temp;
             max++;
        }
         return (max-min);
}
}