package app.model;

/*В компоненте AnimalCage есть поле типа Animal,
которое связано с помощью аннотации @Autowired.
 При выполнении программы DI-контейнер подтянет сюда бин,
  подходящий по типу.*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    private Animal animal;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
}


/*Внедрение зависимостей между классами в проекте позволяет упростить
управление зависимостями между объектами и сделать его более удобным и гибким.
 Это также помогает сократить число проверок null,
 поскольку DI-контейнер занимается выполнением задач связывания зависимостей.*/