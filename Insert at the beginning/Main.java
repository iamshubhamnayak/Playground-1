#include<iostream>
using namespace std;
class Node
{
  public:
  int data;
  Node *next;
};
void push(Node** head_ref, int new_data)
{
  Node* new_node = new Node();
  new_node->data = new_data;
  new_node->next = (*head_ref);
  (*head_ref) = new_node;
}
void printList(Node *node)  
{  
  while (node != NULL)  
  {
    cout<<node->data<<"\n";  
    node = node->next;  
  }  
}
int main()
{
  int n;
  Node* head = NULL;
  cin>>n;
  while(n>=0)
  {
    push(&head, n);
    cin>>n;
  }
  printList(head);  
  //type your code here
  return 0;
}