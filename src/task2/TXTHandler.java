package task2;

public class TXTHandler extends AbstractHandler {
    public void open() {
        System.out.println("Открыт документ типа .TXT");
    }
    public void create(){
        System.out.println("Создан документ типа .TXT");
    }
    public void change(){
        System.out.println("Изменен документ типа .TXT");
    }
    public void save(){
        System.out.println("Сохранен документ типа .TXT");
    }
}
