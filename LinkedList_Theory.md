# problem with Array Data Structure 
1. Fixed Size problems(either size is fixed or pre allocated, it was fixed by arraylist in java, they double the size)
issue with array list-> you need to copy all n elements from array one to array2 when it's full Big(n)
2. Insertion in middle or beginning is costly (all element need to shift right)
3. Deletion in middle or beginning is costly (all element need to shift right)
4. Complex implementation of other data structures using Arrays
5. If in a system programming you do not have contiguous space but have fragement spaces then linkedlist is the solution becuase linkedlist use fragement spaces although it's sequentail DS

![img.png](img.png)

## Linkedlist

It's a sequentail DS but node contains the references of the next node. The idea is to drop the contiguous memory requirements so that insertion, deletion can happen  at the middle also 
and no need to preallocate the spaces, LL is stored in heap.


Simple linkedList implementation

```java
public class Simple_LinkedList_Implementation {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node twenty = new Node(20);
        Node thirty = new Node(30);
        
        //linking 
        head.nextNode = twenty;
        twenty.nextNode = thirty;
    }
}
class Node{
    int data;
    Node nextNode;
    public Node(int data){
        this.data = data;
        nextNode = null;  // this line is optional if you don't initialize it will default be null
    }
}
```


# Application of LinkedList

- worst case insertion at the beginning and end are constant time 0(1)
- worst case deletion at the beginning is constant time 0(1)
- insertion, deletion in the middle is constatnt time if we have the reference of previous node(double linkedList)
- round robin implementation (process allocation)
- merging two sorted linkedlist is faster then arraylist
- implementation of simple memory manager where we need to link free blocks 
- easier implementation of queue and deque then arraylist 
