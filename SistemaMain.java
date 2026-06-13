public class SistemaMain {
    public static void main(String[] args) {
        Voluntario voluntario1 = new Voluntario();

        voluntario1.setNome("João Pedro");
        voluntario1.setCpf("123.456.789-00");
        voluntario1.setDiasAtuacao(35);
        voluntario1.setSetor("Logística");

        Doador doador1 = new Doador();

        doador1.setNome("Ana Clara");
        doador1.setCpf("987.654.321-00");
        doador1.setDiasAtuacao(80);
        doador1.setValorDoadoMensal(100.00);

        ProjetoSocial projeto1 = new ProjetoSocial();

        projeto1.setNomeDoProjeto("Doação de Alimentos");
        projeto1.setMetaImpacto(150);
        projeto1.setLider(voluntario1);

        voluntario1.exibirResumo();
        doador1.exibirResumo();
        projeto1.iniciarProjeto();
    }
}