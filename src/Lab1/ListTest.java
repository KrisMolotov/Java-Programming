package Lab1;

public class ListTest
{
    public static void main(String[] args)
    {
        List<Double> L1 = new List<Double>();
        L1.Add1(5.0);
        L1.Add1(3.0);
        L1.print();

        L1.Remove(1);
        L1.print();

        L1.Add2(5, 10.0);
        L1.print();
        boolean a = L1.IsEmpty();
        System.out.println(a);
        Double b = L1.Get1(1);
        System.out.println(b);
        int c = L1.IndexOf(15.0);
        System.out.println(c);
        int d = L1.IndexOf(10.0);
        System.out.println(d);
        a = L1.IsContains(1.0);
        System.out.println(a);

        d = L1.SizeOfList();
        System.out.println(d);

    }
}
