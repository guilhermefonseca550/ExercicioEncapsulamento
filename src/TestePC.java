public class TestePC {
    static void main() {
        Computador pc = new Computador();
        pc.ligar();
        pc.menosVolume();
        pc.desligar();
        pc.adicionarPeca("SSD 500gb");
        pc.verificarPecas();

    }
}
