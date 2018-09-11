import java.util.Scanner;
public class uri_1018{
    public static void main (String[]args){
        Scanner a= new Scanner(System.in);
        int N, m100, m50, m20, m10, m5, m2, m1, m1001, m501, m201, m101, m51, m21, m11 ;
        N = a.nextInt();
        m100= N/100;
        m1001= N%100;
        m50= m1001/50;
        m501= m1001%50;
        m20= m501/20;
        m201= m501%20;
        m10= m201/10;
        m101= m201%10;
        m5= m101/5;
        m51= m101%5;
        m2= m51/2;
        m21= m51%2;
        m1= m21/1;
        m11= m21%1;
        System.out.println(N);
        System.out.println(m100+" "+"nota(s) de R$ 100,00");
        System.out.println(m50+" "+"nota(s) de R$ 50,00");
        System.out.println(m20+" "+"nota(s) de R$ 20,00");
        System.out.println(m10+" "+"nota(s) de R$ 10,00");
        System.out.println(m5+" "+"nota(s) de R$ 5,00");
        System.out.println(m2+" "+"nota(s) de R$ 2,00");
        System.out.println(m1+" "+"nota(s) de R$ 1,00");
    }
}