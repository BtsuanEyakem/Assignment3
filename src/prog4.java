package src;

import java.util.Arrays;

public class prog4{

    public static void main(String[] args) {
        float a = 1.27f;
        float b = 3.881f;
        float c = 9.6f;
        float sum = a+b+c;
        int intSum = (int)sum;
        int rouneded = (int)Math.round(sum);
        System.out.println("float sum: "+sum);
        System.out.println("int sum "+intSum);
        System.out.println("round sum "+rouneded);


    }
}
class prog5{
    public int[] combine(int[] a,int[] b){
        int[] arrayres =new int[a.length+b.length];
         System.arraycopy(a,0,arrayres,0,a.length);
         System.arraycopy(b,0,arrayres,a.length,b.length);
        System.out.println(Arrays.toString(arrayres));
         return arrayres;
    }
    public static void main(String[] args){
        prog5 x = new prog5();
        int[] a = {5,6,-4,3,1};
        int[] b = {3,8,9,11};
        x.combine(a,b);


    }
}
class prog6{
    static int min(int[] arrayOfints){
        int min = 0;
        for(int i =0; i <arrayOfints.length; i++){
            for (int j=0; j< arrayOfints.length; j++){
                if(arrayOfints[i]<=arrayOfints[j])
                   min = arrayOfints[i];
                else {
                    min = arrayOfints[j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args){

        int[] array = {2,-21,3,45,0,12,18,6,3,1,0,-22};
        System.out.println(min(array));
    }
}


