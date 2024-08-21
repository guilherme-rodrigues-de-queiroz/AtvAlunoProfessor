public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Luiz", "Centro", "Doutor");

        System.out.println("Dados do professor: " + professor1.getNome() + " - Endereço: " + professor1.getEndereco() + " - Titulação: " + professor1.getTitulacao());

        Aluno aluno1 = new Aluno("Guilherme", "Zona Leste", "", 9.0, 7.6, 6.5);

        System.out.println("Dados do aluno: " + aluno1.getNome() + " - Endereço: " + aluno1.getEndereco() + " - O aluno ficou com média de : " + aluno1.calcularMedia() + " " + aluno1.verificarAprovacao());
    }
}
