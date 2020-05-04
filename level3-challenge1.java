public class Solution {
    public static int solution(int start, int length) {
        //Your code goes here.
        int range=length;
        int xor=0;
        int temp=start;
        for(int i=0;i<length;i++){
            temp=start+(length*i);
            for(int j=0;j<range;j++){
                xor=xor^temp;
                temp++;
            }
            range--;
        }
        return xor;
    }
}