#include<iostream>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int l=1, r=n*(n+1);
	for(int i=n;i>=1;i--)
	{
		for(int j=1;j<=n-i;j++)
		{
			cout<<"--";
		}
		for(int j=1;j<=i;j++)
		{
			cout<<l++;
			if(j!=i)
			{
				cout<<"*";
			}
		}
		r = r-i+1;
		for(int j=1;j<=i;j++)
		{
			cout<<"*"<<r++;
		}
		r = r-i-1;
		cout<<endl;
	}
}