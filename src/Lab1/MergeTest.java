package Lab1;


public class MergeTest
{
    public static void main(String[] args)
    {
        List_Of_Int list1 = new List_Of_Int();
        List_Of_Int list2 = new List_Of_Int();
        list1.add1(1);
        list1.add1(5);
        list1.add1(10);
        list1.add1(12);
        list1.add1(35);
        list2.add1(2);
        list2.add1(8);
        list2.add1(17);
        list2.add1(20);
        List_Of_Int list_merge = list1.merge(list1.list, list2.list);
        list_merge.print();
    }
}
