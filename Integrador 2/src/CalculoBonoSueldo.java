import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class CalculoBonoSueldo {
    static String[][] haberes = {
            {"100","Presentismo", "9"},
            {"101","Titulo profesional" , "9"},
            {"102","Horas Extraordinarias","M"},
            {"103","Horas Nocturnas","M"},
            {"104","Otros haberes", "M"}
    };
    static String[][] deducciones = {
            {"200", "Obra Social", "3"},
            {"201", "Jubilacion", "11"},
            {"202", "Sindicato", "2"},
            {"203", "Seguro", "1.5"},
            {"204", "Otros", "M"}
    };
    static Integer[] codigoHaberes = {100,101,102,103,104};
    static Integer[] codigoDeducciones = {200,201,202,203,204};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Crear empleado y asignar atributos*/
        Empleado empleado = new Empleado();


        //Nombre
        System.out.println("Ingrese el nombre del empleado");
        empleado.setNombreEmpleado(sc.nextLine());

        //cuil
        System.out.println("Ingrese el cuil del empleado");
        empleado.setCuil(Long.parseLong(sc.nextLine()));

        //anio de ingreso
        System.out.println("Ingrese el año de ingreso");
        int anioDeIngreso = Integer.parseInt(sc.nextLine());
        while (anioDeIngreso>2024){
            System.out.println("Año no valido, ingrese un año valido");
            anioDeIngreso=Integer.parseInt(sc.nextLine());
        }
        empleado.setAnioIngreso(anioDeIngreso);

        //sueldo basico
        System.out.println("Ingrese su sueldo basico");
        empleado.setSueldoBasico(Integer.parseInt(sc.nextLine()));
        empleado.InicializarBonos();

        //creacionDeBono
        String respuesta="si";
        while (respuesta.equalsIgnoreCase("si")) {
            //crear intancia de bono
            BonoSueldo bs = new BonoSueldo();


            //año de liquidacion
            System.out.println("Ingrese el año de liquidacion");
            int anioDeLiquidacion = Integer.parseInt(sc.nextLine());
            Calendar anio = Calendar.getInstance();
            while (anioDeLiquidacion > anio.get(Calendar.YEAR) || anioDeLiquidacion < anioDeIngreso) {
                System.out.println("Año no valido o inferior al año de ingreso: " + anioDeIngreso + ", ingrese un año valido");
                anioDeLiquidacion = Integer.parseInt(sc.nextLine());
            }

            //mes de liquidacion
            System.out.println("Ingrese el mes de liquiacion");
            int mesLiquidacion = Integer.parseInt(sc.nextLine());
            if (anioDeLiquidacion == anio.get(Calendar.YEAR)) {
                Calendar mes = Calendar.getInstance();
                int mesActual = mes.get(Calendar.MONTH) + 1;
                while (mesLiquidacion > mesActual) {
                    System.out.println("El mes de liquidacion debe ser inferior al mes actual: " + mesActual + ", ingrese un mes correcto");
                    mesLiquidacion = Integer.parseInt(sc.nextLine());
                }
            } else if (mesLiquidacion <= 0 || mesLiquidacion > 12) {
                while (mesLiquidacion <= 0 || mesLiquidacion > 12) {
                    System.out.println("Ingrese un mes valido del 1-12 por favor");
                    mesLiquidacion = Integer.parseInt(sc.nextLine());
                }
            }

            //monto por antiguedad
            empleado.calculoAntiguedad(anioDeIngreso, anioDeLiquidacion);
            System.out.println("El monto por antiguedad es de: " + empleado.getMontoAntiguedad() + " pesos.");


            //mes y año de liquidacion en bono
            bs.setAnioLiquidacion(anioDeLiquidacion);
            bs.setMesLiquidacion(mesLiquidacion);

            //asigno empleado al bono
            bs.setEmpleado(empleado);

            //string bono haberes y deducciones
            String[][] bonoCalculado = {
                    {"Codigo Item", "Denominacion", "Haberes", "Deducciones"},
                    {"", "", "", ""},
                    {"", "", "", ""},
                    {"", "", "", ""},
                    {"", "", "", ""},
                    {"", "", "", ""},
                    {"", "", "", ""},
                    {"", "", "", ""},
                    {"", "", "", ""},
                    {"", "", "", ""},
                    {"", "", "", ""}
            };
            List<Integer> codigosIngresados = new ArrayList<>();
            bonoCalculado[1][1] = "Sueldo basico";
            bonoCalculado[1][2] = String.valueOf(empleado.getSueldoBasico());
            bonoCalculado[2][1] = "Saldo por antiguedad";
            bonoCalculado[2][2] = String.valueOf(empleado.getMontoAntiguedad());
            int filaAgregar = 3;


            //Ingreso de haberes
            int contadorDeHaberes = 1;
            while (true) {
                mostrarMatriz(haberes);
                System.out.println("");
                int codigo;
                outerloop:
                while (true) {
                    System.out.println("Ingrese los haberes que desea cargar a su bono o 000 para salir");
                    codigo = Integer.parseInt(sc.nextLine());
                    while (codigo == 000 && hayHaberDeduccion(bonoCalculado, codigoHaberes)) {
                        System.out.println("Ingrese al menos un Haber");
                        continue outerloop;
                    }
                    if (codigo == 000) {
                        break;
                    }
                    while (Existe(codigoHaberes, codigo)) {
                        System.out.println("Codigo inexistente, ingrese otro");
                        codigo = Integer.parseInt(sc.nextLine());
                        if (codigo == 000) {
                            System.out.println("Por favor termine de agregar un codigo");
                            codigo = Integer.parseInt(sc.nextLine());
                        }
                    }
                    while (YaCargado(codigosIngresados, codigo)) {
                        System.out.println("El codigo ya fue cargado, ingrese otro");
                        codigo = Integer.parseInt(sc.nextLine());
                    }
                    bonoCalculado[filaAgregar][0] = String.valueOf(codigo);
                    bonoCalculado[filaAgregar][1] = haberes[posicion(haberes, codigo)][1];
                    if (haberes[posicion(haberes, codigo)][2].equalsIgnoreCase("M")) {
                        System.out.println("Ingrese el valor del haber");
                        bonoCalculado[filaAgregar][2] = sc.nextLine();
                    } else {
                        double porcentaje = Double.parseDouble(haberes[posicion(haberes, codigo)][2]) / 100;
                        bonoCalculado[filaAgregar][2] = String.valueOf(empleado.getSueldoBasico() * porcentaje);
                    }
                    codigosIngresados.add(codigo);
                    System.out.println("Haber cargado correctamente");
                    contadorDeHaberes++;
                    filaAgregar++;
                }
                break;
            }
            mostrarMatriz(bonoCalculado);

            //Deducciones
            while (true) {
                mostrarMatriz(deducciones);
                System.out.println("");
                int codigo;
                outerloop:
                while (true) {
                    System.out.println("Ingrese los haberes que desea cargar a su bono o 000 para salir");
                    codigo = Integer.parseInt(sc.nextLine());
                    while (codigo == 000 && hayHaberDeduccion(bonoCalculado, codigoDeducciones)) {
                        System.out.println("Ingrese al menos una deduccion");
                        continue outerloop;
                    }
                    if (codigo == 000) {
                        break;
                    }
                    while (Existe(codigoDeducciones, codigo)) {
                        System.out.println("Codigo inexistente, ingrese otro");
                        codigo = Integer.parseInt(sc.nextLine());
                    }
                    while (YaCargado(codigosIngresados, codigo)) {
                        System.out.println("El codigo ya fue cargado, ingrese otro");
                        codigo = Integer.parseInt(sc.nextLine());
                    }
                    bonoCalculado[filaAgregar][0] = String.valueOf(codigo);
                    bonoCalculado[filaAgregar][1] = deducciones[posicion(deducciones, codigo)][1];
                    if (deducciones[posicion(deducciones, codigo)][2].equalsIgnoreCase("M")) {
                        System.out.println("Ingrese el valor de la deduccion");
                        bonoCalculado[filaAgregar][3] = sc.nextLine();
                    } else {
                        double porcentaje = Double.parseDouble(deducciones[posicion(deducciones, codigo)][2]) / 100;
                        bonoCalculado[filaAgregar][3] = String.valueOf(empleado.getSueldoBasico() * porcentaje);
                    }
                    System.out.println("Deduccion cargada correctamente");
                    contadorDeHaberes++;
                    filaAgregar++;
                }
                break;
            }
            mostrarMatriz(bonoCalculado);
            bs.setBono(bonoCalculado);
            empleado.AgregarBono(bs);

            System.out.println("");
            System.out.println("Desea agregar otro bono? ingrese si para continuar");
            respuesta= sc.nextLine();
        }

        for (BonoSueldo a : empleado.getBonos()){
            System.out.println("");
            System.out.println(RellenarEspacios("Nombre:")+RellenarEspacios(empleado.getNombreEmpleado()));
            System.out.println(RellenarEspacios("Cuil:")+RellenarEspacios(String.valueOf(empleado.getCuil())));
            System.out.println(RellenarEspacios("Mes de liquidacion:")+RellenarEspacios(String.valueOf(a.getMesLiquidacion()))+RellenarEspacios("Año de liquidacion:")+RellenarEspacios(String.valueOf(a.getAnioLiquidacion())));
            System.out.println(RellenarEspacios("Sueldo basico:")+RellenarEspacios(String.valueOf(empleado.getSueldoBasico()))+RellenarEspacios("Año de ingreso:")+RellenarEspacios(String.valueOf(empleado.getAnioIngreso())));
            mostrarMatriz(a.getBono());
        }

    }
    public static String RellenarEspacios(String palabra){
        int diferencia = 25 - palabra.length();
        for (int i=0; i<diferencia;i++){
            palabra+=" ";
        }
        return palabra;
    }
    public static void mostrarMatriz(String[][] matriz){
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[0].length;j++){
                System.out.print(RellenarEspacios(matriz[i][j]));
            }
            System.out.println("");
        }

    }
    public static boolean YaCargado(List<Integer> lista, int codigo){
        boolean ingresado = false;
        for (int a : lista){
            if (a==codigo){
                ingresado = true;
                break;
            }
        }
        return ingresado;
    }
    public static int posicion(String[][] matriz, int codigo){
        String verificar = String.valueOf(codigo);
        int posicion = 0;
        for (int i=0;i<matriz.length;i++){
            if (matriz[i][0].equalsIgnoreCase(verificar)){
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    public static boolean Existe(Integer[] cdgs,int codigo){
        boolean Existe = true;
        for (int codigos : cdgs){
            if (codigos==codigo){
                Existe=false;
            }
        }
        return Existe;

    }

    public static boolean hayHaberDeduccion(String[][] a, Integer[] b){
        for (int i=0; i<a.length;i++){
            if (a[i][0].equals(String.valueOf(b[0])) || a[i][0].equals(String.valueOf(b[1])) || a[i][0].equals(String.valueOf(b[2])) || a[i][0].equals(String.valueOf(b[3]))){
                return false;
            }
        }
        return true;
    }
}
