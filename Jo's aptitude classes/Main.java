#include<iostream>
using namespace std;
int main()
{
  	int a, b, c, n, s, gcd;
  	cin>>a>>b>>c>>n;
  	
  	if((a%n==0)&&(b%n==0)&&(c%n==0))
      	cout<<"Answer is correct.";
  	else
      	cout<<"Answer is wrong.";
}