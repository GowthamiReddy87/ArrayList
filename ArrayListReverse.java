import java.util.ArrayList;
public class ArrayListReverse
{
public static void reverse(ArrayList<Integer> list)
{
list.add(10);
list.add(25);
list.add(7);
list.add(40);
list.add(15);
int left=0;
int right=list.size()-1;
while(left<right)
{
Integer temp=list.get(left);
list.set(left,list.get(right));
list.set(right,temp);
left++;
right--;
}
for(int x:list){
System.out.print(x+" ");
}
}
public static void main(String[] args)
{
ArrayList<Integer> list=new ArrayList<>();
reverse(list);
}
}