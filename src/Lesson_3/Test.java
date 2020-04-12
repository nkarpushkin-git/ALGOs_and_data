package Lesson_3;

public class Test {
    //1
    public static void main(String[] args) {
        String strA = "text";
        String strB = "text";
        strA += "1";
        strB += "1";
        System.out.println(strA == strB);
        strA = "text1";
        strB = "text1";
        System.out.println(strA == strB);
    }
}
