package problem.level.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveKthFromEndOfSinglyLinkedListTest {
    RemoveKthElementFromEndOfSinglyLinkedList list;
    RemoveKthElementFromEndOfSinglyLinkedList.Node head;

    @Before
    public void init(){
        head = new RemoveKthElementFromEndOfSinglyLinkedList.Node(8);
        list = new RemoveKthElementFromEndOfSinglyLinkedList();
        list.push(head, 7);
        list.push(head, 6);
        list.push(head, 5);
        list.push(head, 4);
    }

    @Test
    public void givenValidArray_whenMoveZerosInvoked_thenReturnOriginalArrayWithZerosShiftedToEnd(){
        RemoveKthElementFromEndOfSinglyLinkedList expected = new RemoveKthElementFromEndOfSinglyLinkedList();
        expected.push(head, 7);
        expected.push(head, 6);
        expected.push(head, 4);
        list.deleteNodeAtKthFromEnd(head, 2);
        Assert.assertEquals(list.getList(head), expected.getList(head));
    }

}
