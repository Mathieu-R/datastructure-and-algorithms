package datastructures.CircularLinkedList;

import datastructures.Node;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CircularLinkedList<Item> implements Iterable<Item> {
  private long nOp = 0; // count the number of operations
  private int n; // size of the stack
  private Node first;
  private Node last; // trailer of the list

  public CircularLinkedList() {
    tail = null;
    head = null;
    n = 0;
  }

  public boolean isEmpty() {
    return n == 0;
  }

  public int size() {
    return n;
  }

  private long nOp() {
    return nOp;
  }

  /**
   * Append an item at the end of the list
   *
   * @param item the item to append
   */
  public void enqueue(Item item) {
    // TODO STUDENT: Implement add method
    Node newNode = new Node(item);
    if (this.isEmpty()) {
      tail = newNode;
      head = newNode;

      newNode.next = head;
    } else {
      tail.next = newNode;
      tail = newNode;
      newNode.next = tail;
    }

    n++;
  }

  /**
   * Removes the element at the specified position in this list.
   * Shifts any subsequent elements to the left (subtracts one from their
   * indices).
   * Returns the element that was removed from the list.
   */
  public Item remove(int index) {
    // TODO STUDENT: Implement remove method

  }

  /**
   * Returns an iterator that iterates through the items in FIFO order.
   *
   * @return an iterator that iterates through the items in FIFO order.
   */
  public Iterator<Item> iterator() {
    return new ListIterator();
  }

  /**
   * Implementation of an iterator that iterates through the items in FIFO order.
   *
   */
  private class ListIterator implements Iterator<Item> {
    // TODO STUDENT: Implement the ListIterator
  }

}
