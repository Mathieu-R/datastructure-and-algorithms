package datastructures.List;

import java.util.NoSuchElementException;

public interface ListInterface<Item> {
  public void addFirst(Item item);

  public void addAfter(int index, Item item) throws NoSuchElementException;

  public void set(int index, Item item);

  public Item get(int index);

  public void push(Item item);

  public void pop() throws EmptyLinkedListException;

  public void delete(int index);

  public boolean isEmpty();
}
