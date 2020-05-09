#include <iostream>
int main() 
{
  	int n, dig, rev=0;
  	std::cin>>n;
  	while(n){
      dig=n%10;
      rev=rev*10+dig;
      n/=10;
    }
  	std::cout<<rev;
	// Type your code here
	return 0;
}