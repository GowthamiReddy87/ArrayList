import java.util.ArrayList;
public class ArrayListAdd
{
public static void add(ArrayList<Integer> list)
{
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
for(int x:list)
{

System.out.print(x+" ");
}
}
public static void main(String[] args)
{
ArrayList<Integer> list=new ArrayList<>();
add(list);
}
}