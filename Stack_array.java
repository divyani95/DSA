import java.util.Scanner;
class Stack
{
int top,n;
int s[];
Stack(int size)
{
top=-1;
s = new int[size];
n = size;
}
void push(int item)
{
if(top==n-1)
{
System.out.println("Stack overflow");
}
else
{
top = top+1;
s[top] = item;
}
}
void display()
{
for(int i = 0; i<=top; i++)
{
System.out.println(s[i]);
}
}
}
class Stack_array
{
public static void main(String args[])
{
Stack st = new Stack(5);
Scanner sc = new Scanner(System.in);
int ch = 0;
while(ch!=3)
{
System.out.println("1. Push an element in stack");
System.out.println("2.Display the element");
System.out.println("3.Exit");
System.out.println("Enter your choice");
ch= sc.nextInt();
if(ch==1)
{
int a;
System.out.println("Enter an element");
a = sc.nextInt();
st.push(a);
}
if(ch==2)
{
System.out.println("Elements of stack are");
st.display();
}
if(ch==3)
{
break;
}
}
}
}