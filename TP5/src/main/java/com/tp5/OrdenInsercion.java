
package com.tp5;
//{2,8,4,1,5,3}//

import java.util.Arrays;


public class OrdenInsercion {
    public void ordenar(int[] a){
        for(int i=1;i<a.length;i++){
            int valor=a[i];
            int j=i-1;
            while(j>=0 && a[j]>valor){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=valor;
            if(i==a.length-1){
                System.out.println(Arrays.toString(a));
            }
        }
    }
}
