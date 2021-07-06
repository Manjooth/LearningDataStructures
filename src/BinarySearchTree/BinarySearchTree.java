package BinarySearchTree;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T>{

    private Node<T> root;

    @Override
    public void insert(T data) {
        // this is when we insert the first node into the BST (parent is null)
        if(root == null){
            root = new Node<T>(data, null);
        } else{
            // there are already items in the BST
            insert(data, root);
        }

    }

    private void insert(T data, Node<T> node) {
        // this is when the data is SMALLER than the value in the node
        // GO TO THE LEFT SUBTREE
        if(node.getData().compareTo(data) > 0){
            // there is a valid left child so we go there
            if(node.getLeftChild() != null){
                insert(data, node.getLeftChild());
            }else{
                // the left child is null so we create a left child
                node.setLeftChild(new Node<T>(data, node));
            }
        }else {
            // this is when the data is GREATER than the value in the node
            // GO TO THE RIGHT SUBTREE
            if(node.getRightChild() != null){
                insert(data, node.getRightChild());
            }else{
                // the right child is null so we create a right child
                node.setRightChild(new Node<T>(data, node));
            }
        }
    }

    @Override
    public void remove(T data) {
        if(root != null){
            remove(data, root);
        }
    }

    private void remove(T data, Node<T> node) {
        if(node == null){
            return;
        }

        // first we have to search for the item we want to remove
        if(data.compareTo(node.getData()) < 0){
            remove(data, node.getLeftChild());
        }else if(data.compareTo(node.getData()) > 0){
            remove(data, node.getRightChild());
        }else {
            // we have found the item we want to remove!!

            // if the node is a leaf node (without left + right children)
            if(node.getRightChild() == null && node.getLeftChild() == null){
                System.out.println("Removing a node that is a leaf node...");
                // whether the node is a left child or a right child of its parent
                Node<T> parent = node.getParentNode();
                // this means the node is a left child
                if(parent != null && parent.getLeftChild() == node){
                    parent.setLeftChild(null);
                    // the node is a right child
                }else if (parent != null && parent.getRightChild() == node){
                    parent.setRightChild(null);
                }

                // maybe the root node is the one we want to remove
                if(parent == null){
                    root = null;
                }

                // remove the node and makes it eligible for GC
                node = null;

                // when we remove items with a single child (CASE 2)
                // a single right child
            } else if(node.getRightChild() != null && node.getLeftChild() == null){
                System.out.println("Removing a node with single right child...");
                Node<T> parent = node.getParentNode();
                if(parent != null && parent.getLeftChild() == node){
                    parent.setLeftChild(node.getRightChild());
                }else if (parent != null && parent.getRightChild() == node){
                    parent.setRightChild(node.getRightChild());
                }

                // when we deal with the root node
                if(parent == null){
                    root = node.getRightChild();
                }

                // we have to update the right child's parent
                node.getRightChild().setParentNode(parent);
                node = null;

                // it is approximately the same, but we have to deal with left child (CASE 2)
            }else if(node.getRightChild() == null && node.getLeftChild() != null) {
                System.out.println("Removing a node with single left child...");
                Node<T> parent = node.getParentNode();
                if (parent != null && parent.getLeftChild() == node) {
                    parent.setLeftChild(node.getLeftChild());
                } else if (parent != null && parent.getRightChild() == node) {
                    parent.setRightChild(node.getLeftChild());
                }

                // when we deal with the root node
                if (parent == null) {
                    root = node.getLeftChild();
                }

                // we have to update the right child's parent
                node.getLeftChild().setParentNode(parent);
                node = null;
            }else{
                System.out.println("Removing a node with 2 children...");
                // remove 2 children
                // find the predecessor (max item in the left subtree)
                Node<T> predecessor = getPredecessor(node.getLeftChild());

                // swap just the values !!
                T temp = predecessor.getData();
                predecessor.setData(node.getData());
                node.setData(temp);

                // we have to call the delete method recursively on the predecessor
                remove(data, predecessor);
            }
        }
    }

    private Node<T> getPredecessor(Node<T> node) {
        if(node.getRightChild() != null){
            return getPredecessor(node.getRightChild());
        }

        return node;
    }

    @Override
    public void traversal() {
        // in-order traversal in O(n) linear running time
        if(root == null)  {
            return;
        }
        traversal(root);

    }

    // O(n)
    private void traversal(Node<T> node) {
        if(node.getLeftChild() != null){
            traversal(node.getLeftChild());
        }
        System.out.print(node + " --> ");

        if(node.getRightChild() != null) {
            traversal(node.getRightChild());
        }
    }

    @Override
    public T getMin() {
        // the max item is the leftmost item in the tree
        if(root == null){
            return null;
        }

        return getMin(root);
    }

    private T getMin(Node<T> node) {
        if(node.getLeftChild() != null){
            return getMin(node.getLeftChild());
        }
        return node.getData();
    }

    @Override
    public T getMax() {
        // the max item is the rightmost item in the tree
        if(root == null){
            return null;
        }

        return getMax(root);
    }

    private T getMax(Node<T> node) {
        if(node.getRightChild() != null){
            return getMax(node.getRightChild());
        }
        return node.getData();
    }
}
