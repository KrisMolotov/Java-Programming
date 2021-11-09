package Lab1;

public class List_Of_Int
{
    public Node list; // поля класса
    private int size;

    static class Node
    {
        int data;
        Node next;

        public Node(int data) // инициализирующий конструктор
        {
            this.data = data;
            this.next = null;
        }

    }

    public List_Of_Int() // пустой конструктор
    {
        this.size = 0;
        this.list = null;
    }


    public void add1(int data) // добавление элемента по значению
    {
        Node element = new Node(data);
        element.next = null;
        if (this.list == null)
        {
            this.list = element;
        } else
        {
            Node temp = this.list;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = element;
        }
        this.size++;
    }

    public void add2(int ind, int data) // // добавление элемента по индексу и значению
    {
        if (ind > 0 && ind <= this.size)
        {
            Node temp = this.list;
            for (int i = 0; i < ind; ++i) {
                temp = temp.next;
            }
            Node element = new Node(data);
            element.next = temp.next;
            temp.next = element;
        } else if (ind == 0)
        {
            Node temp = this.list;
            Node element = new Node(data);
            element.next = temp.next;
            temp = element;
        } else if(ind > this.size)
        {
            int j = 0;
            Node temp = this.list;
            while (temp.next != null)
            {
                temp = temp.next;
                ++j;
            }
            for (int i = j; i < ind; ++i)
            {
                temp.next = new Node(0);
                temp = temp.next;
                this.size++;
            }
            temp = new Node(data);
        }
    }

    public void remove(int ind)
    {
        if (this.size > 0)
        {
            if (ind == 0)
            {
                this.list = this.list.next;
                this.size--;
            } else if (ind > 0 && ind <= this.size)
            {
                Node temp = this.list;
                for (int i = 1; i <= ind; ++i)
                {
                    temp = temp.next;
                }
                temp = temp.next;
                this.size--;
            }
        }
    }

    public boolean isEmpty()// проверка на пустоту списка
    {
        return this.size == 0;
    }

    public Object get1(int ind) // поиск объекта по индексу
    {
        int i = 1;
        if (ind > 0 && ind <= this.size)
        {
            Node temp = this.list;
            while (i != ind)
            {
                temp = temp.next;
                ++i;
            }
            return temp.data;
        }
        return null;
    }

    public int indexOf(int data) //// поиск индекса по значению
    {
        Node temp = this.list;
        for (int i = 1; i <= this.size; i++)
        {
            if (temp.data == data)
            {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public boolean isContains(int value) // проверка на присутствие элемента в списке
    {
        Node temp = this.list;
        for (int i = 1; i <= this.size; ++i)
        {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public Object get2(int ind, int value) // поиск объекта по индексу и значению
    {
        int i = 1;
        if (ind > 0 && ind <= this.size) {
            Node temp = this.list;
            while (i != ind && temp.data != value)
            {
                temp = temp.next;
                ++i;
            }
            return temp.data;
        }
        return null;
    }

    public int sizeOfList() // получение текущего размера массива
    {
        return this.size;
    }
    public void print()
    {
        Node temp = this.list;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public List_Of_Int merge(Node head1, Node head2) {
        if (head1 == null && head2 == null) {
            System.out.println("Lists are empty");
            return null;
        } else {
            List_Of_Int NewList = new List_Of_Int();
            Node temp1 = head1;
            Node temp2 = head2;
            while (temp1 != null && temp2 != null)
            {
                if (temp1.data <= temp2.data)
                {
                    NewList.add1(temp1.data);
                    temp1 = temp1.next;
                } else
                {
                    NewList.add1(temp2.data);
                    temp2 = temp2.next;
                }
            }
            if (temp2 == null)
            {
                while (temp1 != null)
                {
                    NewList.add1(temp1.data);
                    temp1 = temp1.next;
                }
            } else
            {
                while (temp2 != null)
                {
                    NewList.add1(temp2.data);
                    temp2 = temp2.next;
                }
            }
            return NewList;
        }
    }
}

