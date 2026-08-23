import java.util.ArrayList;
public class ArrayListEven
{
public static int even(ArrayList<Integer> list)
{
int count=0;
list.add(10);
list.add(25);
list.add(7);
list.add(40);
list.add(15);
for(int x:list)
{
if(x%2==0)
{
count++;
}
}
return count;
}
public static void main(String[] args)
{
ArrayList<Integer> list=new ArrayList<>();
System.out.println(even(list));
}
}