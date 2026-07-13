class Solution {
    public void duplicateZeros(int[] arr) {
        int[] ans=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(j==arr.length)
                break;
            if(arr[i]==0)
            {
                ans[j]=0;
                if(j+1==arr.length){
                    break;
                }
                ans[j+1]=0;
                j+=2;
            }
            else{
                ans[j]=arr[i];
                j++;
            }

        }
        for(int i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }
    }
}