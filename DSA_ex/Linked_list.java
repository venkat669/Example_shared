package DSA_ex;
class nodes{
    int data;
    nodes nxt ;
    public nodes(int data) {
        this.data = data;
        this.nxt = null;
    }
}
public class Linked_list {
    nodes head ;
    nodes current;
    public Linked_list() {
        this.head = null;
    }
    void addnewnode(int data){
        nodes newnode = new nodes(data);
        if(head==null){
            head = newnode;
        }
        else {
            current = head;
            while (current.nxt!=null){
                current = current.nxt;
            }
            current.nxt= newnode;
        }
    }
    void updatenode(int data, int indx){
        current = head;indx--;
        int cnt = 0;
        while(cnt<indx){
            current = current.nxt;cnt++;
        }
        current.data = data;
    }
    void Deletenode(int indx){
        current = head;indx--;
        if(indx==0){
            head = head.nxt;
        }
        else {

            nodes prev;
            prev = head;
            for (int i = 0; i < indx; i++) {
                current = current.nxt;
                if (i == 0) {
                    continue;
                } else {
                    prev = prev.nxt;
                }
            }
            prev.nxt = current.nxt;
        }
    }
    void  disp() {
        current = head;
        while (current.nxt != null) {
            System.out.print(current.data+"  ");
            current = current.nxt;
        }
        System.out.println(current.data+ " \n");
    }


    public static void main(String[] args) {
        Linked_list list = new Linked_list();
        list.addnewnode(5);
        list.addnewnode(10);
        list.addnewnode(34);
        list.addnewnode(14);
        list.disp();
        list.updatenode(80,2);
        list.disp();
        list.Deletenode(4);
        list.disp();
    }
}
