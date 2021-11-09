package Lab1;

public class ListTest {
    public static void main(String[] args) {
        List List1 = new List(5);
        List List2 = new List();

        List2.add("A");
        List2.add("B");

        List2.printList();
        List2.remove(0);
        List2.printList();

        Node Node1 = List2.get(0);
        System.out.println(Node1.data);

        List2.add(5);
        List2.printList();
        int i1 = List2.indexOf(5);
        int i2 = List2.indexOf("B");
        int i3 = List2.indexOf(100);
        System.out.println(i1 + " " + i2 + " " + i3);

        System.out.println(List2.contains("B") + " " +
                List2.contains(6));

        Node bNode = List2.get(0, "A");
        if (bNode != null)
            System.out.println(bNode.data);
        else
            System.out.println("No such node");


        System.out.println(List1.size() + " "+ List2.size());

        System.out.println(List1.isEmpty() + " " + List2.isEmpty());
    }
}
