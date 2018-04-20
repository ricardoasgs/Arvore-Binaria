public class BTreeNode
{
    BTreeNode parent;
    BTreeNode left;
    BTreeNode right;
    String name;
    
    //construtores
    BTreeNode (BTreeNode p, BTreeNode l , BTreeNode  r, String n)
  {
    parent = p ;
    left = l ;
    right  = r;
    name = n ;
    
  }
  
  public void setParent(BTreeNode parent) {
    this.parent = parent;
  }
  
  public void setLeft(BTreeNode left) {
    this.left = left;
  }

  public void setRight(BTreeNode right) {
    this.right = right;
  }
  
  public void setName(String name) {
    this.name = name;
  }  

  
  public BTreeNode getParent() {
    return parent;
  }


  public BTreeNode getLeft() {
    return left;
  }
  
  public BTreeNode getRight() {
    return right;
  }
  
  public String getName() {
    return name;
  }
  
  boolean isRoot()
  {
      if(this.getParent()== null)
      {return true;}
      else
      {return false;}
      
  }
  
  boolean isExternal()
  {
      if(this.getLeft()==null && this.getRight()==null)
      {return true;}
      else
      {return false;}
      
  }
}