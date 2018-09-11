import java.util.Scanner;
public class uri_1049{
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        String c = s.next();
        if (a.equals("vertebrado") && b.equals("ave") && c.equals("carnivoro")){
            System.out.println("aguia");}
        if (a.equals("vertebrado") && b.equals("ave") && c.equals("onivoro")){
            System.out.println("pomba");}
        if (a.equals("vertebrado") && b.equals("mamifero") && c.equals("onivoro")){
            System.out.println("homem");}
        if (a.equals("vertebrado") && b.equals("mamifero") && c.equals("herbivoro")){
            System.out.println("vaca");}
        if (a.equals("invertebrado") && b.equals("inseto") && c.equals("hematofago")){
            System.out.println("pulga");}
        if (a.equals("invertebrado") && b.equals("inseto") && c.equals("herbivoro")){
            System.out.println("lagarta");}
        if (a.equals("invertebrado") && b.equals("anelideo") && c.equals("hematofago")){
            System.out.println("sanguessuga");}
        if (a.equals("invertebrado") && b.equals("anelideo") && c.equals("onivoro")){
            System.out.println("minhoca");}
    }
}