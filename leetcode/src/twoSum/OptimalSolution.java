package twoSum;

class OptimalSolution  {
    public int countOdds(int low, int high) {
        int total = (high - low) / 2;

        // If either low or high is odd, add 1
        if (low % 2 != 0 || high % 2 != 0) {
            total += 1;
        }

        return total;
    }
}

