public class TestMain {
    public static void main(String[] args){
        String a ="apple";
        String b = "banana";

        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println("apple");


        int variable1 = 3;
        int variable2 = 2;
        boolean equalResult = (variable1 != variable2);
        System.out.println("do they equal each other?" + equalResult);

        String s = "oh no!";
        String f = "oh no!";
        Boolean k = (s == f);
        System.out.println(k);

        String s2 = "oh no!";
        String f2 = new String("oh no!");
        Boolean k2 = (s2 == f2);
        System.out.println(k2);
    }
}