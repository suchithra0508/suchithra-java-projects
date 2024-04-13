class suchi5 {
    int rollno;
    String name;
    String address;
    }
    class Student2 extends Student {
        String phoneno;
        String emailId;
    }
    public static void main(String[] args) {
        String2 obj = new Student2();
        obj.rollno = 230;
        obj.name = "sneha";
        obj.address = "hyd";
        obj.phoneno = "6309328739";
        obj.emailId = "thotasneha211@gmail.com";
        System.out.println(obj);
    }