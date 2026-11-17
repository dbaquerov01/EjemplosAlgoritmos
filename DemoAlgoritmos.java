package EgemplosAlgoritmos;
public class DemoAlgoritmos {
    public static void main(String[] args) {
        Integer[] array1 = new Integer[100];
        rellenarArray(array1);
        contarMayoresDe(array1, 75);
        comprobarSiEdad(array1, 32);
        sumarMultiplosDe(array1, 7);
        mayorPar(array1);
    }

    static void rellenarArray(Integer[] array){
        for(Integer i = 0; i < array.length; i++){
            array[i] = (int) Math.floor(Math.random() * 100 + 1);
        }
    }

    static void contarMayoresDe(Integer[] array, Integer edad){
        Integer contador = 0;
        for(Integer i = 0; i < array.length; i++){
            if(array[i] >= 75){
                contador++;
            }
        }
        System.out.println("Hay " + contador + " personas mayores de " + edad + " años.");
    }

    static void comprobarSiEdad(Integer[] array, Integer edad){
        Boolean encontrado = false;
        Integer i = 0;
        do{
            if(array[i++] == 45){
                encontrado = true;
                break;
            }
        }while(encontrado == false && i < array.length);
        System.out.println(encontrado?"Encontrado":"No encontrado");
    }

    static void sumarMultiplosDe(Integer[] array, Integer numero){
    Integer total = 0;
        for(Integer i = 0; i < array.length; i++){
            if((array[i] % numero) == 0){
                total++;
            }
        }
        System.out.println(total);
    }

    static void mayorPar(Integer[] array){
        Integer mayor = array[0];              
        Integer posicion = 0;
        for(Integer i = 0; i < array.length; i++){
            if((array[i] % 2) == 0){
                if((array[i]) > mayor){
                    mayor = array[i];
                    posicion = i;
                }
            }
        }
        System.out.println("Numero " + mayor + " Posicion " + posicion + ".");
    }
}

