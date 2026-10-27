class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<HashMap<Character,Integer>> list=new ArrayList<>();

        List<String> li=new ArrayList<>();
        List<List<String>> result=new ArrayList<>();

        for(int i=0;i<strs.length;i++){
            HashMap<Character,Integer> map=new HashMap<>();

            if(strs[i].length()==0){
                li.add(strs[i]);
                
            }
            else{

            for(char ch:strs[i].toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            }
            list.add(map);
        }

        if(li.size()!=0){
            result.add(li);
        }
        
        for(int i=0;i<list.size();i++){

            if(list.get(i).size()==0){
                continue;
            }

            List<String> l=new ArrayList<>();

            l.add(strs[i]);
            int j=i+1;

            while(j<list.size()){

                if(list.get(i).equals(list.get(j))){
                    l.add(strs[j]);
                    list.get(j).clear();
                }
                
                j++;
                
                
            }

            result.add(l);

        }

        return result;
        
    }
}
