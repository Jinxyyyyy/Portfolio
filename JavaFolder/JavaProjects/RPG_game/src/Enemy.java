public class Enemy {
    private int health;
    private int maxHealth;
    private int attackPoints;
    private int experienceGiven;


    public Enemy (int health, int maxHealth, int attackPoints, int experienceGiven){
        this.health = maxHealth;
        this.maxHealth = maxHealth;
        this.attackPoints = attackPoints;
        this.experienceGiven = experienceGiven;
    }


    public int enemyDamageCalculator(Hero hero) {
        int damage = attackPoints;
        if (hero.name.charAt(0) == Hero.ATTACK_TYPE) {
            damage *= 2;
        } else if (hero.name.charAt(0) == Hero.DEFENCE_TYPE) {
            damage = (int)(damage * 0.5);
        }
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperienceGiven() {
        return experienceGiven;
    }
}
