package cat.itacademy.barcelonactiva.manzanomontero.miguel.s04.t02.n01.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name="Fruits")
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="quantityKilos")
    private int quantityKilos;


    public Fruit() {}

    public Fruit(String name, int quantityKilos) {
        this.name = name;
        this.quantityKilos = quantityKilos;
    }


    public int getId() {
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
