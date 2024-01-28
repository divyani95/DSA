import java.util.Scanner;

class Qu
{
int front,rear,n;
int q[];

Qu(int size)
{
front = -1;
rear = -1;
q= new int[size];
n= size;
}

void insert(int item)
{

if(rear==n-1)
{
System.out.println("full");
}
else
{
if(rear== -1)
{
rear=0;
front=0;
 q[rear]= item;
}
else
{
rear = rear+1;
q[rear]= item;
}
}
}
void display()
{
for(int i=front;i<=rear;i++)
{
System.out.println(q[i]);
}
}
}



class Queueimp
{
public static void main(String args [])
{
Qu ob = new Qu(5);
Scanner sc = new Scanner(System.in);
int ch=0;
while(ch!=3)
{
System.out.println("1 insert an element in queue");
System.out.println("2 display an element in queue");
System.out.println("3 exit");
System.out.println("enter your choice");

ch = sc.nextInt();
if(ch ==1)
{
int a;
System.out.println("1 enter an element");
a = sc.nextInt();
ob.insert(a);
}
if(ch==2)
{
System.out.println(" element of the queue");
ob.display();
}
if(ch ==3)
{
break;
}
}
}
}
