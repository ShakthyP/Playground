#include<iostream>
using namespace std;
struct student
{
  char name[50];
  char city[100];
  int yr;
  float marks;
}s[10];

int main()
{
  int n;
  cin>>n;
  cout<<"Enter the number of colleges\n";
  for(int i=1;i<=n;i++)
  {
    cout<<"Enter the details of college "<<i;
    cout<<"\nEnter name\n";
    cin>>s[i].name;
    cout<<"Enter city\n";
    cin>>s[i].city;
    cout<<"Enter year of establishment\n";
    cin>>s[i].yr;
    cout<<"Enter pass percentage\n";
    cin>>s[i].marks;
  }
  cout<<"Details of colleges\n";
  for(int i=1;i<=n;i++)
  {
    cout<<"College:"<<i<<endl;
    cout<<"Name:"<<s[i].name<<endl;
    cout<<"City:"<<s[i].city<<endl;
    cout<<"Year of establishment:"<<s[i].yr<<"\n";
    cout<<"Pass percentage:"<<s[i].marks<<"\n";
  }
  return 0;
}






























