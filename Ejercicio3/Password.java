package Ejercicio3;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Password {
    private String contrasena;
    private int longitud;

    public Password(){
        longitud=8;
    }
    public Password(int longitud){
        this.longitud=longitud;
        generaPassword();
    }
    public void generaPassword(){
        // ASCII range – alphanumeric (0-9, a-z, A-Z)
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
 
        SecureRandom random = new SecureRandom();
 
        // each iteration of the loop randomly chooses a character from the given
        // ASCII range and appends it to the `StringBuilder` instance
    
        this.contrasena= IntStream.range(0, longitud)
                .map(i -> random.nextInt(chars.length()))
                .mapToObj(randomIndex -> String.valueOf(chars.charAt(randomIndex)))
                .collect(Collectors.joining());
        
    }
    public boolean esFuerte(){
        boolean result=false;
        int nMayusculas=0;
        int nMinusculas=0;
        int nNumeros=0;
        if(contrasena!=null){
            for(int i=0;i<contrasena.length();i++){
                char letra=contrasena.charAt(i);
                if(letra>='A'&&letra<='Z'){
                    nMayusculas++;
                }
                if(letra>='a'&&letra<='z'){
                    nMinusculas++;
                }
                if(letra>='0'&&letra<='9'){
                    nNumeros++;
                }
            }
            if(nMayusculas>=2&&nMinusculas>=1&&nNumeros>=5){
                result=true;
            }
        }
        return result;
    }
    public String getContrasena(){
        return contrasena;
    }
    public int getLongitud(){
        return longitud;
    }
    public void setLongitud(int longitud){
        this.longitud=longitud;
    }
}
