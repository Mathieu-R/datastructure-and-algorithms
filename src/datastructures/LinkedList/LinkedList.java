package datastructures.LinkedList;

public interface LinkedList<E> {
  public boolean empty(Node currentNode);
  public void push(E item);
  public void pop() throws EmptyLinkedListException;
  public void delete(E item);
}
