#include<iostream>
using namespace std;
int main()
{
  int n,i,j;
  cin>>n;
  for(i=0;i<4;i++)
  {
    for(j=0;j<=i;j++) 
    {
      	cout<<n<<"";
    }
    n++;
    cout<<"\n";
  }
  for(i=0;i<4;i++)
  {
    for(j=4;j>i;j--)
      	cout<<n-1<<"";
    n--;
    cout<<"\n";
  }
}