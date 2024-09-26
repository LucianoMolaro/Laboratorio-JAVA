import java.util.Arrays;

public class obtenerLetra {
    public String dniLetra(int a){
        String[] dniLetra = new String[8];
        String letra = "";
        String dni = this.dniLetra(a);
        switch (a){
            case 0:
                dniLetra[8] = "T";
            case 1:
                dniLetra[8] = "R";
            case 2:
                dniLetra[8] = "W";
            case 3:
                dniLetra[8] = "A";
            case 4:
                dniLetra[8] = "G";
            case 5:
                dniLetra[8] = "M";
            case 6:
                dniLetra[8] = "Y";
            case 7:
                dniLetra[8]= "F";
            case 8:
                dniLetra[8] = "P";
            case 9:
                dniLetra[8] = "D";
            case 10:
                dniLetra[8] ="X";
            case 11:
                dniLetra[8] = "B";
            case 12:
                dniLetra[8] = "N";
            case 13:
                dniLetra[8]="J";
            case 14:
                dniLetra[8] ="Z";
            case 15:
                dniLetra[8] = "S";
            case 16:
                dniLetra[8] = "Q";
            case 17:
                dniLetra[8]= "V";
            case 18:
                dniLetra[8] = "H";
            case 19:
                dniLetra[8] ="L";
            case 20:
                dniLetra[8]= "C";
            case 21:
                dniLetra[8] = "K";
            case 22:
                dniLetra[8] ="E";
        }
        return dni + Arrays.toString(dniLetra);
    }
}
