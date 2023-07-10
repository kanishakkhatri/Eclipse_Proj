package p3;

public class Demo2 {
    public static void main(String[] args) {
        String s=new String("Ramesh");
        System.out.println(s);

        s.concat("Kumar");
        System.out.println(s);

        s=s.concat("Kumar");
        System.out.println(s);

        // its a thread safe: one will execute only

        StringBuffer sb=new StringBuffer("Pravin");
        sb.append("KUMAR");
        System.out.println(sb);//mutable, we can change or modify

        sb.insert(0, "MR ");
        System.out.println(sb);

        sb.delete(0, 3);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        //thread not safe
        StringBuilder sbl=new StringBuilder("Charan");
        sbl.append("Kumar");
        System.out.println(sbl);



    }
}
