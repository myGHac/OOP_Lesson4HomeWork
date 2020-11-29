package task2;

public class XMLHandler extends AbstractHandler {
    public void open() {
        System.out.println("Открыт документ типа .XML");
    }
    public void create(){
        System.out.println("Создан документ типа .XML");
    }
    public void change(){
        System.out.println("Изменен документ типа .XML");
    }
    public void save(){
        System.out.println("Сохранен документ типа .XML");
    }
}
