class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> bList = new ArrayList<>();

        int max = 0;
        for(int num : candies){
            if(num>max){
                max = num;
            }
        }
        for(int can: candies){
            if(can+extraCandies < max){
                bList.add(false);
            }else{
                bList.add(true);
            }
        }
        return bList;
    }
}