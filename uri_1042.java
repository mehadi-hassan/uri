import java.util.Scanner;
public class uri_1042{
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int[] sort= new int [3];
        int[] backup = new int [3];
        for(int c = 0; c<sort.length; c++){
            sort[c]= sc.nextInt();
            backup[c]=sort[c];
        }
        for (int i = 0; i<sort.length; i++){
            for (int j = i+1; j<sort.length; j++){
                if (sort[j]<sort[i]){
                    int temp = sort[i];
                    sort[i]=sort[j];
                    sort[j]=temp;
                }
            }
        }
        for (int k = 0; k<sort.length; k++){
            System.out.println(sort[k]);
        }
        System.out.println();
        for (int l = 0; l<sort.length; l++){
            System.out.println(backup[l]);
        }
    }
}
