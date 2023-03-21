public class SmartTv {
    boolean ligada=false;
    int canal=1; 
    int volume=15;

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("o volume aumentou para" + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("o volume diminuiu para" + volume);
    }

    public void mudarCanal(int novoCanal){
        canal= novoCanal;
        System.out.println("o canal mudou para"+ canal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("o canal atual aumentou para"+"" + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("o canal atual diminuiu para"+""+canal);
    }




}
