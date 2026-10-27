class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++){

            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }

        List<Integer>[]list=new ArrayList[nums.length+1];
        

        for(int key:map.keySet()){
            int freq=map.get(key);

            if(list[freq]==null){

                list[freq]=new ArrayList<>();
            }

            list[freq].add(key); 

        }

        int[] result=new int[k];

        int in=0;
        for(int i=list.length-1;i>=0 && in<k ;i--){
            if(list[i]!=null){
                for(int num:list[i]){
                result[in++]=num;
                if(in==k){
                    break;
                }
            }
        }
        
    }
    return result;
}
}
