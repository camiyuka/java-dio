public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv= new SmartTv();//criando classes

        System.out.println("TV ligada :" + smartTv.ligada);
        System.out.println("Canal Atual :" + smartTv.canal);
        System.out.println("Volume Atual :" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status-> TV ligada?" + smartTv.ligada);

        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(90);
       
    }


}
