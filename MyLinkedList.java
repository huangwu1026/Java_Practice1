public class MyLinkedList {
        public static Node buildLinkedListManual() {
            Node n1 = new Node(1);
            Node n2 = new Node(2);
            Node n3 = new Node(3);
            // 1 2 3
            n1.next = n2;
            n2.next = n3;
            n3.next = null;
            return n1;
        }

        //打印链表
        public static void printLinkedList(Node head) {
            Node cur = head;
            //遍历链表
            while (cur != null) {
                //System.out.println(cur.val);
                System.out.println(cur);
                cur = cur.next;
            }
        }

       //头插
       public static Node pushFront(Node head, int val) {
            //将要头插的元素装进小火车里面
            Node node = new Node(val);
            node.next = head;
            return node;
        }
        //头删
       public static Node popFront(Node head) {
           if (head == null) {
               //链表运行时异常
               throw new RuntimeException("空链表");
           }
           return head.next;
       }

        public static void main(String[] args) {
            Node head = buildLinkedListManual();
            printLinkedList(head);

            //链表的头节点为空
           // Node head = null;

            head = pushFront(head, 4);
            head = pushFront(head, 5);
            head = pushFront(head, 6);

            printLinkedList(head);

            head = popFront(head);

            printLinkedList(head);

        }
    }

