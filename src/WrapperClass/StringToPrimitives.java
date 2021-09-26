package WrapperClass;

public class StringToPrimitives {
    public static void main(String[] args) {


        String str1 = "123";
        int i = Integer.parseInt(str1);
        double db1 = Double.parseDouble(str1);
        String str2 = "true";

        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);

        boolean b2 = Boolean.parseBoolean(str1);
        System.out.println(b2);

        boolean b3 = Boolean.parseBoolean("False");
        System.out.println(b3);

    }
}