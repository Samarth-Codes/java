public class callstack {
    public static  void main(String[]args) {
        int x = 0;
        System.out.println("inside main(),x=" + x);
        first();
    }
        static void first(){
        int x=10;
            System.out.println("inside first(),x="+x);
            second();
    }
    static void second(){
        int x=20;
        System.out.println("inside second(),x="+x);
        third();


    }
    static void third(){
        int x=30;
        System.out.println("inside third(),x="+x);
    }
}
