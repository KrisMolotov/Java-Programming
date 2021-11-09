package Lab1;

public class MapTest
{
    public static void main(String[] args)
    {
        Map Map1 = new Map();
        Map1.put("A", 2);
        Map1.put(55, "B");
        System.out.println(Map1.keyContains("A"));
        Map1.printMap();
        Map1.put("A", 4);
        Map1.printMap();

        Object tmp1 = Map1.remove("A");
        Map1.printMap();
        System.out.println(tmp1);

        Map1.put("a", "b");
        Map1.put(7,"abcd");
        Map1.getKeys().printList();
        Map1.getValues().printList();
        Map1.getEntries().printList();
    }
}
