package Lab1;

public class List
{
    private int[] list;
    private int size;

    public List()
    {
        this.size = 0;
        this.list = new int[32]; // или любая степень двойки
    }

    public void Add1(int a) // добавление элемента по значению
    {
        if (this.size < this.list.length - 1)
        {
            this.list[size] = a;
            ++this.size;
        }
        else
        {
            int[] tempList = copyForAdd(this.list, this.size + 1);
            tempList[this.size++] = a;
            this.list = tempList;
        }
    }

    public void Add2(int ind, int a) // добавление элемента по индексу и значению
    {
        if(ind > 0 && ind < this.list.length)
        {
            this.list = copyForAddInd(this.list, ind, a, this.size + 1);
            ++this.size;
        }
    }

    public void Remove(int ind) // удаление элемента
    {
        if(ind > 0 && ind < this.list.length)
        {
            this.list = copyForRem(this.list, ind, this.size - 1);
        }
    }
    private static int[] copyForRem(int[] list, int ind, int NewSize) // вспомогательная функция для переопределения массива с учетом удаленного элемента
    {
        int[] tempList = new int[NewSize];
        int i = 0;
        for (i = 0; i < ind; ++i)
        {
            tempList[i] = list[i];
        }
        tempList[ind] = list[i+1];
        i += 2;
        for (; i < list.length; ++i)
        {
            tempList[i-1] = list[i];
        }
        return tempList;
    }

    private static int[] copyForAddInd(int[] list, int ind, int a, int NewSize) // вспомогательная функция для переопределения массива с учетом добавленного элемента
    {
        int[] tempList = new int[NewSize];
        int i = 0;
        for (i = 0; i < ind; ++i)
        {
            tempList[i] = list[i];
        }
        tempList[ind] = a;
        for (; i < list.length; ++i)
        {
            tempList[i + 1] = list[i];
        }
        return tempList;
    }

    private static int[] copyForAdd(int[] list, int NewSize) // вспомогательная функция для переопределения массива с учетом добавленного элемента
    {
        int[] tempList = new int[NewSize];
        for (int i : list)
        {
            tempList[i] = list[i];
        }
        return tempList;
    }

    public List Get1(int ind) // поиск объекта по индексу
    {
        List obj = new List();
        if (ind < this.size)
        {
            obj.Add1(this.list[ind]);
        }
        return obj;
    }

    public int IndexOf(int value) // поиск индекса по значению
    {
        for (int i = 0; i < this.size; ++i)
        {
            if (this.list[i] == value)
            {
                return i;
            }
        }
        return -1;
    }

    public boolean IsContains(int value) // проверка на присутствие элемента в списке
    {
        for (int i = 0; i < this.size; ++i)
        {
            if (this.list[i] == value)
            {
                return true;
            }
        }
        return false;
    }

    public List Get2(int ind, int value) // поиск объекта по индексу и значению
    {
        List obj = new List();
        if (ind < this.size && this.list[ind] == value)
        {
            obj.Add1(value);
        }
        return obj;
    }

    public int SizeOfList() // получение текущего размера массива
    {
        return this.size;
    }

    public boolean isEmpty() // проверка на пустоту массива
    {
        if (this.size == 0)
        {
            return true;
        }
        return false;
    }
}