package datastructures.List;

import datastructures.ListInterface;

import java.util.NoSuchElementException;

public class MyDoublyLinkedList<Item> implements ListInterface<Item> {
  private Node head; // very first element of the list
  private Node tail; // very last element of the list
  private int size = 0;

  private class Node {
    Item item;
    Node prev;
    Node next;

    public Node(Item item) {
      this.item = item;
      this.next = null;
    }
  }

  public MyDoublyLinkedList() {
    // TODO
  }

  @Override
  public void addFirst(Item item) {
    if (item == null) {
      throw new AssertionError();
    }

    Node node = new Node(item);

    if (head == null && tail == null) {
      head = tail = node;
    } else {
      Node oldHead = head;
      head = node;
      head.next = oldHead;

      // update prev pointer
      head.prev = tail;

      // update next pointer
      tail.next = head;
    }

    size++;
  }

  @Override
  public void addAfter(int index, Item item) throws NoSuchElementException {
    if (item == null) {
      throw new AssertionError();
    }

    if (index > size - 1 || index < 0) {
      throw new NoSuchElementException();
    }

    Node node = new Node(item);
    Node currentNode = nodeLookup(index);

    // go to prev element to insert the node at position "index"
    Node prev = currentNode.prev;
    Node oldNext = prev.next;

    prev.next = node;
    node.next = oldNext;
    size++;
  }

  @Override
  public void set(int index, Item item) {
    if (item == null) {
      throw new AssertionError();
    }

    if (index > size - 1 || index < 0) {
      throw new NoSuchElementException();
    }

    Node currentNode = nodeLookup(index);
    currentNode.item = item;
  }

  private Node nodeLookup(int index) {
    Node currentNode;

    if (index >= Math.ceil((size - 1) / 2)) {
      currentNode = tail;
      for (int i = size - 1; i >= index; i--) {
        currentNode = currentNode.prev;
      }
    } else {
      currentNode = head;
      for (int i = 0; i <= index; i++) {
        currentNode = currentNode.next;
      }
    }

    return currentNode;
  }

  @Override
  public Item get(int index) {
    if (index > size - 1 || index < 0) {
      throw new NoSuchElementException();
    }

    return nodeLookup(index).item;
  }

  @Override
  public void push(Item item) {
    Node node = new Node(item);

    if (head == null && tail == null) {
      tail = head = node;
    } else {
      Node oldTail = tail;
      oldTail.next = node;

      node.prev = oldTail;
      node.next = head;

      tail = node;
    }

    size++;
  }

  @Override
  public void pop() throws EmptyLinkedListException {

  }

  @Override
  public void delete(int index) {

  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  public static void main(String[] args) {
    MyDoublyLinkedList<Integer> DLL = new MyDoublyLinkedList<Integer>();
  }
}
