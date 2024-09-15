public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.mudarCanal(501);

        System.out.println("A TV está ligada? "+smartTv.ligada);
        System.out.println("Qual canal está sintonizado? "+smartTv.canal);
        System.out.println("Volume atual? "+smartTv.volume);

        smartTv.ligar();

        System.out.println("A TV está ligada? "+smartTv.ligada);
      
        smartTv.desligar();


    }
}
