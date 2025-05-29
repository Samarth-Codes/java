public class autoboxing {

    public static void main(String[]args){

        int x=5;
        float y=3.14F;
        long z=6000;

        //Autoboxing
        Integer intobj=x;
        Float floatobj=y;
        Long longobj=z;

        System.out.println(intobj);
        System.out.println(floatobj);
        System.out.println(longobj);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(5,2));


        Integer n=10;
    }
}
