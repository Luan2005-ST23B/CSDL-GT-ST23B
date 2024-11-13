public class SVManagement {
    private LinkedList<SV> list;

    public SVManagement() {
        this.list = new LinkedList<SV>();
    }

    public void addStudent(SV SV){
       this.list.AddToTail(SV);
    }

    public void printList(){
        this.list.traverse();
    }
    public boolean findStudent(SV SV){
        return list.findItem(SV);
    }

    public void update(SV SV){
        Node<SV> tmp = list.getHead();
        while (tmp!=null){
            SV sv = tmp.getData();
            if(sv.getID().equals(SV.getID())){
                sv.setFullName(SV.getFullName());
                sv.setAge(SV.getAge());
                sv.setGPA(SV.getGPA());
            }
            tmp = tmp.getNext();
        }
    }

    public void remove(SV SV){
        this.list.Remove(SV);
    }

    public int count(String fullName){
        int count =0;
        Node<SV> tmp = list.getHead();
        while (tmp!=null){
            SV sv = tmp.getData();
            if(sv.getFullName().equals(fullName)){
               count++;
            }
            tmp = tmp.getNext();
        }
        return count;
    }
}
