public class Saiyajin extends PersonagemDragonBall implements Transformavel {
    private int nivelMaximoSSJ;
    private boolean temRabo;

    Saiyajin(String nome, String sexo, int idade, int temporada, double ki, String poderEspecial, int nivelMaximoSSJ, boolean temRabo) {
        super(nome, sexo, idade, temporada, ki, poderEspecial);
        setNivelMaximoSSJ(nivelMaximoSSJ);
        setTemRabo(temRabo);
        calcularPoder();
    }

    public int getNivelMaximoSSJ() {
        return nivelMaximoSSJ;
    }

    public void setNivelMaximoSSJ(int nivelMaximoSSJ) {
        this.nivelMaximoSSJ = nivelMaximoSSJ;
    }


    public boolean getTemRabo() {
        return temRabo;
    }
    public void setTemRabo(boolean temRabo) {
        this.temRabo = temRabo;
    }

    @Override
    public void calcularPoder() {
        setPoderTotal(getKi()*(1 + nivelMaximoSSJ * 0.1));
    }
    
    @Override
    public void transformar(int nivel) {
        if(getNome().equalsIgnoreCase("Goku") || getNome().equalsIgnoreCase("Vegeta")){
            if(nivel<=5){
                System.out.println(getNome() + " transformou para super sayajin nível " + nivel);
            } else{
                System.out.println("Não foi possível transformar esse sayajin");
            }
        } else{
            if(nivel<=3){
                System.out.println(getNome() + " transformou para super sayajin nível " + nivel);
            } else{
                System.out.println("Não foi possível transformar esse sayajin");
            }
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nTem Rabo:" + temRabo;
    }
}
