class Solution {
    public int trap(int[] arr) {
        int length=arr.length;
        int[] left = new int[length];
        int[] right = new int[length];
        left[0] = arr[0];
        for(int i=1;i<length;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        right[length-1]=arr[length-1];
        for(int i=length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        int result=0;
        for(int i=0;i<length;i++){
            int minHeight=Math.min(left[i],right[i]);
            result+=minHeight-arr[i];
        }
        return result;
    }
}