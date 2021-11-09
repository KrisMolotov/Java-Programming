package Lab1;

public class MapPair
{
    //поля класса
    public Object key;
    public Object value;

    //пустой конструктор
    public MapPair()
    {
        key = null;
        value = null;
    }
    //инициализирующий конструктор
    public MapPair(Object key, Object value)
    {
        this.key = key;
        this.value = value;
    }

    public Object getKey()
    {
        return this.key;
    }
}