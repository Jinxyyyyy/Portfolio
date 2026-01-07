    /**
     * Classe représentant un ennemi dans le jeu.
     * Contient les informations sur sa santé, ses points d'attaque
     * et l'expérience qu'il donne au héros lorsqu'il est vaincu.
     */
    public class Enemy {

        // =========================
        // ATTRIBUTS
        // =========================

        /** Points de vie actuels de l'ennemi */
        private int health;

        /** Points de vie maximum de l'ennemi */
        private int maxHealth;

        /** Dégâts d'attaque de l'ennemi */
        private int attackPoints;

        /** Expérience donnée au héros lorsque l'ennemi est vaincu */
        private int experienceGiven;

        // =========================
        // CONSTRUCTEUR
        // =========================

        /**
         * Crée un ennemi avec ses caractéristiques principales.
         *
         * @param health points de vie initiaux (actuellement on utilise maxHealth à la place)
         * @param maxHealth points de vie maximum
         * @param attackPoints dégâts d'attaque
         * @param experienceGiven expérience que le héros gagne en le battant
         */
        public Enemy(int health, int maxHealth, int attackPoints, int experienceGiven) {
            this.health = maxHealth;  // la santé actuelle est initialisée au maximum
            this.maxHealth = maxHealth;
            this.attackPoints = attackPoints;
            this.experienceGiven = experienceGiven;
        }

        // =========================
        // MÉTHODES
        // =========================

        /**
         * Calcule les dégâts que l'ennemi inflige au héros.
         * Les dégâts sont modifiés selon le type du héros :
         *  - si le héros est de type ATTACK_TYPE, dégâts doublés
         *  - si le héros est de type DEFENCE_TYPE, dégâts divisés par 2
         *
         * @param hero le héros ciblé par l'attaque
         * @return dégâts calculés
         */
        public int enemyDamageCalculator(Hero hero) {
            int damage = attackPoints;
            if (hero.name.charAt(0) == Hero.ATTACK_TYPE) {
                damage *= 2;
            } else if (hero.name.charAt(0) == Hero.DEFENCE_TYPE) {
                damage = (int)(damage * 0.5);
            }
            return damage;
        }

        // =========================
        // GETTERS ET SETTERS
        // =========================

        /**
         * Retourne les points de vie actuels de l'ennemi.
         *
         * @return points de vie actuels
         */
        public int getHealth() {
            return health;
        }

        /**
         * Modifie les points de vie actuels de l'ennemi.
         *
         * @param health nouveaux points de vie
         */
        public void setHealth(int health) {
            this.health = health;
        }

        /**
         * Retourne l'expérience que l'ennemi donne au héros lorsqu'il est vaincu.
         *
         * @return expérience donnée
         */
        public int getExperienceGiven() {
            return experienceGiven;
        }
    }

