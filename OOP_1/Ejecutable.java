package OOP_1;

public class Ejecutable {
    public static void main(String[] args) {
        Animal mimascota=new Animal("Luna","Mastín",1,false);  //se reserva memoria para un animal y se llama al método constructor -> se emplea para inicializar variables
        Animal mimascota2=new Animal("Luna","Mastín",1,false);
        Animal mimascota3;
        mimascota3=mimascota2;
        System.out.println(mimascota==mimascota2);
        System.out.println(mimascota3==mimascota2);
        


        System.out.println(mimascota.equals(mimascota2));
        System.out.println(mimascota2.equals(mimascota));
        System.out.println(mimascota3.equals(mimascota2));
        //mimascota3.setName("Sol");
        //System.out.println(mimascota2);

        mimascota2=null;
        System.out.println(mimascota3);
        mimascota3=null;



        

    }
}
