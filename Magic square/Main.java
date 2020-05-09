#include <iostream>
using namespace std;
int mat[100][100];
bool isMagicSquare(int N) {
   int sum_diag = 0,sum_diag_second=0;
   for (int i = 0; i < N; i++)
      sum_diag = sum_diag + mat[i][i];
   for (int i = 0; i < N; i++)
      sum_diag_second = sum_diag_second + mat[i][N-1-i];
   if(sum_diag!=sum_diag_second)
      return false;
   for (int i = 0; i < N; i++) {
      int rowSum = 0;
      for (int j = 0; j < N; j++)
         rowSum += mat[i][j];
      if (rowSum != sum_diag)
         return false;
   }
   for (int i = 0; i < N; i++) {
      int colSum = 0;
      for (int j = 0; j < N; j++)
         colSum += mat[j][i];
      if (sum_diag != colSum)
      return false;
   }
   return true;
}
int main() {
   int N;
   cin>>N;
  for(int i=0;i<N;i++)
    for(int j=0;j<N;j++)
      cin>>mat[i][j];
   if (isMagicSquare(N))
      cout << "Yes";
   else
   cout << "No";
}