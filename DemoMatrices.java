public class DemoMatrices {
    public static void main(String[] args) {
        try{
            Integer[][] matriz1 = crearMatriz(10, 10);
            mostrarMatriz(matriz1);
        }
        catch(IllegalArgumentException e){
            System.out.println("\n\tLos datos introduidos no son validos.\n");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        Integer[][] matrizPrueba = new Integer[10][10];
        for(Integer i = 0; i < matrizPrueba.length; i++){
            for(Integer j = 0; j < matrizPrueba[i].length; j++){
                matrizPrueba[i][j] = (int) Math.floor(Math.random()*100);
            }
        }
        mostrarMatriz(matrizPrueba);
    }
    static Integer[][] crearMatriz(Integer n1, Integer n2){
        if(n1 < 1 || n2 < 1){
            Integer[][] matriz = new Integer[n1][n1];
            for(Integer i = 0; i < matriz.length; i++){
                for(Integer j = 0; j < matriz[i].length; j++){
                    matriz[i][j] = (int) Math.floor(Math.random() * 100);
                }
            }
            return matriz;
        }
        else{
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