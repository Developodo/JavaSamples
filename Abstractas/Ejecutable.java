package Abstractas;

public class Ejecutable {
    public static void main(String[] args) {
        Animal[] rooms = new Animal[3];
        //[null]  [null]   [null]

        rooms[0]=new Carnivoro(1, "Puma", 0);
        //[Carnivoro]  [null]   [null]
        
        rooms[1]=new Herviboro(0, "Vaca", 0);
        //[Carnivoro]  [Herviboro]  [null]

        rooms[2]=new Carnivoro(8, "León", 0);
        //[Carnivoro]  [Herviboro]   [Carnivoro']

        for(Animal animal:rooms){
            System.out.println(animal);
        }

        rooms[1]=null; //hemos curado la vaca

        for(Animal animal:rooms){
            System.out.println(animal);
        }

        Herviboro h2=new Herviboro(99, "Tortuga", 1);
        boolean result=aceptarAnimal(rooms, h2);
        System.out.println("Lo hemos metido: "+result);

        for(Animal animal:rooms){
            System.out.println(animal);
        }


    }   

    public static boolean aceptarAnimal(Animal[] rooms,Animal a){
        boolean result=false;
        for(int i=0;i<rooms.length&&!result;i++){
            if(rooms[i]==null){
                rooms[i]=a;
                result=true;
            }
        }
        return result;
    }
}
