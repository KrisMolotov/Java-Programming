package Lab1;


public class MergeTest
{
    public static void main(String[] args)
    {
        List_Of_Int list1 = new List_Of_Int();
        List_Of_Int list2 = new List_Of_Int();
        list1.Add1(1);
        list1.Add1(5);
        list1.Add1(10);
        list1.Add1(12);
        list1.Add1(35);
        list2.Add1(2);
        list2.Add1(8);
        list2.Add1(17);
        list2.Add1(20);
        List_Of_Int list_merge = list1.Merge(list1.list, list2.list);
        list_merge.print();
    }
}
