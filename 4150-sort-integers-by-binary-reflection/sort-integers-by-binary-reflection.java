class Solution {
    public int reflect(int n){
        String binary=Integer.toBinaryString(n);
        String rev=new StringBuilder(binary).reverse().toString();
        return Integer.parseInt(rev,2);
    }
    public int[] sortByReflection(int[] nums) {
        Integer[] res=new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i];
        }
        Arrays.sort(res,(a,b)-> {
            int ra=reflect(a);
            int rb=reflect(b);
            if(ra!=rb)
                return ra-rb;    
            return a-b;    
        });
        for(int i=0;i<res.length;i++){
            nums[i]=res[i];
        }
        return nums;
    }
}