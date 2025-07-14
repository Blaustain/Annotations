package br.com.SamuelSouza;

/**
 * @author Samuel Souza

*/
public class Main {

    public static void main(String[] args) {
        Class<?> clazz = Usuario.class;

        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tabela.valor());
        }
    }
}
