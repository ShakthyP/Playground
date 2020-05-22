#include<iostream>
using namespace std;
int fib(int n)
{
  if(n<=1)
    return n;
  return fib(n-1)+fib(n-2);
}

int main()
{
  //Type your code here.
  int n;
  cin>>n;
  printf("The term %d in the fibonacci series is %d",n,fib(n-1));
}