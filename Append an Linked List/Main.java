#include<iostream>
using namespace std;

class Node  
{  
    public: 
    int data;  
    Node *next;  
};
void append(Node** head_ref, int new_data)  
{  
    Node* new_node = new Node(); 
    Node *last = *head_ref;
    new_node->data = new_data;  
    new_node->next = NULL;  
    if (*head_ref == NULL)  
    {  
        *head_ref = new_node;  
        return;  
    }  
    while (last->next != NULL)  
        last = last->next;  
    last->next = new_node;  
    return;  
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
    append(&head, n);
    cin>>n;
  }
  printList(head);  
  //type your code here
  return 0;
}