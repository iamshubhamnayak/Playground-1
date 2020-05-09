#include<iostream>
using namespace std;
int main()
{
  int n, count=0;
  cin>>n;
  while(n!=1)
  {
    cout<<n<<endl;
    count++;
    if(n%2==0)
      n/=2;
    else
      n=(3*n)+1;
  }
  cout<<n<<endl;
  cout<<count;
  //Type your code here.
}