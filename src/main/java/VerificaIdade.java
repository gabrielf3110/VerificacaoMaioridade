public class VerificaIdade {

    public static void verificaMaioridade(int idade) {
        if(idade < 18) {
            System.out.println("O usuário possui menos de 18 anos.");
        } else if(idade >=18 && idade < 60) {
            System.out.println("O usuário possui mais de 17 anos e menos de 60 anos.");
        } else {
            System.out.println("O usuário possui 60 anos ou mais.");
        }
    }
}
