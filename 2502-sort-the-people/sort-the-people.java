class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int n=heights.length;
        String[] res=new String[n];
        int idx=0;
        for(int i=n-1;i>=0;i--){
            res[idx]=map.get(heights[i]);
            idx++;
        }
        return res;
    }
}