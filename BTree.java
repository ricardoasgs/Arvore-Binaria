public class BTree
{
    BTreeNode root;
    int size;
    // construtor
    BTree(BTreeNode r)
    {root=r; size=0;}
    //Caminhamento
    void BinaryPreOrder(BTreeNode n)
    {
        if(n!=null)
        {
            //visita
            System.out.println(n.getName());
            //Chamada filho da esquerda
            BinaryPreOrder(n.getLeft());
            BinaryPreOrder(n.getLeft());
        }
    }
    
    int depth(BTreeNode n)
    {
        if(n.isRoot())
        {
            return 0;
        }
        else
        {return 1 + depth(n.getParent());}
    }
    
    int height(BTreeNode n)
    {
        if(n.isExternal())
        {return 0;}
        else
        {
            int hr=0,hl=0;
            if(n.getLeft()!=null){
            hl = height(n.getLeft());
            }
            if(n.getRight()!=null){
            hr = height(n.getRight());
            }
            if (hl>hr)
            {return 1+hl;}
            else
            {return 1+hr;}
        }
    }
}
