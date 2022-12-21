//todo hacer bien porque está mal
public class Hilo implements Runnable{
    String cadena;

    public Hilo(String cadena) {
        cadena = this.cadena;
    }

    @Override
    public void run() {
        System.out.println("Hola mundo "+cadena+" :"+Thread.currentThread().getId());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Hilo h1 = new Hilo("Palabra");
        h1.run();
    }
}
