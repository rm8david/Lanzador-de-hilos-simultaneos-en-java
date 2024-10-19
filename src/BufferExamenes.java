import java.util.LinkedList;
import java.util.Queue;

public class BufferExamenes {
    private Queue<String> cola;
    public BufferExamenes() {
        cola = new LinkedList<>();
    }
    public synchronized void poner(String exm){
        cola.add(exm);
        notify();
    }
    public synchronized String leer(){
        while(cola.isEmpty()){
            try {
                wait(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en la lectura" + e.getLocalizedMessage());
            }
        } if(!cola.isEmpty()){
            String exm = cola.remove();
            return exm;
        }else return null;
    }
}
