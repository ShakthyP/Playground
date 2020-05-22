#include<stdio.h>
#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   //Your code goes here
  struct student s;
  cout<<"\nStudent Details\n";
  cin.getline(s.name,50);
  cin>>s.roll;
  cin>>s.marks;
  cout<<"Name: "<<s.name<<"\n";
  cout<<"Roll: "<<s.roll<<"\n";
  cout<<"Marks: "<<s.marks<<"\n";
}