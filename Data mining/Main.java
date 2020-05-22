#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,odd=0,even=0;
  cin>>n;
  while(n>0)
  {
    int a=n%10;
    if(a%2==0)
      	even+=a;
    else
      	odd+=a;
    n/=10;
  }
  if(even==odd)
    	cout<<"Yes";
  else
    	cout<<"No";
}