class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinkCount = numBottles;
        int remainBottles = 0;
        
        while (numBottles + remainBottles >= numExchange) {
            int newBottles = (numBottles + remainBottles) / numExchange;
            drinkCount += newBottles;
            remainBottles = (numBottles + remainBottles) % numExchange;
            numBottles = newBottles;
        }
        
        return drinkCount;
    }
}
