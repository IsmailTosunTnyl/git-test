public class myLinkList<type> {
    private node<type> head;
    private node<type> tail;
    private int size;


    public myLinkList() {
        clear();


    }
    public boolean add(type newData){
        add(size,newData);
        return true;


    }
    public boolean add(int index,type newdata){
      if (index<0 || index>size){
          throw new IndexOutOfBoundsException("Index Hatalı");
      }

      node<type> node = getNode(index);
      node<type> newNode = new node<>(node.prevLink,node,newdata);
      newNode.prevLink.nextlink=newNode;
      node.prevLink=newNode;
      size++;

        return true;
    }
    public type get(int index){
        if (index<0 || index>size)
            throw new IndexOutOfBoundsException("Errol size fazla");

        return getNode(index).data;



    }
    public int size(){
        return size;

    }
    public type remove(int index){
        if (index<0 || index>size)
            throw new IndexOutOfBoundsException("errol");

        node <type> dNode = getNode(index);
        dNode.prevLink.nextlink = dNode.nextlink;
        dNode.nextlink.prevLink=dNode.prevLink;

        size--;
        return dNode.data;





    }
    public type set(int index , type newData){
        node<type> node =getNode(index);

        type oldData = node.data;
        node.data = newData;
        return oldData;



    }

    private node<type> getNode(int index){
         node<type> node;
        if (index<=size/2){
            node= head.nextlink;
            for (int i = 0; i <index ; i++) {
                node = node.nextlink;
            }

        }else {
            node = tail;
            for (int i = size; i >index ; i--) {
                node = node.prevLink;

            }


        }

        return node;




    }

    private void clear() {
head=new node<>(null,null,null);
tail=new node<>(head,null,null);
head.nextlink=tail;
size=0;


    }

    private class  node<type>{
       private node prevLink;
       private node nextlink;
       private type data;

        public node(node prevLink, node nextlink, type data) {
            this.prevLink = prevLink;
            this.nextlink = nextlink;
            this.data = data;
        }
    }
}
