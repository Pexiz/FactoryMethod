package Lambda;

import java.util.Arrays;
import java.util.stream.IntStream;

public class testes {
    public static void main(String[] args) {
        
        
        String[] nomes = {"João", "Ana", "Carlos", "Beatriz"};
        Arrays.sort(nomes, (s1, s2) -> s1.length() - s2.length());
        System.out.println(Arrays.toString(nomes));
        
        IntStream.range(1, 6).forEach(n -> System.out.println("Número: " + n));
        
        MyEventConsumer myEvent = (Object s) -> {
            System.out.println(s);};
        
        MyEventConsumer myEvent1 = (s) -> {System.out.println(s);};
        
        MyEventConsumer myEvent2 = s -> System.out.println();
        

    }
}