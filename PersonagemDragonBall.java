public abstract class PersonagemDragonBall {
    private String nome, sexo, poderEspecial;
    private int idade, temporada;
    private double ki, poderTotal;

    PersonagemDragonBall(String nome, String sexo, int idade, int temporada, double ki, String poderEspecial){
        setNome(nome);
        setSexo(sexo);
        setIdade(idade);
        setTemporada(temporada);
        setKi(ki);
        setPoderEspecial(poderEspecial);
        calcularPoder();
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPoderEspecial() {
        return poderEspecial;
    }
    public void setPoderEspecial(String poderEspecial) {
        this.poderEspecial = poderEspecial;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTemporada() {
        return temporada;
    }
    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public double getKi() {
        return ki;
    }
    public void setKi(double ki) {
        this.ki = ki;
    }

    public double getPoderTotal(){
        return poderTotal;
    }
    public void setPoderTotal(double poderTotal){
        this.poderTotal = poderTotal;
    }
    public abstract void calcularPoder();

    @Override
    public String toString() {
        return String.format("Nome:%s\nIdade:%d\nSexo:%s\nTemporada:%d\nPoder Especial:%s\nKi:%.2f\nPoder Total:%.2f", nome, idade, sexo, temporada, poderEspecial, ki, poderTotal);
    }
}
