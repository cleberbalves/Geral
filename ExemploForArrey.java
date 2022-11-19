import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class ExemploForArrey {
    public static void main(String[] args) {
        //em arrays o índice inicia em zero
        String alunos[] = {"DAVI", "MIGUEL", "REBECA", "CLEBER"};

        for ( int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);
        }
    }
}
