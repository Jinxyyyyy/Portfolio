/**
 * Classe qui gère la logique de combat dans le jeu.
 * Elle suit le nombre d'ennemis tués et exécute les combats entre le héros et les ennemis.
 */
public class Gameplay {
    private static int enemyKilled;

    /**
     * Retourne le nombre d'ennemis tués par le héros.
     *
     * @return le nombre d'ennemis tués
     */
    public static int getEnemyKilled() {
        return enemyKilled;
    }

    /**
     * Effectue un combat entre le héros et un ennemi.
     * Le combat continue tant que le héros et l'ennemi sont en vie.
     * Après chaque attaque :
     *  - L'ennemi perd des points de vie selon les dégâts du héros
     *  - Si l'ennemi meurt, le héros gagne de l'expérience et le compteur d'ennemis tués augmente
     *  - Sinon, le héros reçoit les dégâts de l'ennemi
     *
     * @param hero le héros participant au combat
     * @param enemy l'ennemi participant au combat
     */
    public static void combat(Hero hero, Enemy enemy) {
        while(hero.getHealth() > 0 && enemy.getHealth() > 0) {
            // Calcul des dégâts du héros et de l'ennemi
            int heroDamage = hero.heroDamageCalculator();
            int enemyDamage = enemy.enemyDamageCalculator(hero);

            // L'ennemi reçoit les dégâts du héros
            enemy.setHealth(enemy.getHealth() - heroDamage);
            System.out.println("Hero HP: " + hero.getHealth());

            // Vérifie si l'ennemi est mort
            if (enemy.getHealth() <= 0) {
                // Incrémente le compteur d'ennemis tués
                enemyKilled++;
                // Le héros gagne de l'expérience
                hero.setExperience(hero.getExperience() + enemy.getExperienceGiven());
                // Vérifie si le héros monte de niveau après ce gain d'expérience
                hero.experienceChecker();
                break;
            }
            else {
                // Vérifie si le héros meurt après l'attaque
                hero.setHealth(hero.getHealth() - enemyDamage);
                if (hero.getHealth() <= 0) {
                    break;
                }
            }
        }
    }
}
