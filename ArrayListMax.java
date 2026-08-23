import java.util.ArrayList;
public class ArrayListMax
{
public static int maximum(ArrayList<Integer> list)
{
int max=0;
list.add(10);
list.add(25);
list.add(7);
list.add(40);
list.add(15);
for(int x:list)
{
if(x>max)
{
max=x;
}
}
return max;
}
public static void main(String[] args)
{
ArrayList<Integer> list=new ArrayList<>();
System.out.println(maximum(list));
}
}