package datastructures.Stack;

public class MyStack<E> implements Stack<E> {
  private Node<E> top; // node on top of the stack
  private int size; // size of the stack

  public class Node<E> {
    private E item;
    private Node<E> next;

    public Node(E element, Node<E> next) {
      this.item = element;
      this.next = next;
    }
  }

  /*
  Test if the stack is empty
   */
  @Override
  public boolean empty() {
    return this.top == null;
  }

  /*
  Looks at the item at the top of the stack without removing it
   */
  @Override
  public E peek() throws EmptyStackException {
    if (this.empty()) {
      throw new EmptyStackException("Stack is empty.");
    }

    return this.top.item;
  }

  /*
  Remove the item at the top of the stack
   */
  @Override
  public E pop() throws EmptyStackException {
    if (this.empty()) {
      throw new EmptyStackException("Stack is empty.");
    }

    Node<E> top = this.top;
    this.top = this.top.next;
    return top.item;
  }

  /*
  Add an item at the top of the stack
   */
  @Override
  public void push(E item) {
    Node<E> top = new Node<E>(item, this.top);
    this.top = top;
  }
}
