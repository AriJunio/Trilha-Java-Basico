public class SmartTv {
    boolean ligada=false;
    int canal = 1;
    int volume = 25;

public void mudarCanal(int novoCanal){
        canal= novoCanal;
}
    public void aumentaCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void aumentaVolume(){
        volume++;
        System.out.println("Aumentado o volume para:" + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuido o volume para:" + volume);
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    
}