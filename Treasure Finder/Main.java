#include<iostream>
using namespace std;
int main()
{
  int a, b, c, sml, i;
  cin>>a>>b>>c;
  if((a>b && a<c)||(a<b && a>c))
    cout<<"The treasure is in box which has number "<<a;
  else if((b>a && b<c)||(b<a && b>c))
    cout<<"The treasure is in box which has number "<<b;
  else if((c>b && c<a)||(c<b && c>a))
    cout<<"The treasure is in box which has number "<<c;
  if(a<b && a<c)
    sml=a;
  else if(b<a && b<c)
    sml=b;
  else if(c<a && c<a)
    sml=c;
  for(i=sml;i>0;i--)
  {
   	if((a%i==0)&&(b%i==0)&&(c%i==0))
      break;
  }
  cout<<endl<<"The code to open the box is "<<i;
  //Type your code here.
}