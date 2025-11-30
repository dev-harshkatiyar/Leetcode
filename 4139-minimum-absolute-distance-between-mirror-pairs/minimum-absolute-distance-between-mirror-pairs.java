class Solution {
    private int reverse(int x){
        int rev=0;
        while(x>0){
            int digit=x%10;
            rev=(rev*10)+digit;
            x=x/10;
        }
        return rev;
    } 
    public int minMirrorPairDistance(int[] nums) {
       int[] store=nums;
       HashMap<Integer,Integer> map=new HashMap<>();
       int mindist=Integer.MAX_VALUE;

       for(int j=0;j<nums.length;j++){
        int val=store[j];
        if(map.containsKey(val)){
            int i=map.get(val);
            mindist=Math.min(mindist,j-i);
        }
        int rev=reverse(val);
        map.put(rev,j);
       }
       return (mindist==Integer.MAX_VALUE) ? -1 : mindist;
    }
}