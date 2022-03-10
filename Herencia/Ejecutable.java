package Herencia;

public class Ejecutable {
    public static void main(String[] args) {
        Profesor profesor=new Profesor("Carlos","123","Informatica");
        Estudiante estudiante=new Estudiante("Juan","456","2");
        Profesor profesor2=new Profesor("Manu","879","Informatica");
        Estudiante estudiante2=new Estudiante("María","0000","1");

        Persona[] comunidadEducativa=new Persona[4];
        comunidadEducativa[0]=profesor;
        comunidadEducativa[1]=estudiante;
        comunidadEducativa[2]=profesor2;
        comunidadEducativa[3]=estudiante2;

        for(int i=0;i<comunidadEducativa.length;i++){
            if(comunidadEducativa[i].getClass() == Estudiante.class){
                System.out.println("ESTUDIANTE");
                Estudiante e=(Estudiante)comunidadEducativa[i];
                System.out.println(e.getCurso());
            }
            if(comunidadEducativa[i].getClass()==Profesor.class){
                System.out.println("PROFE");
                Profesor p=(Profesor)comunidadEducativa[i];
                System.out.println(p.getDepartamento());
            }
        }

        
    }
}
