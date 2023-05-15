package cat.itacademy.barcelonactiva.manzanomontero.miguel.s04.t02.n03.model.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "fruits")
public class Fruit {
    @Id
    private String id;
    private String name;
    private int quantityKilos;


    public Fruit() {}

    public Fruit(String name, int quantityKilos) {
        this.name = name;
        this.quantityKilos = quantityKilos;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityKilos() {
        return quantityKilos;
    }

    public void setQuantityKilos(int quantityKilos) {
        this.quantityKilos = quantityKilos;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", quantityKilos=").append(quantityKilos);
        sb.append('}');
        return sb.toString();
    }


}
