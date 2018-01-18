package stringutils;

public class Assert {
    public static boolean assertNull(String str){
        return  str==null;
    }
    public static boolean assertEmpty(String str){
        return  str.equals("");
    }
    public static boolean assertNullOrEmpty(String str) {
        return str == null || str.equals("");
    }

}
