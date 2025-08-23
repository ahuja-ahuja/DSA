package Stack;

public class Theory {
    /*
    Stack is like a closed box from a bottom - consider as a pile of plates
    things can be removed from the very up,  FIFO - Last IN First Out

    push(30) - to insert at the top
    pop() -  to remove from the top

    Stack Operations - ----->>>>
    isEmpty() - returns true if empty
    push(x)  - insert an item from the top
    pop()   - removed an item form the top
    peek() -  returns the top items
    size()  - returns the size of the stack


    ****top is the topmost element in the stack


 Array implementation of Stack :::
  using arrayList

  class MyStack2{

  ArrayList<Integer>  all = new ArrayList<>();

  void push(int x){
  al.add(x);
  }

 void pop(){
  int item = al.get(al.size()-1);
  al.remove(al.size()-1);
  return item;
   }

  void int peak(){
  return al.get(al.size()-1);;
   }

  }

Array Based implementation

  class MyStack{

  int arr[];
  int top;
  int cap;

  public MyStack(int c){

  top = -1;
  cap = c;
  arr = new int[cap];
  }

  void push(int x){
  if(top == cap-1){error return}
  top++;
  arr[top] = x;
  }

  int pop()
  {
  if(top == -1){return error}
  int res = arr[top]       //first we need to save the element then need to change the pointer.
  top--;
  return res;
  }

  int size(){
  return top+1;
  }

  boolean isEmpty(){
  return (top == -1)
  }

  }


Applications of Stacks

1. function calls
2. Balance Parentheses
3. Reversing Items
4. infix to postfix
5. Stock span problem and it's variation
6. Undo/Redo or Forward/Back



     */
}
