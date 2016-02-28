/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    //declaracion de array
    private int[] numeros;
    
    

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        //inicializacion del array
        numeros = new int[0];
      
      

    }
    /**
     *añade un elemento a la colección al final de la misma
     */
    public void add(int elemento)
    {
       //nuevo array con una posicion mas que el anterior
       int numerosBis[]=new int [numeros.length+1];
      //bucle  para copiar el array
      for (int index = 0; index<numeros.length ;index++)
      {
             numerosBis[index]=numeros[index];
      }
       //introducimos nuevo dato en el array
         numerosBis[numerosBis.length-1]=elemento;
         numeros = numerosBis;
      
    }
    /**
     *  añade un elemento a la colección en la posición especificada por el parámetro index.
     *  Si el valor de index no es válido, entonces no hace nada. Los elementos a continuación 
     *  del añadido se desplazan una posición.
     */
    public void add(int index, int elemento)
    {
         int numerosBis[]=new int [numeros.length+1];
       
        //s si el indice introducido esta dentro del tamaño del array, metemos el elemento
    if (index < 0 || index <= numeros.length)
    {
         for (int indice = 0; indice<numeros.length ;indice++)
      {
             numerosBis[indice]=numeros[indice];
      }
        
       numerosBis[index] = elemento;
       for ( int indice = index +1;indice<numerosBis.length; indice++)
       {
       
         numerosBis[indice]=numeros[indice-1];
        }
       numeros = numerosBis;
       
      
    }
    }
    /**
     * vacía la colección.
     */
    public void clear()
    {
       
        numeros = new int[0];
        
    }
    /**
     * devuelve true si la colección contiene ese elemento, false en cualquier otro caso.
     * 
     */
    public boolean contains(int elemento)
    {
        //declaramos e iniciallicamos indice para recorrer array y booelano para controlar si es encontrado
        boolean contieneElemento = false;
        int index = 0;
        //bucle para recorrer el array hasta que encuentre el elemento y sino hasta el final del array
        while (!contieneElemento || index < numeros.length )
        {
            // si lo que contiene el la posicion index es el elemento, la boolenana cambia de estado
            if (numeros[index]==elemento)
            {
              contieneElemento = true;
            }
            index++;
        }
        return contieneElemento;
    }
    /**
     * devuelve el elemento existente en la posición indicada. Si el valor de index no es válido,
     * entonces devuelve -1
     */
    public int get(int index)
    {
        // inicializamos y decaramos atributo local con valor -1 por si no es valido
        int posicionIndicada = -1;
        //si index es valido meteros en la variable local el valor que tiene el array en esa posicion
        if (index == 0 || index < numeros.length)
        {
           posicionIndicada = numeros[index]; 
        }
        return posicionIndicada;
    
    }
    /**
     * reemplaza el elemento en la posición index con el valor de element. Si el índice no es válido, 
     * no hace nada.
     */
    public void set(int index, int elemento)
    {
        if (index == 0 || index < numeros.length)
        {
            numeros[index] = elemento;
        }
    
    }
    /**
     *  devuelve el indice en el que aparece la primera ocurrencia del elemento especificado
     *  o -1 en caso de que la colección no contenga el elemento especificado.
     */
    public int indexOf(int elemento)
    {
        //atributo local para recorrer el array
        int index = 0;
        // booleano para controlar si encontramos elemento
        boolean elementoEncontrado = false;
        // atributo local para q devuelva la posicion, inicializado a -1 en caso q no contenga el  elemento
        int indiceElementoEncontrado = -1;
        //bucle para recorrer el array
        while (!elementoEncontrado && index < numeros.length)
        {
            // preguntamos si el elemento introducido es igual al que contiene en esa posicion
            if (elemento == numeros[index])
            {
                //si lo encuentra, lo metemos en el atributo local y cambiamos el booleano de control
                indiceElementoEncontrado = index;
                elementoEncontrado = true;
                
            }
            index++;
        }
        return indiceElementoEncontrado;
    
    }
    /**
     * devuelve true si la lista no contiene elementos.
     */
    public boolean isEmpty()
    {
        //declaramos e inicializamos boolena de control
        boolean noContieneElementos = false;
        //si el tamaño del array es 0 es q esta vacio , entonces la booleana pasa a true
        if (numeros.length == 0)
        {
            noContieneElementos = true;
        }
      return noContieneElementos;
    }
    /**
     *  elimina de la colección el elemento que ocupa la posición especificada y devuelve dicho elemento.
     *  Si el valor de index no es válido, no hace nada y devuelve -1.
     */
    public int remove(int index)
    {
        // declamos e inicializamos atribito de retorno a -1 por si se da el caso que el indice no es valido
        int elementoEliminado=-1;
        // prguntamos si existe la posicion introducida por teclado
        if (index >= 0 || index < numeros.length)
        {
            //si existe guardamos su contenido en el atributo local
            elementoEliminado = numeros[index];
            // y eliminamos esa posicion
            numeros[index] = 0;
        }
        return elementoEliminado;
    
    }
    /**
     *  devuelve el número de elementos de la colección
     */
    public int size()
    {
        return numeros.length;
    }
}
