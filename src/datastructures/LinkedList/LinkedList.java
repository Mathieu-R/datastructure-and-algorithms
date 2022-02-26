package datastructures.LinkedList;

public interface LinkedList<E> {
  public boolean empty();
  public void push(E item);
  public void pop(E item) throws  EmptyLinkedListException;
  public void deleteWithValue(E item);
}
