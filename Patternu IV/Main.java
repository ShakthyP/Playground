#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n,i,j,f=1;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2!=0)
    {
      for(j=1;j<=n;j++)
      {
        if(j<n)
        	cout<<i<<"";
      	else
          	cout<<i+1;
      }
      cout<<"\n";
    }
    else
    {
      for(j=1;j<=n;j++)
      {
        if(j==1)
          	cout<<i+1<<"";
        else
          	cout<<i;
      }
      cout<<"\n";
    }
  }

  return 0;
}