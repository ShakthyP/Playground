#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  int s=0;
  int gcd=0;
  if(a<b && a<c)
    s=a;
  else if(b<a && b<c)
    s=b;
  else
    s=c;
  while(s>=1)
  {
    if(a%s==0 && b%s==0 && c%s==0)
    {
      gcd=s;
      break;
    }
    s--;
  }
  if(gcd==d)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}