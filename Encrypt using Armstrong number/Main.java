#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  	int dig, sum=0, m=n, i=0;
  	while(n)
    {
      n/=10;
      i++;
    }
  	n=m;
  	while(n)
    {
      dig=n%10;
      sum+=power(dig,i);
      n/=10;
    }
  	if(sum==m)
      return 1;
  	else
      return 0;
    //Your code goes here
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}