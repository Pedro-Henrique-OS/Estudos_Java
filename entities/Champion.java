package desafios.combate.entities;

public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }


    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void takeDamage(Champion other) {
        int damage;


        if (armor >= other.attack) {
            damage = 1;

        } else {
            damage = other.attack - armor;

        }
        life -= damage;

        if (life <= 0) {
            life = 0;

        }


    }

    public String toString() {
        String status =
                "Nome " + name +
                        " Vida " + life;

        if (life == 0) {
            status += "(morreu)";
        }
        return status;
    }
}
// tenho que fazer o print de cada rodada e adicionar o fim de jogo quando um deles perder
