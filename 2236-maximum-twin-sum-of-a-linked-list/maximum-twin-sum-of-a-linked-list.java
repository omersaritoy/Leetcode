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
class Solution {
    public int pairSum(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode tmp=head;
        while(tmp!=null){
            list.add(tmp.val);
            tmp=tmp.next;
        }
        int max=0;
        for(int i=0;i<list.size();i++){
            int sum=list.get(i)+list.get(list.size()-i-1);
            max=Math.max(max,sum);
        }
        return max;
    }
}