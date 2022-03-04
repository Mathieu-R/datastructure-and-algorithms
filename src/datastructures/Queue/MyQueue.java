package datastructures.Queue;

import datastructures.Queue.EmptyQueueException;

public class MyQueue<E> implements Queue<E> {
  Node first;
  Node last;
  int size = 0;

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
  public void enqueue(E item) {
    Node oldLast = last;
    last = new Node(item);

    if (isEmpty()) {
      first = last;
    } else {
      oldLast.next = last;
    }

    size++;
  }

  @Override
  public E dequeue() throws EmptyQueueException {
    if (isEmpty()) {
      throw new EmptyQueueException();
    }

    Node oldFirst = first;
    first = first.next;
    size--;

    return oldFirst.item;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public int size() {
    return size;
  }
}
