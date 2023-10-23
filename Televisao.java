public class Televisao {
    private int volume;
    private int canal;

    public Televisao(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void mudarCanalParaCima() {
        canal++;
    }

    public void mudarCanalParaBaixo() {
        canal--;
    }

    public void mudarCanalPara(int canal) {
        this.canal = canal;
    }
}
