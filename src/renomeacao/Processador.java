package renomeacao;

/**
 * EXERCÍCIO: Renomeação
 * 
 * PROBLEMA: Os nomes das variáveis e métodos não são claros e não expressam bem sua intenção.
 * 
 * TAREFA: Renomeie as variáveis e métodos para nomes mais descritivos e expressivos.
 * 
 * DICA: Nomes devem revelar a intenção do código. Evite abreviações e nomes genéricos.
 */
public class Processador {
    
    public void repetirtexto(String texto, int qtdRepeticoes) {
        String TextoRepetido = "";
        for (int i = 0; i < qtdRepeticoes; i++) {
            TextoRepetido = TextoRepetido + texto;
        }
        System.out.println(TextoRepetido);
    }
    
    public int calcular(int primeioNum, int segundoNum) {
        return primeioNum * segundoNum + primeioNum + segundoNum;
    }
}

