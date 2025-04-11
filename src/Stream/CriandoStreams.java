package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CriandoStreams {
    
    public static void main(String[] args) {
        
        List<String> listaTest = List.of("Pedro", "Henrique");
        Stream<String> streamList = listaTest.stream(); // POPULEI
        
        Set<String> set = Set.of("Pedro", "Henrique");
        Stream<String> streamSet = set.stream();  // POPULEI
        
        Map<String, String> map = Map.of("Pedro", "Henrique");
        Stream<String> streamMapValues = map.values().stream();  // POPULEI
        Stream<String> stringStreamMapKeys = map.keySet().stream();  // POPULEI
        
        Stream numbersFromValues = Stream.of(1, 2, 3, 4, 5);
        IntStream numbersFromArray = Arrays.stream(new int[]{1, 2, 3, 4, 5});
        
        


        
    }
    
    
}
