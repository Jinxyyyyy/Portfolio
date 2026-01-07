public class Hero{
    // attributes
    final String name;
    private int health;
    private int maxHealth;
    private int level = 1;
    private int experience = 0;
    private int attackDamage;
    public static final char ATTACK_TYPE = 'A';
    public static final char DEFENCE_TYPE = 'D';
    private int enemyKilled = 0;



    public Hero(String name, int maxHealth, int attackDamage) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.attackDamage = attackDamage;
        this.health = maxHealth;
    }

    public int heroDamageCalculator() {
        int damage = attackDamage; // ne pas modifier l'attribut
        if (name.charAt(0) == ATTACK_TYPE) {
            damage *= 2;
        } else if (name.charAt(0) == DEFENCE_TYPE) {
            damage = (int)(damage * 0.5);
        }
        return damage;
    }


    public void experienceChecker () {
        while (level < 99) {
            int nextLevel = level + 1;
            int experienceRequired = (int) (50 + nextLevel * 20 * (Math.pow(1.1,nextLevel)));
            if (experience >= experienceRequired) {
                level ++;
                experience = 0;
                maxHealth += 12;
                attackDamage += 6;
                health = maxHealth;
            }
            else {
                break;
            }
        }
    }
    
    public int getHealth(){
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
