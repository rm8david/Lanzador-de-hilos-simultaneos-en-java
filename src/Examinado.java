import java.io.Serializable;

public class Examinado implements Runnable {
    private Thread hilo;
    private BufferExamenes buffer;
    private String nombre;
    private static int contador = 0;

    public Examinado(BufferExamenes buffer, String nombre) {
        this.buffer = buffer;
        this.nombre = nombre;
        contador++;
        hilo = new Thread(this, nombre + contador);
        hilo.start();
    }

    @Override
    public void run() {
        String examen = buffer.leer();
        System.out.println(this.nombre + " hace el examen: " + examen);
    }
}
