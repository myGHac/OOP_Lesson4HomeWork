package task3;

public class  Player implements Playable, Recodable {

    String compositionName;
    String composerName;

    public void play() { System.out.println(" Проигрывание мелодии  " + composerName + " " + compositionName);    }

    public void record() {
        System.out.println(" Запись мелодии  " + composerName+ " " + compositionName);
    }

    public void pause() {
        System.out.println(" Пауза" );
    }

    public void stop() {   System.out.println("Стоп");   }

    public Player(String compositionName, String  composerName) {
        this.compositionName = compositionName;
        this.composerName = composerName;

    }
}

