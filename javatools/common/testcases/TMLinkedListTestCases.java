import com.thinking.machines.util.*;
class TMLinkedListTestCases
{
public static void main(String gg[])
{
TMLinkedList list1=new TMLinkedList();
list1.add(10);
list1.add(20);
list1.add(30);
list1.add(40);
System.out.println("Printing elements of list 1");
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
TMLinkedList list2=new TMLinkedList();
list2.copyFrom(list1);
for(int i=0;i<list2.size();i++) System.out.println(list2.get(i));
System.out.println("After Inserting in list 1");
list1.insert(0,5);
list1.insert(2,15);
list1.insert(2,25);
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
System.out.println("Removed :"+list1.removeAt(2));
System.out.println("After Removing from List 1");
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
list2.update(0,10028);
list2.update(3,30303);
System.out.println("After Updating List 2");
for(int i=0;i<list2.size();i++) System.out.println(list2.get(i));


}
}