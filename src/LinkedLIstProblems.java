class Node<T>{
    T data;
    Node nextNode = null;

    Node(T data) {
        this.data = data;
    }
}

class LinkedList<T> {
    Node<T> head = null;

    public void addNode(T data) {
        if(head == null) {
            // linked list is empty
            head = new Node(data);
        } else {
            Node curr = head;
            while(curr.nextNode != null) {
                curr = curr.nextNode;
            }
            curr.nextNode = new Node(data);
        }
    }

    public String toString() {
        Node curr = head;
        String res = "[";
        while(curr != null) {
            res = res +  String.valueOf(curr.data) + ",";
            curr = curr.nextNode;
        }
        res += "]";
        return res;
    }
}

public class LinkedLIstProblems {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addNode(30);
        list.addNode(50);
        list.addNode(70);
        System.out.println(list);
    }
}
