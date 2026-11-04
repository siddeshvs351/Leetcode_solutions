class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<candyType.length;i++){
            map.put(candyType[i],map.getOrDefault(candyType[i],0)+1);
        }
        return Math.min(map.size(),candyType.length/2);
    }
}