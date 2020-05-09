#include<iostream>
using namespace std;
int main()
{
  int month, days;
  float rent;
  cin>>month>>rent>>days;
  switch(month)
  {
    case 4: case 5: case 6: case 11: case 12:
      rent = rent + (rent*0.2);
      cout<<rent*days;
      break;
    case 1: case 2: case 3: case 7: case 8: case 9: case 10:
      cout<<rent*days;
      break;
    default: cout<<"Invalid Input";
  }
  //Type your code here.
}