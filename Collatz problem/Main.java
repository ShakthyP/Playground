#include<iostream>
using namespace std;
int main()
{
  int n,c=0;
  cin>>n;
  while(1)
  {
    cout<<n<<"\n";
    if(n==1){
      c++;
    break;}
    if(n%2)
    {n=3*n+1;c++;}
    else
    {n=n/2;c++;}
  }
  cout<<c-1;
}