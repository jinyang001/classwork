public class Tree<T> {
    private T data;
    private Tree<T> parent = null;
    private Tree<T> right = null;
    private Tree<T> left = null;
    private int priority = 0;

    public Tree() {
    }

    public Tree(T value) {
        this.data = value;
    }

    public Tree(T value, int priority) {
        this.data = value;
        this.priority = priority;
    }

    public Tree(T value, int priority, Tree<T> rightChild, Tree<T> leftChild) {
      this.data = value;
      this.priority = priority;

      this.right = rightChild;
      rightChild.parent = this;

      this.left = leftChild;
      leftChild.parent = this;
    }

    public boolean isLeaf() {
      if ((right == null) && (left == null)) {
        return true;
      }
      return false;
    }

    public boolean isRoot() {
      if (parent == null) {
        return true;
      }
      return false;
    }

    public void inOrderTraverse() {
      if (this.left != null)
         this.left.inOrderTraverse();

      System.out.println(this.data + ": " + this.priority);

      if (this.right != null)
         this.right.inOrderTraverse();
    }

    public void preOrderTraverse() {
      System.out.println(this.data + ": " + this.priority);

      if (this.left != null)
         this.left.preOrderTraverse();

      if (this.right != null)
         this.right.preOrderTraverse();
    }

    public void postOrderTraverse() {
      if (this.left != null)
         this.left.postOrderTraverse();

      if (this.right != null)
         this.right.postOrderTraverse();

      System.out.println(this.data + ": " + this.priority);
    }

}
