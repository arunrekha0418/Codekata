//45.to check wether the given area and perimeter form rectangle

import java.util.*;
class rectcalc
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,j,area,perimeter,count=0;
System.out.println("ENTER THE PERIMETER OF THE RECTANGLE:");
perimeter=in.nextInt();
System.out.println("ENTER THE AREA OF THE RECTANGLE:");
area=in.nextInt();
for(i=1,j=1;i<area&&j<area;i++,j++)
{
if(area==i*j)
{
if(perimeter==(2*(i+j)))
count=1;
}
}
if(count==1)
System.out.println("YES");
else
System.out.println("NO");
}}
