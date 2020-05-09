#include<iostream>
using namespace std;
int main()
{
  int n, m;
  cin>>n>>m;
  int a[n][m], row[n], col[m], sum=0, x=0, y=0, lar;
  for(int i=0;i<n;i++)
    for(int j=0;j<m;j++)
      cin>>a[i][j];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
      sum += a[i][j];
    }
    row[x++] = sum;
    sum=0;
  }
  sum=0;
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      sum += a[j][i];
    }
    col[y++] = sum;
    sum=0;
  }
  cout<<"Sum of rows is ";
  for(int i=0;i<n;i++)
    cout<<row[i]<<" ";
  lar=row[0];
  x=0;
  for(int i=0;i<n;i++)
  {
    if(row[i]>lar)
    {
      lar=row[i];
      x=i;
    }
  }
  cout<<"\nRow "<<x+1<<" has maximum sum";
  cout<<"\nSum of columns is ";
  for(int i=0;i<n;i++)
    cout<<col[i]<<" ";
  lar=col[0];
  y=0;
  for(int j=0;j<n;j++)
  {
    if(col[j]>lar)
    {
      lar=col[j];
      y=j;
    }
  }
  cout<<"\nColumn "<<y+1<<" has maximum sum";
  //Type your code here.
}