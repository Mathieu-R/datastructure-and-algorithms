package datastructures.LinkedList;

import java.util.NoSuchElementException;

public class MyLinkedList<E> implements LinkedList<E> {
  private Node head; // head of the linkedlist (first Node)
  private Node tail; // tail of the linkedlist (last Node)
  private int size; // size of the linkedlist

  private class Node {
    private E item;
    private Node next;

    public Node(E element) {
      item = element;
    }

    public Node(E element, Node next) {
      item = element;
      next = next;
    }
  }

  @Override
  public boolean empty(Node currentNode) {
    return (currentNode.next == null);
  }

  public E get(int index) throws NoSuchElementException {
    if ((index > size - 1) || (index < 0)) {
      throw new NoSuchElementException();
    }


    // we begin at the first element (head)
    Node pointingNode = head;
    for (int i = 0; i < index; i++) {
      pointingNode = pointingNode.next;
    }

    return pointingNode.item;
  }

  @Override
  public void push(E item) {
    Node node = new Node(item);

    if (head == null) {
      head = node;
      tail = node;
    } else {
      tail.next = node;
      tail = tail.next;
    }

    size++;
  }

  @Override
  public void pop() throws EmptyLinkedListException {
    if (head == null) {
      throw new EmptyLinkedListException();
    }

    Node pointingNode = head;
    int i = 0;
    while(i < size - 1) {
      pointingNode = pointingNode.next;
      i++;
    }

    tail = pointingNode;
    size -= 1;
  }

  @Override
  public void delete(E item) {
    if (head == null) {
      return;
    }

    if (head.item == item) {
      head = head.next;
    }

    Node currentNode = head;
    while(currentNode.next != null) {
      if (currentNode.item == item) {
        currentNode.next = currentNode.next.next;
        return;
      }
      currentNode = currentNode.next;
      size--;
    }
  }
}
