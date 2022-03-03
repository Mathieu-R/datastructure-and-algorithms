package datastructures.LinkedList;

public interface LinkedList<E> {
  public void push(E item);
  public void pop() throws EmptyLinkedListException;
  public void delete(E item);
  public boolean isEmpty();
}
