package datastructures.LinkedList;

public class LinkedList {
  Node head;

  public void append(int data) {
    if (head == null) {
      head = new Node(data);
      return;
    }

    Node currentNode = head;
    while (!isEmpty(currentNode)) {
      currentNode = currentNode.next;
    }

    currentNode.next = new Node(data);
  }

  public void prepend (int data) {
    Node newHead = new Node(data);
    newHead.next = head;
    head = newHead;
  }

  public boolean isEmpty(Node currentNode) {
    return (currentNode.next == null);
  }

  public void deleteWithValue(int data) {
    if (head == null) {
      return;
    }

    if (head.data == data) {
      head = head.next;
    }

    Node currentNode = head;
    while(currentNode.next != null) {
      if (currentNode.data == data) {
        currentNode.next = currentNode.next.next;
        return;
      }
      currentNode = currentNode.next;
    }


  }
}
