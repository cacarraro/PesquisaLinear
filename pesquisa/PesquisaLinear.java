package pesquisa;

public class PesquisaLinear
{
    public int pesquisa_lnear(int[] vetor, int tamanho, int chave)
    {
        int resposta = -1;
        for (int i = 0; i < tamanho; i++)
        {
            if (vetor[i] == chave)
            {
                resposta = i;
                return resposta;
            }
        }
        return resposta;
    }
}
class Main {
    public static void main(String[] args)
    {
        int[] vetor_teste = {2,4,3,12,5,7,32,1,10,6,11,8,50,9,13};
        int tamanho = vetor_teste.length;
        int chave = 11;
        PesquisaLinear p = new PesquisaLinear();

        int resultado = p.pesquisa_lnear(vetor_teste, tamanho,chave);
        System.out.println("O indice da chave " + chave + " no vetor_teste eh: " + resultado);

    }
}