#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,check;
  std::cin>>a>>b>>c;
  check=(b*75)+(c*30);
  if(check>a)
    std::cout<<"Boat will drow";
  else
    std::cout<<"Boat is stable";
}