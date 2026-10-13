public class ControleRemoto implements Controlador {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;


    // Metodo Especial
    public ControleRemoto() {
        this.volume = 0;
        this.ligado = false;
        this.tocando = false;
    }


    //Getters & Setters


    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    //metodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("===== Menu =====");
        System.out.println("Está ligado? :"+this.getLigado());
        System.out.println("Está tocando? :"+this.getTocando());
        System.out.print("Volume: " +this.getVolume());
        for (int i = 0; i<= this.getVolume(); i += 10){
            System.out.print(" I");
        }
        System.out.println();
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (getLigado()){
            setVolume(getVolume() + 5);
        }else {
            System.out.println("Impossível Aumentar Volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            setVolume(this.getVolume() - 5);
        }else {
            System.out.println("Impossível diminuir Volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume()>0){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && (this.getTocando())){
            this.setTocando(false);
        }
    }




}
