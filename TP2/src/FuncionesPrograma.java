import java.text.SimpleDateFormat;
import java.util.Date;

public class FuncionesPrograma {
        public static String getFechaString(Date fecha){
                String fechaFormateada = new SimpleDateFormat("dd/MM/yyyy").format(fecha);
                return fechaFormateada;
        }
        public static Date getFechaDate(int dia, int mes, int anio){
                Date fecha = new Date(anio,mes,dia);
                return fecha;
        }
}
