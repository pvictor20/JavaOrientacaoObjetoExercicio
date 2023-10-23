public class ControleRemoto {
    private Televisao televisao;

    public ControleRemoto(Televisao televisao) {
        this.televisao = televisao;
    }

    public void aumentarVolume() {
        televisao.aumentarVolume();
    }

    public void diminuirVolume() {
        televisao.diminuirVolume();
    }

    public void mudarCanalParaCima() {
        televisao.mudarCanalParaCima();
    }

    public void mudarCanalParaBaixo() {
        televisao.mudarCanalParaBaixo();
    }

    public void mudarCanalPara(int canal) {
        televisao.mudarCanalPara(canal);
    }
}
