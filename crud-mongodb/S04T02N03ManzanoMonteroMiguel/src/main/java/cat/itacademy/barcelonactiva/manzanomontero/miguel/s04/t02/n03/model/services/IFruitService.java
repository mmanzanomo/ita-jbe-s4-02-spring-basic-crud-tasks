package cat.itacademy.barcelonactiva.manzanomontero.miguel.s04.t02.n03.model.services;

import cat.itacademy.barcelonactiva.manzanomontero.miguel.s04.t02.n03.model.domain.Fruit;

import java.util.List;
import java.util.Optional;

public interface IFruitService {
    Fruit save(Fruit fruit);

    Fruit update(Fruit fruit);

    void delete(String id);

    Optional<Fruit> findOne(String id);

    List<Fruit> findAll();
}
