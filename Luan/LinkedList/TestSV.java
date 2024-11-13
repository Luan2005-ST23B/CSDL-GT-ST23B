public class TestSV {
    public static void main(String[] args) {
        SVManagement sms = new SVManagement();

        SV s1 = new SV("MS01","Ta Quang Khanh",19,10f);
        SV s2 = new SV("MS02","Vo Kien",19,9.8f);
        SV s3 = new SV("MS03","Nguyen Van An",19,7.4f);
        SV s4 = new SV("MS04","Bui Duc Huy",19,8.1f);

        sms.addStudent(s1);
        sms.addStudent(s2);
        sms.addStudent(s3);
        sms.addStudent(s4);

        sms.printList();
        System.out.println("----------------");

        SV s5 = new SV("MS05","Bui Duc Huy",19,8.1f);
        System.out.println(sms.findStudent(s5));
        System.out.println("----------------");

        //SV s6 = new SV("MS06","Le Thi X",30,7.1f);
        SV s6 = new SV("MS04","Le Thi X",30,7.1f);
        sms.update(s6);
        sms.printList();
        System.out.println("----------------");

        SV s7 = new SV("MS07","Le Thi X",30,7.1f);
        sms.addStudent(s7);
        sms.printList();
        System.out.println("So SV X: "+sms.count("Le Thi X"));
        System.out.println("----------------");

        sms.remove(s7);
        sms.printList();
    }
}
