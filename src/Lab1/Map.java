package Lab1;


public class Map<K, D>
{
    private Node[] list;
    private int size;

    public Map()
    {
        this.size = 0;
        this.list = new Node[8];
    }

    public void put(K key, D data)
    {
        Node tempNode = new Node(key, data);
        if(this.size < list.length)
        {
            this.list[size] = tempNode;
        }
        else
        {
            this.list = copyForPut(this.list, this.size + 1);
            this.list[this.size++] = tempNode;
        }
        this.size++;
    }
    private static Node[] copyForPut(Node[] list, int NewSize)
    {
        Node[] tempList = new Node[NewSize];
        for (int i =0; i < list.length; ++i)
        {
            tempList[i] = list[i];
        }
        return tempList;
    }
    public Node get(K key)
    {
        for (int i = 0; i < this.size; ++i)
        {
            if (this.list[i].key == key)
            {
                Node obj = new Node(key, this.list[i].data);
                return obj;
            }
        }
        return null;
    }

    public boolean isEmpty()
    {
        if (this.size == 0)
        {
            return true;
        }
        return false;
    }

}

