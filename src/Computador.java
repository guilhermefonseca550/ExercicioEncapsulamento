import java.util.ArrayList;

public class Computador implements InterfacePC{
    public boolean ligado;
    public int volume;
    public ArrayList<String> pecas;

    public Computador(){
        this.ligado = false;
        this.volume = 50;
        this.pecas = new ArrayList<>();
        this.pecas.add("Intel Core I5");
        this.pecas.add("Radeon Rx 580");

    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public ArrayList<String> getPecas() {
        return pecas;
    }

    public void setPecas(ArrayList<String> pecas) {
        this.pecas = pecas;
    }


    @Override
    public void ligar() {
        if(!this.isLigado()){
            this.setLigado(true);
            System.out.println("Ligando...");
        }else{
            System.out.println("Já está ligado!");
        }
    }

    @Override
    public void desligar() {
        if(this.isLigado()){
            this.setLigado(false);
            System.out.println("Desligando...");
        }else{
            System.out.println("Já está desligado!");
        }
    }

    @Override
    public void maisVolume() {
        if(this.isLigado() && this.getVolume() < 100){
            setVolume(this.getVolume() + 1);
            System.out.println("Volume: " + this.getVolume());
        }else if(this.isLigado() && this.getVolume() >= 100){
            System.out.println("Volume no máximo!");
        }else{
            System.out.println("Monitor Desligado!");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado() && this.getVolume() > 0){
            this.setVolume(getVolume() - 1);
            System.out.println("Volume: " + this.getVolume());
        }else if(this.isLigado() && this.getVolume() <=0){
            System.out.println("Já está no mínimo!");
        }else{
            System.out.println("Monitor desligado!");
        }
    }


    @Override
    public void adicionarPeca(String peca) {
        if(!(this.isLigado())){
        System.out.println("Você adicionou esta peça: " + peca);
        this.pecas.add(peca);
           }else{
            System.out.println("Desligue o computador primeiro!");
        }
    }

    @Override
    public void retirarPeca(String peca) {
        if(!(this.isLigado())) {
            System.out.println("Você retirou esta peça: " + peca);
            this.pecas.remove(peca);
        }else{
            System.out.println("Desligue o computador primeiro!");
        }
    }

    @Override
    public void verificarPecas() {
        System.out.println("Seu PC está com estas peças: " + pecas);
    }

}




