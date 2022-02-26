package datastructures.LinkedList;

public class MyLinkedList<E> implements LinkedList<E> {
  private Node<E> head; // head of the linkedlist

  private class Node {
    private E item;
    private Node<E> next;

    public Node<E>(E element, Node<E> next) {
      this.item = element;
      this.next = next;
    }
  }

  @Override
  public boolean empty(Node currentNode) {
    return (currentNode.next == null);
  }

  @Override
  public void append(int data) {
    if (head == null) {
      head = new Node(data);
      return;
    }

    Node currentNode = head;
    while (!empty(currentNode)) {
      currentNode = currentNode.next;
    }

    currentNode.next = new Node(data);
  }

  @Override
  public void prepend (int data) {
    Node newHead = new Node(data);
    newHead.next = head;
    head = newHead;
  }

  @Override
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
