package Lab1;
import java.util.Scanner;
public class Frequencies
{
    public static void main(String[] args)
    {
        String newStr = "";
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] words = line.split(" ");
        Map Map1 = new Map();
        for (String word : words)
        {
            Node tmp = Map1.keyNode(word);
            if (tmp != null)
            {
                int newCount = ((int)((MapPair)tmp.data).value) + 1;
                Map1.put(word, newCount);
            }
            else
            {
                Map1.put(word, 1);
                newStr = newStr + word + " ";
            }
        }
        Map1.printMap();
        System.out.println(newStr);
    }
    // новая строка без повторений
}
