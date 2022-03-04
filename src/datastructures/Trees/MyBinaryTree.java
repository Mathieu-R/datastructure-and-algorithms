package datastructures.Trees;

/**
 * A Binary (Search) Tree is made of nodes containing two children: left child and right child.
 * Each child can contain two subchildren etc...
 * The Tree start with a root. At each node we assign a key and a value.
 * We compare the chidren keys with the parent key. The lowest key goes to the left child and the key to the right child. Useful to look for a specific value in the Tree
 */
public class MyBinaryTree<Key extends Comparable<Key>, Value> {
  private Node root;

  private class Node {
    private Key key;
    private Value value;
    private Node left; // left link to subtree
    private Node right; // right link to subtree
    private int N; // number of nodes in subtrees

    public Node(Key key, Value value, int N) {
      this.key = key;
      this.value = value;
      this.N = N;
    }
  }

  /**
   * To get a specific item from the Tree with the help of its key, we start from the root of the Tree.
   * Then we compare each parent key with the given key.
   * Recall that lowest keys are at left and greatest are at right.
   * We go down the Tree until we find the associated value (or not).
   * @param key
   * @return
   */
  public Value get(Key key) {
    return get(root, key);
  }

  public Value get(Node node, Key key) {
    if (node == null) {
      return null;
    }

    int compare = key.compareTo(node.key);

    if (compare < 0) {
      return get(node.left, key);
    } else if (compare > 0) {
      return get(node.right, key);
    } else {
      return node.value;
    }
  }

  public void set(Key key, Value value) {
    // update root node
    root = set(root, key, value);
  }

  public Node set(Node node, Key key, Value value) {
    if (root == null) {
      return new Node(key, value, 1);
    }

    int compare = key.compareTo(node.key);

    if (compare < 0) {
      node.left = set(node.left, key, value);
    } else if (compare > 0) {
      node.right = set(node.right, key, value);
    } else {
      node.value = value;
    }

    node.N = size(node.left) + size(node.right) + 1;
    return node;
  }

  public int size() {
    return size(root);
  }

  public int size(Node node) {
    if (node == null) {
      return 0;
    }

    return node.N;
  }
}
