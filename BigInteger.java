import java.math.BigInteger;

public class BIGINTEGER {
    public static void main(String[]args){
        BigInteger a= new BigInteger("50000000000000000000");
        BigInteger b= new BigInteger("10000000000000000000");

        System.out.println(a);
        System.out.println(b);

        BigInteger c=a.add(b);
        BigInteger d=a.subtract(b);

        System.out.println(c);
        System.out.println(d);

        BigInteger x= new BigInteger("123456789");
        BigInteger y= new BigInteger("2");

        System.out.println(x.multiply(y));
        System.out.println(x.divide(y));

        BigInteger z=x.pow(20);
        System.out.println(z);
        System.out.println(x.mod(y));

        

        long x=50;
        BigInteger b= new BigInteger(x+"");
        System.out.println(b);

        BigInteger b2= new BigInteger("9826372991");
        int y=b2.intValue();
        System.out.println(y);

        long z=b2.longValue();
        System.out.println(z);
    }


}
