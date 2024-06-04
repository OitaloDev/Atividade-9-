public class Terraqueo extends PersonagemDragonBall{

    private String pais, cidade;

    Terraqueo(String nome, String sexo, int idade, int temporada, double ki, String poderEspecial,String pais, String cidade) {
        super(nome, sexo, idade, temporada, ki, poderEspecial);
        setPais(pais);
        setCidade(cidade);
        calcularPoder();
    }

    
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public void calcularPoder() {
        setPoderTotal(getKi());
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nPais:%s\nCidade:%s", pais, cidade);
    }
}
