class Solution {
    public int[] productExceptSelf(int[] nums) {


        if(nums.length<=1){
            return nums;
        }
        int[] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];
        int[] result=new int[nums.length];

        int i=0,j=nums.length-1;
        int pre=1,suf=1;
        while(i<nums.length&&j>=0){

            pre*=nums[i];
            suf*=nums[j];
            prefix[i]=pre;
            suffix[j]=suf;
            i++;
            j--;
        }

        result[0]=suffix[1];
        result[nums.length-1]=prefix[nums.length-2];

        int p=0,current=1,s=2;

        while(s<nums.length){
            result[current]=prefix[p]*suffix[s];
            p++;
            current++;
            s++;
        }


        return result;
    }
}  
