package datastructures.Stack;

/**
 * Stack using LinkedList implementation
 */

public class MyStack<E> implements Stack<E>, Iterable<E> {
  private Node top; // node on top of the stack
  private int size; // size of the stack

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

    /*
  Add an item at the top of the stack
   */
  @Override
  public void push(E item) {
    Node newTop = new Node(item, top);
    top = newTop;
    size++;
  }

  /*
  Looks at the item at the top of the stack without removing it
   */
  @Override
  public E peek() throws EmptyStackException {
    if (isEmpty()) {
      throw new EmptyStackException("Stack is empty.");
    }

    return top.item;
  }

  /*
  Remove the item at the top of the stack
   */
  @Override
  public E pop() throws EmptyStackException {
    if (isEmpty()) {
      throw new EmptyStackException("Stack is empty.");
    }

    Node oldTop = top;
    top = top.next;
    size--;
    return oldTop.item;
  }

    /*
  Test if the stack is empty
   */
  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public int size() {
    return size;
  }
}
