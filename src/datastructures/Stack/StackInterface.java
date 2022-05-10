package datastructures.Stack;

public interface StackInterface<Item> {
  public void push(Item item);
  public Item pop() throws  EmptyStackException;
  public Item peek() throws EmptyStackException;
  public boolean isEmpty();
  public int size();
}
