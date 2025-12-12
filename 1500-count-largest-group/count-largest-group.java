class Solution {
    public int digitsum(int x){
        int sum=0;
        while(x>0){
            sum+=x%10;
            x=x/10;
        }
        return sum;
    } 
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            int sum=digitsum(i);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        int max=0;
        for(int size:map.values()){
            if(size>max){
                max=size;
            }
        }
        int count=0;
        for(int size:map.values()){
            if(size==max){
                count++;
            }
        }
        return count;
    }
}