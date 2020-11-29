package task3;

public class Main {
    public static void main(String[] args){

    Playable player1= new Player("Spring thunderstorm", "Strauss");
    Recodable player2 = new Player("Spring thunderstorm", "Strauss");
    System.out.println("Запись:");
        player2.record();
        player2.pause();
        player2.record();
        player2.stop();
        System.out.println();
    System.out.println("Проигрывание:");
        player1.play();
        player1.pause();
        player1.play();
        player1.stop();



    }
}
