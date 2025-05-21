public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    
    // Root left & right
    root.left = new TreeNode(9);
    root.right = new TreeNode(15);

    // Child of 10's first child
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);

    // Child of 10's second child
    root.right.left = new TreeNode(-3);
    root.right.right = new TreeNode(5);

    root.right.right.right = new TreeNode(22);

    System.out.println("Pre-order: ");
    preOrder(root);

  }

 /** PRE - ORDER
    if null : return
    print data
    search left
    search right
    */
  public static void preOrder(TreeNode current){

    if (current == null) return;
    System.out.println(current.data);
    preOrder(current.left);
    preOrder(current.right);

  }


  /** POST - ORDER
   if null : return
   search left
   search right
   print data
   */


   /** IN - ORDER
   if null : return
   search left
   print data
   search right
   */
}
