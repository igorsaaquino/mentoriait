public class Instrutor extends Usuario {

    private String materia; 
    private String formacao;
    private int cpf;
    private int modeloDeTrabalho;

    Instrutor(String materia, String formacao, int cpf){
        this.materia = materia;
        this.formacao = formacao;
        this.cpf = cpf;
        this.modeloDeTrabalho = modeloDeTrabalho;
        }
}