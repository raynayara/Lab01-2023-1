package main;
public class App {
    public static int encontre(int[] arrayOrdenado, int num) {
        int inicio = 0; // Inicio
        int fim = arrayOrdenado.length - 1; // fim
        int meio; //meio

        while (inicio <= fim) {
            meio = (inicio + fim) / 2 ; // Calcula o índice do elemento do meio
            if (arrayOrdenado[meio] == num) {
                return meio; // Elemento encontrado, retorna a posição (índice) do elemento
            } else if (arrayOrdenado[meio] < num) {
                inicio = meio + 1; // Atualiza o índice esquerdo para a metade da direita
            } else {
                fim = meio - 1; // Atualiza o índice direito para a metade da esquerda
            }
        }
        
        return -1; // Elemento não encontrado
    }
}

//---------------------------------------------------------------------------------------------

    public static int maior(int[] arrayDesordenado, int num){
        int maior = arrayDesordenado[0]; //definindo o elemento inicial como o maior
        for (int i = 0; i < arrayDesordenado.length; i++) {

            if (arrayDesordenado[i] > maior) {
                maior = arrayDesordenado[i]; //atualização do maior elemento 
            }
        }
        
        return maior; // mostra o maior elemento encontrado 
    }

    

//---------------------------------------------------------------------------------------------

    public static Integer parMaisProximo(Integer[][] pares){
        return 1;
    }
}
