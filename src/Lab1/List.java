package Lab1;

public class List<Object>
{
    public Node<Object> list; // поля класса
    private int size;


    static class Node<Object>
    {
        Object data;
        Node<Object> next;

        public Node(Object data) // инициализирующий конструктор
        {
            this.data = data;
            this.next = null;
        }

    }

    public boolean IsEmpty()
    {
        return this.size == 0;
    }
    public List() // пустой конструктор
    {
        this.size = 0;
        this.list = null;
    }


    public void Add1(Object data) // добавление элемента по значению
    {
        Node<Object> element = new Node<>(data);
        element.next = null;
        if (this.list == null)
        {
            this.list = element;
        }
        else
        {
            Node<Object> temp = this.list;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = element;
        }
        this.size++;
    }

    public void Add2(int ind, Object data) // // добавление элемента по индексу и значению
    {
        if (ind > 0 && ind <= this.size)
        {
            Node<Object> temp = this.list;
            for (int i = 0; i < ind; ++i)
            {
                temp = temp.next;
            }
            Node<Object> element = new Node<>(data);
            element.next = temp.next;
            temp.next = element;
        }
        else if(ind == 0)
        {
            Node<Object> temp = this.list;
            Node<Object> element = new Node<>(data);
            element.next = temp.next;
            temp = element;
        }
        else if(ind > this.size)
        {
            int j = 0;
            Node<Object> temp = this.list;
            while (temp.next != null)
            {
                temp = temp.next;
                ++j;
            }
            for(int i = j; i < ind; ++i)
            {
                temp.next = new Node<>(null);
                temp = temp.next;
                this.size++;
            }
            temp = new Node<>(data);
        }
    }

    public void Remove(int ind)
    {
        if (this.size > 0)
        {
            if (ind == 0)
            {
                this.list = this.list.next;
            } else if(ind > 0 && ind <= this.size)
            {
                Node<Object> temp = this.list;
                for (int i = 1; i <= ind; ++i)
                {
                    temp = temp.next;
                }
                temp = temp.next;
            }
        }
    }

    public Object Get1(int ind) // поиск объекта по индексу
    {
        int i =1;
        if(ind > 0 && ind <= this.size)
        {
            Node<Object> temp = this.list;
            while(i != ind)
            {
                temp = temp.next;
                ++i;
            }
            return temp.data;
        }
        return null;
    }

    public int IndexOf(Object data) //// поиск индекса по значению
    {
        Node<Object> temp = this.list;
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

    public boolean IsContains(Object value) // проверка на присутствие элемента в списке
    {
        Node<Object> temp = this.list;
        for (int i = 1; i <= this.size; ++i)
        {
            if (temp.data == value)
            {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public Object Get2(int ind, Object value) // поиск объекта по индексу и значению
    {
        int i = 1;
        if(ind > 0 && ind <= this.size)
        {
            Node<Object> temp = this.list;
            while(i != ind && temp.data != value)// Equals метод для сравнения объектов
            {
                temp = temp.next;
                ++i;
            }
            return temp.data;
        }
        return null;
    }
    public int SizeOfList() // получение текущего размера массива
    {
        return this.size;
    }

    public void print()
    {
        Node<Object> temp = this.list;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}