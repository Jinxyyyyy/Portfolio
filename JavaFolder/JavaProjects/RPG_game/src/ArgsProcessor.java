/**
 * Classe pour traiter les arguments passés en ligne de commande en assumant que le string
 * est bien écrit et simuler les actions d'un héros dans le jeu en utilisant ces arguments.
 */

public class ArgsProcessor {
    /**
     * Traite un tableau d'arguments pour exécuter une série d'actions sur un héros.
     * Le premier argument est une chaîne qui contient le nom du héros, sa santé maximale,
     * ses dégâts d'attaque, et éventuellement une liste d'actions séparées par des virgules.
     *
     * @param args tableau de chaînes d'arguments
     */
    public static void process(String[] args) {
        // On découpe la première chaîne en plusieurs parties : nom, stats, actions
        String[] phrase = makePhrase(args[0]);
        String name = phrase[0].trim();
        int maxHealth = Integer.parseInt(phrase[1].trim());
        int attackDamage = Integer.parseInt(phrase[2].trim());
        // Création du héros avec les stats extraites du string entré par le joueur
        Hero hero = new Hero(name, maxHealth, attackDamage);

        // Boucle sur les actions restantes
        for (int i = 3; i < phrase.length; i++) {
                String action = phrase[i].trim();
                boolean alive = doAction(action, hero);

                if (!alive) {
                // héros mort on quitte process immédiatement
                    return;
            }

        }

        // Si le héros survit après toutes les actions on print le string de victoire
        System.out.printf(
                "In his quest, %s beat %d enemies, attained level %d and survived with %d HP!%n",
                hero.name,
                Gameplay.getEnemyKilled(),
                hero.getLevel(),
                hero.getHealth()
        );
    }

    /**
     * Transforme une chaîne contenant plusieurs éléments séparés par des virgules
     * en tableau de chaînes.
     *
     * @param args chaîne à découper
     * @return tableau de chaînes
     */
    private static String[] makePhrase(String args) {
        return args.trim().split(",");
    }

    /**
     * Exécute une action donnée sur le héros.
     * Les actions possibles sont :
     *  - "fought X" : le héros combat X ennemis
     *  - "rested" : le héros récupère toute sa santé
     *  - "healed X" : le héros récupère X points de vie (jusqu'à sa santé max)
     *  - "trained for X" : le héros augmente son attaque de X points
     *
     * @param action la chaîne décrivant l'action
     * @param hero le héros sur lequel l'action est effectuée
     * @return true si le héros survit à l'action, false s'il meurt
     */
    private static boolean doAction(String action, Hero hero) {
        // ici, on transforme le String action en un tableau de String, en séparant les mots par des espaces
        String[] phrase = action.trim().split(" ");
        // le type d'action est déterminé par le premier mot de la phrase
        switch (phrase[0]) {
            case "fought":
                int enemyCount = Integer.parseInt(phrase[1]);
                for (int index = 0; index < enemyCount; index++) {
                    Enemy enemy = new Enemy(100, 100 + (index * 10), 25 + (index * 5), 35 + (index * 8));
                    Gameplay.combat(hero, enemy);
                    if (hero.getHealth() <= 0) {
                        System.out.printf(
                                "In his quest, %s died after beating %d enemies and attaining level %d!%n",
                                hero.name,
                                Gameplay.getEnemyKilled(),
                                hero.getLevel()
                        );
                        return false;
                    }
                }
                break;
            case "rested":
                // Restaure la santé maximale
                hero.setHealth(hero.getMaxHealth());
                break;
            case "healed":
                // Soigne le héros d'une quantité donnée, sans dépasser la santé max
                int healing = Integer.parseInt(phrase[1]);
                hero.setHealth(Math.min(hero.getHealth() + healing, hero.getMaxHealth()));
                break;
            case "trained":
                // Augmente les dégâts du héros selon les points d'entraînement
                int trainingPoints = Integer.parseInt(phrase[3]);
                hero.setAttackDamage(hero.getAttackDamage() + trainingPoints);
                break;
        }
        return true;
    }
}


