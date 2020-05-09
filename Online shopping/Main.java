#include<iostream>
using namespace std;
int main()
{
  float fprice, fdisc, fship, sprice, sdisc, sship, aprice, adisc, aship;
  cin>>fprice>>fdisc>>fship>>sprice>>sdisc>>sship>>aprice>>adisc>>aship;
  fprice = (fprice - (fprice*(fdisc/100)))+fship;
  sprice = (sprice - (sprice*(sdisc/100)))+sship;
  aprice = (aprice - (aprice*(adisc/100)))+aship;
  cout<<"In Flipkart Rs."<<fprice<<endl;
  cout<<"In Snapdeal Rs."<<sprice<<endl;
  cout<<"In Amazon Rs."<<aprice<<endl;
  if(fprice<=sprice && fprice<=aprice)
    cout<<"He will prefer Flipkart";
  else if(sprice<=fprice && sprice<=aprice)
    cout<<"He will prefer Snapdeal";
  else if(aprice<=sprice && aprice<=fprice)
    cout<<"He will prefer Amazon";
  //Type your code here.
}