public class myLinkedList {
        Node head;

    class Node {
            int data;
            Node next;
            //Node previous;

            Node(int x) {
                data = x;
            }
        }

        void add (int x){
            if(head==null){
                head = new Node(x);
            }
            else {
                Node temp = this.head;
                while (head.next != null) {
                    head = head.next;
                }
                head.next = new Node(x);
                this.head = temp;
            }
        }

        void remove (int x){
            if(head.data == x)
                head.next = head.next.next;
            while (head.next != null ) {
                if(head.next.data == x) {
                    head.next = head.next.next;
                    break;
                }
                head = head.next;
            }
        }

        void removeAll (int x){
            if(head.data == x)
                head= head.next;
            while (head.next != null ) {
                if(head.next.data == x) {
                    head.next = head.next.next;
                }
                else head = head.next;
            }
        }


        void printList(){
            Node temp = this.head;
            while(temp.next != null){
                System.out.print(temp.data + "," + " " );
                temp= temp.next;
            }
            System.out.print(temp.data);
        }
}
