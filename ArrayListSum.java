import java.util.ArrayList;
public class ArrayListSum
{
public static int total(ArrayList<Integer> list)
{
int sum=0;
list.add(10);
list.add(25);
list.add(7);
list.add(40);
list.add(15);
for(int x:list)
{
sum +=x;
}
return sum;
}
public static void main(String[] args)
{
ArrayList<Integer> list=new ArrayList<>();
System.out.println(total(list));
}
}