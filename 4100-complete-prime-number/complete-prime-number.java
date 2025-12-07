class Solution {
    public boolean isPrime(int num){
        if(num <= 1) return false;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    public boolean completePrime(int num) {
        String s = String.valueOf(num);
        int temp = num;
        while(temp > 0){
            if(!isPrime(temp)) return false;
            temp /= 10;
        }
        for(int i = 0; i < s.length(); i++){
            int val = Integer.parseInt(s.substring(i));
            if(!isPrime(val)) return false;
        }
        return true;
    }
}
