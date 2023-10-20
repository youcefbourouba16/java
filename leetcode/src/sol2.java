
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}



public class sol2 {
    public static void main(String[] args) {
        // Create the nodes
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        // Link the nodes together
        node1.next = node2;
        node2.next = node3;

        // Print the linked list
        ListNode current = node1;
        int lenght = 0;
        while (current != null) {
            System.out.println(current.val);
            lenght++;
            current = current.next;
        }
        current = node1;
        int i=2,j=0;
        while (current != null && i>=0) {
            node=current;
            i++;
            current = current.next;
        }
        System.out.println(j);





    }

}
