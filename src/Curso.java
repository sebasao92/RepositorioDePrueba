import exception.NuestraException;

public class Curso {

    public static boolean ganoCurso(Double nota){

        if(nota < 0 || nota > 5){
            throw new NuestraException("La nota no puede ser menor que 0 o mayor que 5");
        }

        if(nota >= 3.0){
            return true;
        }else{
            return false;
        }
    }
}
