/**
 * Classe représentant un héros dans le jeu.
 * Contient les informations sur son nom, sa santé, ses dégâts, son niveau et son expérience.
 */
public class Hero {

    // =========================
    // ATTRIBUTS
    // =========================

    /** Nom du héros (final : ne change jamais) */
    final String name;

    /** Points de vie actuels du héros */
    private int health;

    /** Points de vie maximum du héros */
    private int maxHealth;

    /** Niveau du héros, commence à 1 */
    private int level = 1;

    /** Points d'expérience accumulés */
    private int experience = 0;

    /** Dégâts d'attaque de base du héros */
    private int attackDamage;

    /** Types de héros pour calcul de dégâts spéciaux */
    public static final char ATTACK_TYPE = 'A';
    public static final char DEFENCE_TYPE = 'D';

    /** Compteur des ennemis tués par ce héros (non utilisé dans Gameplay actuellement) */
    private int enemyKilled = 0;

    // =========================
    // CONSTRUCTEUR
    // =========================

    /**
     * Crée un héros avec un nom, une santé maximale et des dégâts d'attaque.
     * La santé actuelle est initialisée à la santé maximale.
     *
     * @param name nom du héros
     * @param maxHealth points de vie maximum
     * @param attackDamage dégâts d'attaque
     */
    public Hero(String name, int maxHealth, int attackDamage) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.attackDamage = attackDamage;
        this.health = maxHealth;
    }

    // =========================
    // MÉTHODES
    // =========================

    /**
     * Calcule les dégâts infligés par le héros lors d'une attaque.
     * Si le premier caractère du nom est 'A', les dégâts sont doublés.
     * Si le premier caractère du nom est 'D', les dégâts sont réduits de moitié.
     *
     * @return dégâts calculés pour cette attaque
     */
    public int heroDamageCalculator() {
        int damage = attackDamage; // ne pas modifier l'attribut attackDamage
        if (name.charAt(0) == ATTACK_TYPE) {
            damage *= 2;
        } else if (name.charAt(0) == DEFENCE_TYPE) {
            damage = (int) (damage * 0.5);
        }
        return damage;
    }

    /**
     * Vérifie si le héros a assez d'expérience pour monter de niveau.
     * Si oui, augmente le niveau, la santé maximale et les dégâts,
     * puis restaure la santé à son maximum.
     * Limite le niveau à 99.
     */
    public void experienceChecker() {
        while (level < 99) {
            int nextLevel = level + 1;
            int experienceRequired = (int) (50 + nextLevel * 20 * (Math.pow(1.1, nextLevel)));
            if (experience >= experienceRequired) {
                level++;
                experience = 0;
                maxHealth += 12;
                attackDamage += 6;
                health = maxHealth; // restore health on level up
            } else {
                break;
            }
        }
    }

    // =========================
    // GETTERS ET SETTERS
    // =========================

    public int getHealth() {
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

    public void setExperience(int experience) {
        this.experience = experience;
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
}
