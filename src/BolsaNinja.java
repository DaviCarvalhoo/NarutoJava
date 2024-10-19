import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BolsaNinja<T>{
    private List<T> ferramentas;
    public void adicionarFerramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

    public BolsaNinja(){
        this.ferramentas = new ArrayList<>();
    }

     public void mostrarFerramenta(){
        for(T ferramenta : ferramentas){
            System.out.println(ferramenta);
        }
     }

    public static void main(String[] args) {
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();

        bolsaNinja.adicionarFerramenta(new Kunai("Kunai explosiva"));
        bolsaNinja.adicionarFerramenta(new Shuriken(3));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Invocação do Sapo"));

        System.out.println("Itens da nossa bolsa ninja: ");
        bolsaNinja.mostrarFerramenta();
    }
}
