package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {

    @Override
    public String toString() {
        return "woof! woof!";
    }
}



// 1) Создайте бин Dog, унаследуйте его от Animal.
//    Создайте на основе этого класса компонент.

