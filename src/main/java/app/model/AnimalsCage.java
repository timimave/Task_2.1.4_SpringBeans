package app.model;

/*В компоненте AnimalCage есть поле типа Animal,
которое связано с помощью аннотации @Autowired.
 При выполнении программы DI-контейнер подтянет сюда бин,
  подходящий по типу.*/

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
     private Animal animal;
  // private List<Animal> animals;
    @Autowired
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
     //   System.out.println(animals.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
}


/*Внедрение зависимостей между классами в проекте позволяет упростить
управление зависимостями между объектами и сделать его более удобным и гибким.
 Это также помогает сократить число проверок null,
 поскольку DI-контейнер занимается выполнением задач связывания зависимостей.*/

/*2) Запустите приложение и проверьте,
что было выброшено исключение NoUniqueBeanDefinitionException.
Это произошло из-за того, что существует 2 бина с типом Animal.*/

/* @Qualifier - это аннотация, которая уточняет,
какой конкретный бин хотим внедрить.*/