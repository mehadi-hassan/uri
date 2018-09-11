import java.util.Scanner;
public class uri_1048{
    public static void main (String[]args){
        Scanner a = new Scanner(System.in);
        double inc, nsal;
        double sal = a.nextDouble();
        if (sal>=0 && sal<=400){
            inc = (sal*15)/100;
            nsal = sal+inc;
            System.out.printf("Novo salario:"+" "+"%.2f\n", nsal);
            System.out.printf("Reajuste ganho:"+" "+"%.2f\n", inc);
            System.out.println("Em percentual: 15 %");
        }
        else if (sal>400 && sal<=800){
            inc = (sal*12)/100;
            nsal = sal+inc;
            System.out.printf("Novo salario:"+" "+"%.2f\n", nsal);
            System.out.printf("Reajuste ganho:"+" "+"%.2f\n", inc);
            System.out.println("Em percentual: 12 %");
        }
        else if (sal>800 && sal<=1200){
            inc = (sal*10)/100;
            nsal = sal+inc;
            System.out.printf("Novo salario:"+" "+"%.2f\n", nsal);
            System.out.printf("Reajuste ganho:"+" "+"%.2f\n", inc);
            System.out.println("Em percentual: 10 %");
        }
        else if (sal>1200 && sal<=2000){
            inc = (sal*7)/100;
            nsal = sal+inc;
            System.out.printf("Novo salario:"+" "+"%.2f\n", nsal);
            System.out.printf("Reajuste ganho:"+" "+"%.2f\n", inc);
            System.out.println("Em percentual: 7 %");
        }
        else if (sal>2000){
            inc = (sal*4)/100;
            nsal = sal+inc;
            System.out.printf("Novo salario:"+" "+"%.2f\n", nsal);
            System.out.printf("Reajuste ganho:"+" "+"%.2f\n", inc);
            System.out.println("Em percentual: 4 %");
        }
    }
}