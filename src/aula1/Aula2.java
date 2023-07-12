package aula1;

import javax.swing.JOptionPane;

public class Aula2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //vetor   

        String[] frutas = new String[10];
        String[] frutas2 = {"laranja", "maçã"};
        int[] numeros = {1, 2, 3, 4, 5, 6};
        int[] numeros2 = new int[8];
        //dados

        String nome = "Zé da manga";
        int dataNascimento = 1997;
        char sexo = 'M';
        double altura = 1.76;
        boolean professor = true;
        float alturaDois = (float) 1.76;
        int idade2 = qualIdade(1997);
        //if/else

        System.out.println(idade2);
        if (qualIdade(dataNascimento) >= 18) {
            System.out.println("vc é maior de idade");

        } else {
            System.out.println("n é");

        }
        //for
        for (String fruta : frutas2) {
            System.out.println(fruta);
        }

        for (int i = 0; i < frutas2.length; i++) {
            System.out.println(frutas2[i]);

        }

        int i = 0;
        while (i < frutas.length) {
            System.out.println(frutas[i]);
            i++;
        }

        // classes wrapper
      int varPrimitiva = 10;
      Integer varPrimitiva2 = 10;
      
      double valor = 2.10;
      Double valor2 = 2.10;
      
      int miaumiaumiau = 1;



//função
    }

    public static int qualIdade(int anoNascimento) {

        return 2023 - anoNascimento;
    }
}
