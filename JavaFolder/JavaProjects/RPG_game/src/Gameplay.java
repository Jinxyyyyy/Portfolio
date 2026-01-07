public class Gameplay {
    private static int enemyKilled;

    public static int getEnemyKilled() {
        return enemyKilled;
    }

    public static void combat(Hero hero, Enemy enemy) {
        while(hero.getHealth() > 0 && enemy.getHealth() > 0) {
            int heroDamage = hero.heroDamageCalculator();
            int enemyDamage = enemy.enemyDamageCalculator(hero);

            enemy.setHealth(enemy.getHealth() - heroDamage);
            System.out.println("Hero HP: " + hero.getHealth());
            if (enemy.getHealth() <= 0) {
                enemyKilled++;
                hero.setExperience(hero.getExperience() + enemy.getExperienceGiven());
                hero.experienceChecker();
                break;
            }
            else {
                hero.setHealth(hero.getHealth() - enemyDamage);
                if (hero.getHealth() <= 0) {
                    break;
                }
            }
        }
    }
}
