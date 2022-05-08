package datastructures.Stack;

public interface Stack<E> {
  public void push(E item);
  public E peek() throws EmptyStackException;
  public E pop() throws  EmptyStackException;
  public boolean isEmpty();
  public int size();
}
