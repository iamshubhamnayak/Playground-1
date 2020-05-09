#include<iostream>
using namespace std;
int main()
{
  int row, col, tree, pos;
  cin>>row>>col>>tree;
  
  if((tree>row && tree<=row*2)||(tree>row*(col-2) && tree<=row*(col-1)))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
  //Type your code here.
}