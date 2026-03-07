class Solution {
    public int minFlips(String s) {
     int n = s.length();
     String ss = s+ s;
     int startWithZero =0;
     int startWithOne = 0;
     int res = Integer.MAX_VALUE;
     for(int i =0; i<ss.length(); i++){
        char e1 =(i%2 == 0) ? '0' : '1';
        char e2 = (i % 2 == 0) ? '1' : '0';

        if(ss.charAt(i) != e1){
            startWithZero++;
        }
        if(ss.charAt(i) != e2){
            startWithOne++;
        }
        if(i >= n){
            int j = i-n;
            char ep1 = (j % 2==0) ? '0' : '1';
            char ep2 = (j % 2 == 0) ? '1' : '0';
            if(ss.charAt(j) != ep1){
                startWithZero--;
            }
            if(ss.charAt(j) != ep2){
                startWithOne--;
            }
        }
        if(i >= n-1){
            res = Math.min(res, Math.min(startWithZero, startWithOne));
        }
     }
     return res;
      }
    }
