package datastructures.List;

import java.util.NoSuchElementException;

public class MySinglyLinkedList<Item> implements ListInterface<Item> {
  private Node first; // head of the linkedlist (first Node)
  private Node last; // tail of the linkedlist (last Node)
  private int size = 0; // size of the linkedlist

  private class Node {
    private Item item;
    private Node next;

    public Node(Item element) {
      item = element;
      next = null;
    }

    public Node(Item element, Node nextNode) {
      item = element;
      next = nextNode;
    }
  }

  @Override
  public void addFirst(Item item) {
    Node node = new Node(item);

    if (first == null) {
      first = node;
    } else {
      Node oldFirst = first;
      first = node;
      first.next = oldFirst;
    }

    size++;
  }

  @Override
  public void addAfter(int index, Item item) throws NoSuchElementException {
    Node node = new Node(item);

    if (index > size - 1 || index <= 0) {
      throw new NoSuchElementException();
    }

    int counter = 0;
    Node currentNode = first;
    while (counter < index) {
      currentNode = currentNode.next;
      counter++;
    }

    if (currentNode.next !== null) {
      node.next = currentNode.next;
    }

    currentNode.next = node;
  }

  @Override
  public void push(Item item) {
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

  @Override
  public Item get(int index) throws NoSuchElementException {
    if ((index > size - 1) || (index < 0)) {
      throw new NoSuchElementException();
    }

    // we begin at the first element (head)
    Node currentNode = first;
    for (int i = 0; i < index; i++) {
      currentNode = currentNode.next;
    }

    return pointingNode.item;
  }

  @Override
  public void delete(Item item) {
    if (first == null) {
      return;
    }

    if (first.item == item) {
      first = first.next;
    }

    Node currentNode = first;
    while (currentNode.next != null) {
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
