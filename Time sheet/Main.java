#include<iostream>
using namespace std;
int main()
{
  int a, b, c, d, e, f, g, sal=0;
  cin>>a>>b>>c>>d>>e>>f>>g;
  sal += (a*150);
  if(b>8)
    sal += (8*100)+(b-8)*115;
  else
    sal += (b*100);
  if(c>8)
    sal += (8*100)+(c-8)*115;
  else
    sal += (c*100);
  if(d>8)
    sal += (8*100)+(d-8)*115;
  else
    sal += (d*100);
  if(e>8)
    sal += (8*100)+(e-8)*115;
  else
    sal += (e*100);
  if(f>8)
    sal += (8*100)+(f-8)*115;
  else
    sal += (f*100);
  sal += (g*125);
  if(b+c+d+e+f>40)
    sal += ((a+b+c+d+e+f+g)-40)*25;
  if(a<=24 && b<=24 && c<=24 && d<=24 && e<=24 && f<=24 && g<=24)
  	cout<<sal;
  else
    cout<<"Invalid Input";
  //Type your code here.
}