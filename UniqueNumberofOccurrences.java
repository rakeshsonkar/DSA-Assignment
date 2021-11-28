class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      HashMap<Integer,Integer> num = new HashMap();
        for(int nums:arr){
            num.put(nums,num.getOrDefault(nums,0)+1);
        }
        HashSet<Integer>unique_val=new HashSet(num.values());
        return num.size()==unique_val.size();
    }
}