public class Solution {
    public int[] plusOne(int[] digits) {
        // start from the last digit and move towards left
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i]<9) {
                // No carry needed, just increment and return 
                digits[i]++;
                return digits;                
            }
            // if digit is 9, set it to 0 and continue to the next digit
            digits[i]=0;
        }
        //If all digits were 9, we need a new array with an extra digit
        int[] newDigits=new int[digits.length+1];
        // The leftmost digits(most significant digit) is 1, rest of them are 0 by default 
        newDigits[0]=1;
        return newDigits;
        
    }

}
