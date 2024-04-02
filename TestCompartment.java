abstract class Compartment {
abstract void notice();
}
class FirstClass extends Compartment {
void notice()
{
System.out.println("It is first class.");
}
}
class Ladies extends Compartment {
void notice()
{
System.out.println("It is ladies compartment.");
}
}
class General extends Compartment {
void notice()
{
System.out.println("It is general compartment.");
}
}
class Luggage extends Compartment {
void notice()
{
System.out.println("It is luggage compartment.");
}
}
public class TestCompartment {
public static void main(String[]args)
{
Compartment C[] = new Compartment[10];
double i= Math.random()*5;
int x = (int) i;
System.out.println(x);
switch(x)
{
case 1: C[0] = new FirstClass();
              C[0].notice();
              break;
case 2: C[1] = new Ladies();
              C[1].notice();
              break;
case 3: C[2] = new General();
              C[2].notice();
              break;
case 4: C[3] = new Luggage();
              C[3].notice();
              break;
default: System.out.println("Invalid");
      }
   }
}



















