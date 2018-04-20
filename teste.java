public class teste {

  public static void main(String[] args) {
    
  
    BTreeNode a = new BTreeNode(null, null, null, "A");
    BTreeNode b = new BTreeNode(a, null, null, "B");
    BTreeNode c = new BTreeNode(a, null, null, "C");
    
    a.setLeft(b);
    a.setRight(c);
    
    BTreeNode d = new BTreeNode(b, null, null, "D");
    
    b.setLeft(d);
    
    BTreeNode e = new BTreeNode(c, null, null, "E");
    BTreeNode f = new BTreeNode(c, null, null, "F");
    
    c.setLeft(e);
    c.setRight(f);
    
    BTree t = new BTree(a);
    t.BinaryPreOrder(a);
    
    System.out.println("Profundidade: "+t.depth(e));
    System.out.println("ALtura: "+t.height(e));
    
    System.out.println("Profundidade: "+t.depth(a));
    System.out.println("ALtura: "+t.height(a));
  }

}