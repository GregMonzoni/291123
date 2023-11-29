package aula10;

public class dowhile1 {
    public static void main(String[] args) {
        int totalTempo = 2;
        int inicioTempo = 0;
        while (inicioTempo <= totalTempo) {
            try {
                System.out.println("Assistindo filme... inicioTempo: " + inicioTempo);
                Thread.sleep(60000);
                inicioTempo++;
            } catch (InterruptedException e) {
                System.out.println("Ops! Houve um erro...: " + e);
            }
        }
        System.out.println("fim do filme");
    }
}
