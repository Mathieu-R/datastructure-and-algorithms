package datastructures.Queue;

public class QueueLinkedList<Item> implements QueueInterface<Item> {
  Node head; // first element of the Queue
  Node tail; // last element of the Queue
  int size = 0;

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

  /**
   * Add an item to the tail of the Queue
   */
  @Override
  public void enqueue(Item item) {
    Node oldTail = tail;
    Node node = new Node(item);

    if (isEmpty()) {
      head = tail = node;
    } else {
      tail = node;
      oldTail.next = tail;
    }

    size++;
  }

  @Override
  public Item dequeue() throws EmptyQueueException {
    if (isEmpty()) {
      throw new EmptyQueueException();
    }

    Node oldHead = head;
    head = head.next;
    size--;

    return oldHead.item;
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
