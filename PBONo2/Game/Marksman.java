package PBONo2.Game;

public class Marksman extends Hero{
    private String nama;
    private float hp=2500;
    private float attack=150;
    private float defense=20;

    Marksman(String nama,float hp,float attack,float defense){
        this.nama=nama;
        this.hp=hp;
        this.attack=attack;
        this.defense=defense;
    }
    Marksman(String nama){
        this.nama=nama;
    }
    
    @Override
    String getName() {
        return this.nama;
    }
    @Override
    float getHp() {
        return this.hp;
    }
    @Override
    float getAttack() {
        return this.attack;
    }
    @Override
    float getDefense() {
        return this.defense;
    }

    @Override
    public void infoHero() {
        System.out.println(
            getName()+" :"+
            "\n\tHP\t: "+getHp()+
            "\n\tAttack\t: "+getAttack()+
            "\n\tDefense\t: "+getDefense()
        );
        System.out.println("");
    }
}
