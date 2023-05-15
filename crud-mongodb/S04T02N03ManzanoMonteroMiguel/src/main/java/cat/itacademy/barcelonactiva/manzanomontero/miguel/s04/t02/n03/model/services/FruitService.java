package cat.itacademy.barcelonactiva.manzanomontero.miguel.s04.t02.n03.model.services;

import cat.itacademy.barcelonactiva.manzanomontero.miguel.s04.t02.n03.model.domain.Fruit;
import cat.itacademy.barcelonactiva.manzanomontero.miguel.s04.t02.n03.model.repository.IFruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FruitService implements IFruitService {
    @Autowired
    private IFruitRepository fruitRepository;

    @Override
    public Fruit save(Fruit fruit) {
        return this.fruitRepository.save(fruit);
    }

    @Override
    public Fruit update(Fruit fruit) {
        Optional<Fruit> updatedFruit = this.fruitRepository.findById(fruit.getId());
        if(updatedFruit.isPresent()) {
            Fruit _fruit = updatedFruit.get();
            _fruit.setName(fruit.getName());
            _fruit.setQuantityKilos(fruit.getQuantityKilos());
            this.fruitRepository.save(_fruit);
            return _fruit;
        }
        return null;
    }

    @Override
    public void delete(String id) {
        this.fruitRepository.deleteById(id);
    }

    @Override
    public Optional<Fruit> findOne(String id) {
        return fruitRepository.findById(id);
    }

    @Override
    public List<Fruit> findAll() {
        List<Fruit> fruits = fruitRepository.findAll();
        return fruits;
    }


}
