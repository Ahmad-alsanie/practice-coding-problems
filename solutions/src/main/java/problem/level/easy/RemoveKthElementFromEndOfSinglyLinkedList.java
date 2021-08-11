package problem.level.easy;

public class RemoveKthElementFromEndOfSinglyLinkedList {

    /**
     * @Description
     * Remove kth element from the end of a singly linked list
     * */

    /**
     * @Example
     * Input: k = 2, Linked List = 8->2->3->1->7->null
     * Output: Linked List =  8->2->3->7->null
     *
     * Input: position = 0, Linked List = 8->2->3->1->7->null
     * Output: Linked List = 8->2->3->1->null
     * */

    void deleteNodeAtKthFromEnd(Node head, int k) {
        if (null == head)
            return;

        int size =0;
        while(null != head.next){
            size+=1;
        }

        Node previous = head;

        int position = size - k;

        if (position == 0) {
            head = previous.next;
            return;
        }

        // Find previous node of the node to be deleted
        for (int i=0; previous!=null && i<position-1; i++)
            previous = previous.next;

        // If position is more than number of nodes
        if (previous == null || previous.next == null)
            return;

        Node next = previous.next.next;
        previous.next = next;
    }

    /* Singly Linked list Node*/
    static class Node {
        int data;
        Node next;
        public Node(int value) {
            data = value;
            next = null;
        }
    }

    /* helper function */
    public void push(Node head, int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public String getList(Node head) {
        Node next = head;
        StringBuilder builder = new StringBuilder();
        while (next != null)
        {
            builder.append(next.data+" ");
            next = next.next;
        }
        return builder.toString();
    }
}
