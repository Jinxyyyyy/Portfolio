public class ArgsProcessor {
    public static void process(String[] args) {
        String[] phrase = makePhrase(args[0]);
        String name = phrase[0].trim();
        int maxHealth = Integer.parseInt(phrase[1].trim());
        int attackDamage = Integer.parseInt(phrase[2].trim());

        Hero hero = new Hero(name, maxHealth, attackDamage);
        for (int i = 3; i < phrase.length; i++) {
                String action = phrase[i].trim();
                boolean alive = doAction(action, hero);

                if (!alive) {
                // héros mort → on quitte process immédiatement
                    return;
            }

        }

        // 5️⃣ Si le héros survit après toutes les actions
        System.out.printf(
                "In his quest, %s beat %d enemies, attained level %d and survived with %d HP!%n",
                hero.name,
                Gameplay.getEnemyKilled(),
                hero.getLevel(),
                hero.getHealth()
        );
    }


    private static String[] makePhrase(String args) {
        return args.trim().split(",");
    }

    // méthode qui prend la partie de la phrase qui décrit l'action et le héros, puis effectue l'action correspondante
    // retourne true si le joueur survit à l'action, false sinon
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
                hero.setHealth(hero.getMaxHealth());
                break;
            case "healed":
                int healing = Integer.parseInt(phrase[1]);
                hero.setHealth(Math.min(hero.getHealth() + healing, hero.getMaxHealth()));
                break;
            case "trained":
                int trainingPoints = Integer.parseInt(phrase[3]);
                hero.setAttackDamage(hero.getAttackDamage() + trainingPoints);
                break;
        }
        return true;
    }
}


