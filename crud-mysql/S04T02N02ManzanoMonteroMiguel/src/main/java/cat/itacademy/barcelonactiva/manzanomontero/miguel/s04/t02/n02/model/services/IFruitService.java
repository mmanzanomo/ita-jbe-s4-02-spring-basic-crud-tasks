package cat.itacademy.barcelonactiva.manzanomontero.miguel.s04.t02.n02.model.services;

import cat.itacademy.barcelonactiva.manzanomontero.miguel.s04.t02.n02.model.domain.Fruit;

import java.util.List;
import java.util.Optional;

public interface IFruitService {

    Fruit save(Fruit fruit);

    Fruit update(Fruit fruit);

    void delete(long id);

    Optional<Fruit> findOne(long id);

    List<Fruit> findAll();

}
