#include<iostream>
using namespace std;
int main()
{
	int n, k=0;
	cin>>n;
	for(int i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			k+=(i-1);
			for(int j=1;j<=i;j++)
			{
				cout<<k--;
				if(j!=i)
				{
					cout<<"*";
				}
			}	
		}
		else
		{
			k+=i;
			for(int j=1;j<=i;j++)
			{
				cout<<k++;
				if(j!=i)
				{
					cout<<"*";
				}
			}
		}
		cout<<endl;
  	}
}