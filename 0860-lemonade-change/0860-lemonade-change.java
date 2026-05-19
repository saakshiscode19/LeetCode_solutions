class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill : bills) {

            // Customer pays with $5
            if (bill == 5) {
                five++;
            }

            // Customer pays with $10
            else if (bill == 10) {
                if (five == 0) {
                    return false;
                }

                five--;
                ten++;
            }

            // Customer pays with $20
            else {
                // Prefer giving $10 + $5
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                }

                // Otherwise give three $5 bills
                else if (five >= 3) {
                    five -= 3;
                }

                else {
                    return false;
                }
            }
        }

        return true;
    }
}