public class cabecalho {

    private String faculdade;
    private String aluno;
    private String professor;
    private String tema;

    public cabecalho(String faculdade, String aluno, String professor, String tema) {
        this.faculdade = faculdade;
        this.aluno = aluno;
        this.professor = professor;
        this.tema = tema;
    }

    public void exibirCabecalho() {
        System.out.println("============================================");
        System.out.println("FACULDADE: " + faculdade);
        System.out.println("ALUNO:     " + aluno);
        System.out.println("PROFESSOR: " + professor);
        System.out.println("TEMA:      " + tema);
        System.out.println("============================================\n");
    }
}