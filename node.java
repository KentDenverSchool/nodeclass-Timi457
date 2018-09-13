public class node {

    private Object data;
    private node next;

    public node() {
        data = null;
        next = null;
    }

    public node(Object o, node n) {
        data = o;
        next = n;
    }

    /**
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * @return the next
     */
    public node getNext() {
        return next;
    }

    /**
     * @param data the data to set
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * @param next the next to set
     */
    public void setNext(node next) {
        this.next = next;
    }

}