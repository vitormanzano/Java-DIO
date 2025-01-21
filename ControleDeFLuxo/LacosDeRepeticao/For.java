package ControleDeFLuxo.LacosDeRepeticao;

public class For {
    public static void main(String[] args) {
        for (int carneirinhos = 1; carneirinhos <= 10; carneirinhos++) {
            System.out.println(carneirinhos + " carneirinhos");
        }
        int carneirinhos = 1;

        for (; carneirinhos <= 10; ) {
            System.out.println(carneirinhos + " carneirinhos");
            carneirinhos++;
        }

        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x = 0; x<alunos.length; x++) {
            System.out.println(alunos[x]);
        }
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
