package datastructures;

public class Node<E> {
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
