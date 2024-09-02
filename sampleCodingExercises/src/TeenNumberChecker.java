public class TeenNumberChecker {
    public static void main(String[] args) {
       boolean r =  hasTeen(13,22,65);
       boolean p = isTeen(15);
       System.out.println(r);
       System.out.println(p);

    }
    public static boolean hasTeen(int a, int b, int c){
        return isTeen(a) || isTeen(b) || isTeen(c);
    }
    public static boolean isTeen(int num){
        return num>12 && num <20;
    }
}
