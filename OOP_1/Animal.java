package OOP_1;

public class Animal {
    //boolean ->false,
    //number -> 0
    //Objectos (String) -> null
    //public  default (no accesible desde fuera del paquete)
    private String name;
    private String breed;
    private int age;
    private boolean damaged;

    public Animal(String name, String breed, int age, boolean damaged) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.damaged = damaged;
    }
    
    public Animal() {
        this("Unknown","Unknown",-1,false); //la primera línea 
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isDamaged() {
        return damaged;
    }
    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        if (breed == null) {
            if (other.breed != null)
                return false;
        } else if (!breed.equals(other.breed))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Animal [age=" + age + ", breed=" + breed + ", damaged=" + damaged + ", name=" + name + "]";
    }

    
}
