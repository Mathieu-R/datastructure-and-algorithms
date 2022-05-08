package datastructures.Stack;

/**
 * Implementation of Stack using Array
 */
public class StackArray<Item> implements StackInterface<Item> {
  private Item[] data;
  private int size;

  private int pointer;

  public StackArray(int size) {
    this.data = new Item[size];
    this.size = size;

    this.pointer = 0;
  }

  @Override
  public void push(Item item) {

  }

  @Override
  public Item pop() throws EmptyStackException {
    return null;
  }

  @Override
  public Item peek() throws EmptyStackException {
    return null;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public boolean isFull() {
    return false;
  }

  @Override
  public int size() {
    return 0;
  }
}
