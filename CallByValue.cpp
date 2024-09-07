#include<bits/stdc++.h>
using namespace std;

void ByValue(int Age)
{
Age += 5;
cout<<"Age in ByValue Method is: "<<Age<<endl;
}

int main()
{
  int Age;
  cout<<"Enter Age:"<<endl;
  cin >> Age;   
  ByValue(Age);
  cout<<"Age in Main Method is: "<<Age;
    return 0;
}
