public class DemoMatrices {
    public static void main(String[] args) {
        try{
            Integer[][] matriz1 = crearMatriz(10, 10);
            mostrarMatriz(matriz1);
        }
        catch(IllegalArgumentException e){
            System.out.println("\n\tLos datos introduidos no son validos.\n");
        }
    }
    static Integer[][] crearMatriz(Integer n1, Integer n2){
        Integer[][] matriz = null;
        try{
            matriz = new Integer[n1][n1];
            for(Integer i = 0; i < matriz.length; i++){
                for(Integer j = 0; j < matriz[i].length; j++){
                    matriz[i][j] = (int) Math.floor(Math.random() * 100);
                }
            }
            return matriz;
        }
        catch(NegativeArraySizeException e){
            throw new IllegalArgumentException();
        }
    }

    static void mostrarMatriz(Integer[][] matriz){
        for(Integer i = 0; i < matriz.length; i++){
            for(Integer j = 0; j < matriz[i].length; j++){
                System.out.print("   " + matriz[i][j]);
            }
            System.out.println();
        }
    }
}