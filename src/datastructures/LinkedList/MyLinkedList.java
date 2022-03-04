package datastructures.LinkedList;

import datastructures.Node;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements LinkedList<E> {
  private Node first; // head of the linkedlist (first Node)
  private Node last; // tail of the linkedlist (last Node)
  private int size = 0; // size of the linkedlist

  private class Node {
    private E item;
    private Node next;

    public Node(E element) {
      item = element;
      next = null;
    }

    public Node(E element, Node nextNode) {
      item = element;
      next = nextNode;
    }
  }

  @Override
  public void push(E item) {
    Node node = new Node(item);

    if (first == null) {
      first = node;
      last = node;
    } else {
      last.next = node;
      last = last.next;
    }

    size++;
  }

  @Override
  public void pop() throws EmptyLinkedListException {
    if (first == null) {
      throw new EmptyLinkedListException();
    }

    Node pointingNode = first;
    int i = 0;
    while (i < size - 1) {
      pointingNode = pointingNode.next;
      i++;
    }

    last = pointingNode;
    size -= 1;
  }

  public E get(int index) throws NoSuchElementException {
    if ((index > size - 1) || (index < 0)) {
      throw new NoSuchElementException();
    }


    // we begin at the first element (head)
    Node pointingNode = first;
    for (int i = 0; i < index; i++) {
      pointingNode = pointingNode.next;
    }

    return pointingNode.item;
  }

  @Override
  public void delete(E item) {
    if (first == null) {
      return;
    }

    if (first.item == item) {
      first = first.next;
    }

    Node currentNode = first;
    while(currentNode.next != null) {
      if (currentNode.item == item) {
        currentNode.next = currentNode.next.next;
        return;
      }
      currentNode = currentNode.next;
      size--;
    }
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }
}
