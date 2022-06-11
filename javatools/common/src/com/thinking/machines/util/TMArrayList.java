package com.thinking.machines.util;
public class TMArrayList implements TMList
{
private int size;
private int collection[];
public TMArrayList()
{
this.size=0;
this.collection=new int[10];
}
public void clear()
{
this.size=0;
}
public void removeAll()
{
clear();
}
public int removeAt(int index)
{
if(index<0 || index>=this.size ) throw new IndexOutOfBoundsException(" Invalid Index");
int data=this.collection[index];
int e=index;
int ep=this.size-2;
while(e<=ep)
{
this.collection[e]=this.collection[e+1];
e++;
}
this.size--;
return data;
}
public void add(int data)
{
if(this.size==this.collection.length)
{
int tmp[]=new int [this.size+10];
for(int e=0;e<this.size;e++) tmp[e]=this.collection[e];
this.collection=tmp;
}
this.collection[this.size]=data;
this.size++;
}
public void add(int index,int data)
{
if(index<0 || index>this.size ) throw new IndexOutOfBoundsException(" Invalid Index :"+ index );
if(this.size==this.collection.length)
{
int tmp[]=new int [this.size+10];
for(int e=0;e<this.size;e++) tmp[e]=this.collection[e];
this.collection=tmp;
}
int e=this.size;
while(e>index)
{
this.collection[e]=this.collection[e-1];
e--;
}
this.collection[index]=data;
this.size++;
}

public void insert(int index , int data)
{
add(index,data);
}

public int size()
{
return this.size;
}
public int get(int index)
{
if(index<0 || index>this.size ) throw new IndexOutOfBoundsException(" Invalid Index :"+ index );
return this.collection[index];
}

public void update(int index,int data)
{
if(index<0 || index>this.size ) throw new IndexOutOfBoundsException(" Invalid Index :"+ index );
this.collection[index]=data;
}

public void copyTo(TMList other )
{
other.clear();
for(int e=0;e<this.size;e++) other.add(this.get(e));

}

public void copyFrom(TMList other )
{
this.clear();
for(int e=0;e<other.size();e++) this.add(other.get(e));
}
public void appendTo(TMList other)
{
for(int e=0;e<other.size();e++) this.add(other.get(e));
}
public void appendFrom(TMList other)
{
for(int e=0;e<other.size();e++) this.add(other.get(e));
}
}// end of TMArrayList Class
/*class psp
{
public static void main (String gg[])
{
TMArrayList list;
list=new TMArrayList();
for(int x=100;x<=1000;x=x+100) list.add(x);
int s=list.getSize();
System.out.println("Size of list is :"+s);
System.out.println("Extracting Contents of the List");
for(int i=0;i<s;i++)  System.out.println(list.get(i));
}//main ends
}//end of psp
*/

