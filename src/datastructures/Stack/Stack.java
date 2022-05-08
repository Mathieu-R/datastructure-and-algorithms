package datastructures.Stack;

/**
 * Stack using LinkedList implementation
 */

public class Stack<Item> implements StackInterface<Item> {
  private Node top; // node on top of the stack
  private int size; // size of the stack

  private class Node {
    private Item item;
    private Node next;

    public Node(Item item) {
      this.item = item;
      this.next = null;
    }

    public Node(Item item, Node nextNode) {
      this.item = item;
      this.next = nextNode;
    }
  }

  /*
   * Add an item at the top of the stack
   */
  @Override
  public void push(Item item) {
    if (item == null) {
      throw new AssertionError();
    }

    Node newTop = new Node(item, top);
    top = newTop;
    size++;
  }

  /*
   * Looks at the item at the top of the stack without removing it
   */
  @Override
  public Item peek() throws EmptyStackException {
    if (isEmpty()) {
      throw new EmptyStackException("Stack is empty.");
    }

    return top.item;
  }

  /*
   * Remove the item at the top of the stack
   */
  @Override
  public Item pop() throws EmptyStackException {
    if (isEmpty()) {
      throw new EmptyStackException("Stack is empty.");
    }

    Node oldTop = top;
    top = oldTop.next;
    size--;
    return oldTop.item;
  }

  /*
   * Test if the stack is empty
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
