class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:tasks){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int max=0;
        for(int freq:map.values()){
            max=Math.max(freq,max);
        }
        int countMax=0;
        for(int freq:map.values()){
            if(freq==max)
                countMax++;
        }
        int interval=(max-1)*(n+1)+countMax;
        return Math.max(tasks.length,interval);
    }
}