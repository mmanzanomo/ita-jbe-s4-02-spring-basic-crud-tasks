package cat.itacademy.barcelonactiva.manzanomontero.miguel.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.manzanomontero.miguel.s04.t02.n01.model.domain.Fruit;

import java.util.List;
import java.util.Optional;

public interface IFruitService {

    Fruit save(Fruit fruit);

    Fruit update(Fruit fruit);

    void delete(int id);

    Optional<Fruit> findOne(int id);

    List<Fruit> findAll();

}
