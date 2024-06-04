
public class Namekuseijin extends PersonagemDragonBall{
    private int quantidadeEsferas;
    private boolean podeCurar;
    
    Namekuseijin(String nome, String sexo, int idade, int temporada, double ki, String poderEspecial, int quantidadeEsferas, boolean podeCurar) {
        super(nome, sexo, idade, temporada, ki, poderEspecial);
        setQuantidadeEsferas(quantidadeEsferas);
        setPodeCurar(podeCurar);
        calcularPoder();
    }
    
    public int getQuantidadeEsferas() {
        return quantidadeEsferas;
    }
    public void setQuantidadeEsferas(int quantidadeEsferas) {
        if(quantidadeEsferas<=7){
            this.quantidadeEsferas = quantidadeEsferas;
        } else{
            this.quantidadeEsferas = 0;
        }
    }

    public boolean getPodeCurar() {
        return podeCurar;
    }
    public void setPodeCurar(boolean podeCurar) {
        this.podeCurar = podeCurar;
    }

    @Override
    public void calcularPoder() {
        if(podeCurar==true){
            setPoderTotal(getKi()*(1 + 0.2/0));
        } else{
            setPoderTotal(getKi()*1);
        }
    } 
    public void fazerDejeso(String desejo){
        if(quantidadeEsferas>=7){
            String [] divisao = desejo.split(" ");
            for(int i = 0; i<divisao.length; i++){
                if(divisao[i].equalsIgnoreCase("Eu") || divisao[i].equalsIgnoreCase("Nos")){
                    divisao[i] = "Kuan";
                } else if(divisao[i].equalsIgnoreCase("Desejo") || divisao[i].equalsIgnoreCase("Desejamos")){
                    divisao[i] = "Kuseon";
                }else if(divisao[i].equalsIgnoreCase("Reviver")){
                    divisao[i] = "Kusian";
                } else if(divisao[i].equalsIgnoreCase("Comer") || divisao[i].equalsIgnoreCase("Beber") || divisao[i].equalsIgnoreCase("Comida") || divisao[i].equalsIgnoreCase("Bebida")){
                    divisao[i] = "Koler";
                } else if(divisao[i].equalsIgnoreCase("Muito")){
                    divisao[i]="Mist";
                } else if(divisao[i].equalsIgnoreCase("dinheiro")){
                    divisao[i] = "Zenis";
                }
            }

            for(int i = 0; i<divisao.length; i++){
                System.out.print(divisao[i] + " ");
            }
            System.out.println();
        } else{
            System.out.println("Você não tem esferas suficientes");
        }
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nQuantidade Esferas:%d\nPode curar:%b", quantidadeEsferas, podeCurar);
    }
}