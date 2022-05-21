class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer i : nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int maxValueInMap=(Collections.max(map.values()));
        List<Integer> maxTimeNumberList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()==maxValueInMap) {
                maxTimeNumberList.add(findShortestDegree(nums,entry.getKey()));
            }
        }
        Collections.sort(maxTimeNumberList);
        return maxTimeNumberList.get(0);
    }
    
    public int findShortestDegree(int[] nums,int target){
        int frontIndex = 0;
        int backIndex = 0;
        int size = nums.length;
        for(int i=0; i<nums.length; i++){
            if(target == nums[i]){
                frontIndex = i;
                break;
            }
        }
        for(int i=size-1; i>=0; i--){
            if(target == nums[i]){
                backIndex = i;
                break;
            }
        }
        return backIndex-frontIndex+1;
    }
}