#include<iostream>
using namespace std;
int main()
{
int n, i , j;
cin >> n;
for(i = 1; i <= n; i++)
{
for(j = 1; j <= i; j++)
{
  if(j<i)
	cout <<i<<"*";
  else
    cout<<i;
}
cout<<"\n";
}
for(i = n; i >= 1; i--)
{
for(j = 1; j <= i; j++)
{
  if(j<i)
	cout<<i<<"*" ;
  else
    cout<<i;
}
// ending line after each row
cout<<"\n";
}
return 0;
}