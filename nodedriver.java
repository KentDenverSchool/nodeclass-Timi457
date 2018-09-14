public class nodedriver {
    public static void main(String[] args) {

        node n = new node();
        node n2 = new node(10, n);

        n.setData(5);
        n.setNext(n);

        System.out.println(n2.getData());
        System.out.println((n2.getNext()).getData());
    }
}