package reflection.exemplos;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AppReflections {

public static void main (String args[] )
{
    
    Class clazz = Produto.class;
    
    System.out.println(clazz);
    
    try {
        Constructor cons = clazz.getConstructor();
        Produto prod1 = (Produto) cons.newInstance();
        System.out.println(cons);
        System.out.println(prod1);
        
       Field[] fields = prod1.getClass().getDeclaredFields();
       for (Field field : fields)
       {
           Class<?> type = field.getType();
           String nome = field.getName();
           System.out.println(type);
           System.out.println(nome);
           
           
       }
        
        Method [] Method1 = prod1.getClass().getDeclaredMethods();
       for (Method met : Method1)
       {
           Class<?> type = met.getReturnType();
           String nome = met.getName();
           System.out.println(type);
           System.out.println(nome);
           
           System.out.println("Executando Métodos");
           if (met.getName().startsWith("get"))
           {
               System.out.println(met.invoke(prod1));
           }   else
               for (Class classesTypes : met.getParameterTypes())
               {
                   if (classesTypes.equals(String.class))
                   {
                       System.out.println(met.invoke(prod1, "Pedro"));
               } else if (classesTypes.equals(Long.class)) {
                       System.out.println(met.invoke(prod1, 1L));
                   }
                   else System.out.println(met.invoke(prod1,2d));
                   {
                   
                   }
               }
               
       }
       
       
       
    } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
        throw new RuntimeException(e);
    }
    
    
}

}
