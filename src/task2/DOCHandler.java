package task2;

public class DOCHandler extends AbstractHandler {

    public void open() {
System.out.println("Открыт документ типа .DOC");
    }
    public void create(){
        System.out.println("Создан документ типа .DOC");
    }
    public void change(){
        System.out.println("Изменен документ типа .DOC");
    }
    public void save(){
        System.out.println("Сохранен документ типа .DOC");
    }
}
