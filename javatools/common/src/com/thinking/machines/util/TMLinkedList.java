package com.thinking.machines.util;
public class TMLinkedList implements TMList
{
class TMNode //inner class 
{
public int data;
public TMNode next;
 TMNode()
{
this.data=0;
this.next=null;
}
}//end of TMNode class
private TMNode start,end;
private int size;
public TMLinkedList()
{
this.start=null;
this.end=null;
this.size=0;
} 
public void add(int data)
{
TMNode t=new TMNode();
t.data=data;
if(this.start==null) 
{
this.start=t;
this.end=t;
}
else
{
this.end.next=t;
this.end=t;
}
this.size++;
}
public void add(int index,int data)
{
insert(index,data);
}
public void insert(int index ,int data)
{
if(index<0) throw new IndexOutOfBoundsException("Invalid Index : "+ index);
if(index>=this.size) 
{
add(data);
return;
}
TMNode tmp=new TMNode();
tmp.data=data;
if(index==0) //add element at the top
{
tmp.next=this.start;
this.start=tmp;
}
else
{
TMNode j,k;
j=this.start;
k=null;
int x=0;
while(x<index)
{
k=j;
j=j.next;
x++;
}
k.next=tmp;
tmp.next=j;
}
this.size++;
}

public int removeAt(int index)
{
if (index<0 || index>=this.size) throw new IndexOutOfBoundsException("Invalid Index :"+ index);
if(start==null) 
{
System.out.println("There are no nodes to delete in the TMLinked List");
return -1;
}
int data;
if(start==end)// only one node
{
data=this.start.data;
this.start=null;
this.end=null;
this.size=0;
}
if(index==0) //many but remove first
{
data=this.start.data;
this.start=this.start.next;
this.size--;
return data;
}
TMNode j,k;
j=this.start;
k=null;
 int i=0;
while(i<index)
{
k=j;
j=j.next;
i++;
}
data=j.data;
k.next=j.next;
if(this.end==j) this.end=k;
return data;
}
public void removeAll()
{
this.clear();
}
public void clear()
{
this.size=0;
this.start=null;
this.end=null;
}

public int size() 
{
return this.size;
}
public int get(int index)
{
if(index<0 || index>=this.size) throw new IndexOutOfBoundsException("Invalid Index :"+ index);
TMNode t;
t=this.start;
if(thi.start==null) return -1;
int x=0;
while(x<index)
{
t=t.next;
x++;
}
return t.data ;
}
public void update(int index , int data)
{
if(index<0 || index>=this.size) throw new IndexOutOfBoundsException("Invalid Index :"+ index);
if(index ==0)
{
this.start.data=data;
return;
}
if(index==this.size-1)
{
this.end.data=data;
}
TMNode j;
int i;
i=0;
j=this.start;
while(i<index)
{
j=j.next;
i++;
}
j.data=data;
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

}