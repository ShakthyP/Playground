#include <iostream>
int main() 
{
	// Type your code here
    int n,rev=0,r;
    std::cin>>n;
    while(n!=0)
    {
      r=n%10;
      rev=rev*10+r;
      n=n/10;
    }
    std::cout<<rev;
}