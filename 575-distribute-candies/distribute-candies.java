class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        HashSet<Integer> set=new HashSet<>();
        for(int num:candyType){
            set.add(num);
        }
        int min=Math.min(set.size(),n/2);
        return min;
    }
}