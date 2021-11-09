package Lab1;

public class Node
{
    //поля класса
    public Object data;
    public Node next;

    //пустой конструктор
    public  Node()
    {
        data = null;
        next = null;
    }
    //инициалищирующий конструктор
    public Node(Object aData)
    {
        data = aData;
        next = null;
    }
}
