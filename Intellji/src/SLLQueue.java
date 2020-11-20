public class SLLQueue<type> {
    private int size;
    private Node<type> head;
    private Node<type> tail;

    public SLLQueue() {
        head = new Node<>(null,null);
        tail = new Node<>(null,null);
        head.setNextLink(tail);
        size=0;
    }

    public void enqueue(type newData){
        Node<type> newNode=new Node<>(null,newData);
        if (size==0)
            head=newNode;
        else
            tail.setNextLink(newNode);



         tail=newNode;
        size++;

    }
    public type front(){
        if (size == 0)
            throw new ArrayIndexOutOfBoundsException("front");

        return head.getData();

    }
    public type dequeue(){
        if (size==0)
            throw new ArrayIndexOutOfBoundsException("erol dequeue");

        type data = head.getData();
        head=head.getNextLink();

        size--;


        return data;



    }

    @Override
    public String toString() {

        String returnValue = "[ ";
        Node temp = head;

        for (int i = 0; i <size ; i++) {
            returnValue +=","+temp.getData();

            temp=temp.getNextLink();

        }

      returnValue +=" ]" ;
        return returnValue;
    }

    private class Node<type>{
        private Node<type> nextLink;
        private type data;

        public Node(Node<type> nextLink, type data) {
            this.nextLink = nextLink;
            this.data = data;
        }

        public Node<type> getNextLink() {
            return nextLink;
        }

        public void setNextLink(Node<type> nextLink) {
            this.nextLink = nextLink;
        }

        public type getData() {
            return data;
        }

        public void setData(type data) {
            this.data = data;
        }
    }
}
