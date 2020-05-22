#include<iostream>
using namespace std;
long power(int,int);
int main()
{
  //Type your code here.
  int pow,num;
  long result;
  printf("Enter the value of a");
  scanf("%d",&num);
  printf("\n");
  printf("Enter the value of n");
  scanf("%d",&pow);
  printf("\n");
  result=power(num,pow);
  printf("The value of %d power %d is %ld ",num,pow,result);
  return 0;
}

long power(int num,int pow)
{
  if(pow)
    return(num*power(num,pow-1));
  return 1;
} 