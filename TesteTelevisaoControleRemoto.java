public class TesteTelevisaoControleRemoto {
    public static void main(String[] args) {
        Televisao televisao = new Televisao(10, 1);
        ControleRemoto controleRemoto = new ControleRemoto(televisao);

        controleRemoto.aumentarVolume();
        System.out.println(televisao.getVolume()); 

        controleRemoto.mudarCanalPara(5);
        System.out.println(televisao.getCanal()); 

        controleRemoto.mudarCanalParaCima();
        System.out.println(televisao.getCanal()); 
    }
}
