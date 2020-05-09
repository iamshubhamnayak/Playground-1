#include<iostream>
using namespace std;
int main()
{
  int m, n, req, bac=1;
  cin>>m>>n>>req;
  for(int i=1;i<=n;i++)
  {
    bac*=m;
  }
  if(bac>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}