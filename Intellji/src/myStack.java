public class myStack<type> {
    int size;
   private node <type> top;

    public myStack() {
      size=0;
    }
    public void push(type newData){
        node<type> newNode= new node<>(top,newData);
        top=newNode;
        size++;


    }
    public type pop(){

        if (size==0)
            throw new ArrayIndexOutOfBoundsException("pop Errol");

        type data = top.data;
       top= top.nextNode;
       size--;
        return data;

    }
    public void clear(){
        size=0;
        top=new node<type>(null,null);


    }




    private class node<type>{

        public node nextNode;
        public type data;

        public node( node nextNode, type data) {

            this.nextNode = nextNode;
            this.data = data;
        }
    }
}
