class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        for(int i = 0 ; i<citations.length; i++){
            int papers = citations.length-i;
            if(citations[i] >=citations.length-i){
                 return papers;
            }
        }
        return 0;
    }
}