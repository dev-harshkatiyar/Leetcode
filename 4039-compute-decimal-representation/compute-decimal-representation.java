class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> list=new ArrayList<>();
        int place=1;
        while(n>0){
            int digit=n%10;
            if(digit!=0){
                list.add(digit*place);
            }
            place*=10;
            n/=10;
        }
        Collections.sort(list,Collections.reverseOrder());
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}