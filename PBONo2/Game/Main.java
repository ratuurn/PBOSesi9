package PBONo2.Game;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Tank tigril=new Tank("Tigril");
        Tank franco=new Tank("Franco",2800,150,30);
        Tank akai=new Tank("Akai",2800,130,25);

        Marksman clint=new Marksman("Clint");
        Marksman lesley=new Marksman("Lesley",2500,150,15);
        Marksman bruno=new Marksman("Bruno",2500,150,20);

        ArrayDeque<Marksman> heroMarksman=new ArrayDeque<Marksman>();
        ArrayDeque<Tank> heroTank=new ArrayDeque<Tank>();

        heroTank.add(tigril);
        heroTank.addFirst(franco);
        heroTank.add(akai);

        heroMarksman.add(clint);
        heroMarksman.add(lesley);
        heroMarksman.addFirst(bruno);

        System.out.println("Hero-hero Tank : ");
        for(Tank tank: heroTank){
            tank.infoHero();
        }
        System.out.println("");
        System.out.println("Hero-hero Marksman :");
        for(Marksman mm: heroMarksman){
            mm.infoHero();
        }
    }
}
