public class Metodos {
    public static void main(String[] args) {
        System.out.println(suma(2,3));
        int b=10;
        b=incrementa(b);
        System.out.println(b);
    }
    static int suma(int a,int b){
        return a+b;
    }
    static int incrementa(int a){
        a++;
        return a;
    }
}
