import java.time.LocalDateTime;

public class ProductorExamenes implements Runnable{
    private Thread hilo;
    private BufferExamenes buffer;
    private static int numeroExamen = 0;
    public ProductorExamenes(BufferExamenes buffer) {
        numeroExamen++;
        this.buffer = buffer;
        hilo = new Thread(this,"E"+numeroExamen);
        hilo.start();
    }
    @Override
    public void run() {
        int aa = LocalDateTime.now().getYear();
        String nombreExamen = this.hilo.getName()+"-"+aa;
        buffer.poner(nombreExamen);
        System.out.println("examen "+nombreExamen);
    }
}
