#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i=0,f=11;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cout<<f*f<<" ";
    f+=4;
  }
}