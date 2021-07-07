package BinarySearchTree;

public class PersonApp {

    private static BinarySearchTree<PersonExample> pe = new BinarySearchTree<PersonExample>();

    public static void main(String[] args) {

        pe.insert(new PersonExample(10, "James"));
        pe.insert(new PersonExample(28, "Reane"));
        pe.insert(new PersonExample(3, "Rafeala"));
        pe.insert(new PersonExample(90, "Jean"));
        pe.insert(new PersonExample(21, "Mea"));


        // will output in a descending age order
        pe.traversal();

        // should return 10 + 3 + 21 + 28 + 90 = 152
        System.out.println(pe.getAgesSum());

    }

}
