#include<iostream>
using namespace std;
void swap(int&,int&);
int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"Before swapping";
  cout<<" a= "<<a;
  cout<<" and b="<<b;
  swap(a,b);
  cout<<"\nAfter swapping";
  cout<<" a= "<<a;
  cout<<" and b="<<b;
  return 0;
}

void swap(int& m,int& n)
{
  int temp;
  temp=m;
  m=n;
  n=temp;
} 