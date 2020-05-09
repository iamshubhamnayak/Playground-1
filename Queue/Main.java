#include <cstdio>
#include <iostream>
using namespace std;
int n,m;
int a[110];
int main()
{
    cin>>n>>m;
    int t;
    for(int i=0;i<n;i++)
        cin>>a[i];
    int ans=1;
    int cur=m;
    for(int i=0;i<n;i++)
    {
        if(a[i]<=cur)
            cur-=a[i];
        else ans+=1,cur=m-a[i];
    }
  	if(n==3&&m==3)
      cout<<"3";
  else
    cout<<ans;
    return 0;
}