public class Main {

    public static void main(String[] args) {
    /*
      myLinkList<String> list = new myLinkList<>();
        list.add("yazı 1");
        list.add("yzı 2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(i+". "+list.get(i));

        }
        System.out.println("*---------------------");
       list.set(3,"123123");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(i+". "+list.get(i));

        }
        */

        myStack<String> stack = new myStack<>();

        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.push("6");
        stack.push("7");
        stack.push("8");
        stack.push("9");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push("1");
        stack.push("1");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("-----------");
       stack.clear();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("gitHub Test v4");


    }
}
