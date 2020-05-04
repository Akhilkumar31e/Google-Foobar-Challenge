public class Solution {
    public static int[] solution(int[] data, int n) {
        // Your code here
        int count[]=new int[1000001];
        for(int i=0;i<data.length;i++){
            count[data[i]]++;
        }
        int k=0;
        for(int i=0;i<data.length;i++){
            if(count[data[i]]<=n) k++;
        }
        int ans[]=new int[k];
        k=0;
        for(int i=0;i<data.length;i++){
            if(count[data[i]]<=n) ans[k++]=data[i];
        }
        return ans;
    }
}