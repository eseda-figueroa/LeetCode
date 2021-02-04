// You are given two non-empty linked lists representing two non-negative integers. 
// The digits are stored in reverse order, and each of their nodes contains a single digit. 
// Add the two numbers and return the sum as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
	// Runtime: O(n)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        int incriment = 0, val1, val2;
        ListNode check1 = l1, check2 = l2;
        ListNode sum = new ListNode(0);
		ListNode temp = sum;
		
		// loop through list if either is not null or incriment needs to be added
        while (check1 != null || check2 != null || incriment != 0)
        {
			// in case one list is shorter, val is 0
			val1 = check1 == null ? 0 : check1.val;
			val2 = check2 == null ? 0 : check2.val;

            // add values and makes sure range from 1-9
            temp.next = new ListNode((val1 + val2 + incriment) % 10);
			temp = temp.next;
            // checks for incriment (val over <= 10)
			incriment = (val1 + val2 + incriment) / 10;
				
			// checks lists to make sure not going out of bounds
            if (check1 != null) 
				check1 = check1.next;
            if (check2 != null) 
				check2 = check2.next;     
        }       
        return sum.next;
    }
 

}