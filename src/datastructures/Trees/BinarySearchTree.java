package datastructures.Trees;

public class BinarySearchTree<Key> {
  private Key key;
  private BinarySearchTree left;
  private BinarySearchTree right;

  public BinarySearchTree(Key key) {
    this.key = key;
  }

  public BinarySearchTree find(BinarySearchTree Tree, Key key) {
    if (Tree == null) {
      return null;
    }

    if (Tree.key.equals(key)) {
      return Tree;
    }

    if (key < Tree.key) {
      return find(Tree.left, key);
    } else {
      return find(Tree.right, key);
    }
  }

  public BinarySearchTree insert(BinarySearchTree Tree, Key key) {
    if (Tree == null) {
      return new BinarySearchTree(key);
    }

    if (Tree.key.equals(key)) {
      return Tree;
    }

    if (key < Tree.key) {
      return insert(Tree.left, key);
    } else {
      return insert(Tree.right, key);
    }
  }
}
