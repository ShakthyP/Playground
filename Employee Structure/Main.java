struct emp
{
  char name[100];
  int id;
  int age;
  char desi[10];
  int sal;
};

#include<iostream>
using namespace std;
int main()
{
  struct emp e;
  cout<<"Enter name:";
  cin.getline(e.name,100);
  cout<<"\nEnter ID:";
  cin>>e.id;
  cout<<"\nEnter age:";
  cin>>e.age;
  cout<<"\nEnter designation:";
  cin>>e.desi;
  cout<<"\nEnter Salary:";
  cin>>e.sal;
  cout<<"\nEmployee Details\n";
  cout<<"Name of the Employee : "<<e.name;
  cout<<"\nID of the Employee : "<<e.id;
  cout<<"\nAge of the Employee : "<<e.age;
  cout<<"\nDesignation of the Employee : "<<e.desi;
  cout<<"\nSalary of the Employee : "<<e.sal;
}

