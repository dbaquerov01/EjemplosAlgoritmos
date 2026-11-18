import javax.swing.plaf.synth.SynthStyleFactory;

public class DemoMatrices {
    public static void main(String[] args) {
        crearMatriz(10, 10);
    }
    static void crearMatriz(Integer n1, Integer n2){
        Integer[][] matriz = new Integer[n1][n1];
        for(Integer i = 0; i < matriz.length; i++){
            for(Integer j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int) Math.floor(Math.random() * 100);
            }
        }

        for(Integer i = 0; i < matriz.length; i++){
            for(Integer j = 0; j < matriz[i].length; j++){
                System.out.print("   " + matriz[i][j]);
            }
            System.out.println();
        }
    }

    /*static void mostrarMatriz(Integer[][] matriz){
        for(Integer i = 0; i < matriz.length; i++){
            for(Integer j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }*/
}