public class busquedaEnLista {
    public String[] conclusion(int[] lista, int buscar){
        String[] conclusion = new String[3];
        String posicion="";
        String noSeEncontro = "";
        String seEncontroNum = "false";
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == buscar){
                posicion = Integer.toString(i);
                 seEncontroNum = "true";
                break;
            }
        }
        if (seEncontroNum.equals("false")){
           noSeEncontro = "no se encontro el numero en la lista";
           conclusion[0]="false";
           conclusion[1]=noSeEncontro;

        } else if (seEncontroNum.equals("true")){
            seEncontroNum= "El numero se encontro en la lista";
            conclusion[0]="true";
            conclusion[1]=seEncontroNum;
            conclusion[2]=posicion;
        }


        return conclusion;
    }
}
