import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {10,15,2,5,1,7};
        insertionSort(nums);
    }
    public static void insertionSort(int[] lista)
    {


        for (int i = 1; i < lista.length; i++)
        {   System.out.println("Sort Pass Number "+(i));
            int key = lista[i];
            int j = i-1;

            while ( (j > -1) && ( lista [j] > key ) )
            {
                System.out.println("Comparing "+ key  + " and " + lista [j]);
                lista[j+1] = lista[j];
                j--;
            }
            lista[j+1] = key;
            System.out.println("Swapping Elements: New Array After Swap");
            System.out.println(Arrays.toString(lista));
        }
    }
    static void bubbleSort(int[] lista) {
        int n = lista.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(lista[j-1] > lista[j]){
                    //swap elements
                    temp = lista[j-1];
                    lista[j-1] = lista[j];
                    lista[j] = temp;
                }
            }
        }
    }
}