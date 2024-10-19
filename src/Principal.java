public class Principal
{
    public static void main(String[] args) {
        BufferExamenes buffer = new BufferExamenes();
        new ProductorExamenes(buffer);
        new Examinado(buffer,"Juan");
        new ProductorExamenes(buffer);
        new Examinado(buffer,"Lucia");
        new ProductorExamenes(buffer);
        new Examinado(buffer,"Silvia");
        new ProductorExamenes(buffer);
        new Examinado(buffer,"Alfredo");

    }
}
