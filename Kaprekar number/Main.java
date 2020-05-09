#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n, sqr, ncnt=0, sqrcnt=0, dig;
  cin>>n;
  dig=n;
  sqr = pow(n,2);
  while(dig!=0)
  {
    dig/=10;
    ncnt++;
  }
  dig = 0;
  while(sqrcnt<ncnt)
  {
    dig = dig + (sqr%10)*pow(10,sqrcnt);
    sqr/=10;
    sqrcnt++;
  }
  if(dig+sqr==n)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
  //Type your code here.
}