package americanas.com.br.letscode;

import implemts.FabricarMensagem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boolean validador = Boolean.TRUE;
        FabricarMensagem fabricarMensagem = new FabricarMensagem();
        while (validador) {
            fabricarMensagem.recebeNumPessoas();
            if (fabricarMensagem.getNumPessoas() <= 0){
                validador = Boolean.FALSE;
            }
            fabricarMensagem.recebeMensagem();
            fabricarMensagem.recebeNomePessoas();
            fabricarMensagem.exibirMensagem();
            fabricarMensagem.limparRegistros();
        }
    }
}
