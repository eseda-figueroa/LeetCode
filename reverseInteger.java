// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x
// causes the value to go outside the signed 32-bit integer range
// [-231, 231 - 1], then return 0.

class Solution
{
    public int reverse(int x)
    {
        int num = 0;
        while (x != 0)
        {
            num *= 10; // upping number place
            num += x % 10; // adding single digit
            x /= 10; // updating remaining numbers
        }
        if (num >= Integer.MAX_VALUE || num <= Integer.MIN_VALUE) return 0;
        return num;
    }
}
