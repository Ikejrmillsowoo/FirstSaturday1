/**
 * Write a description of class src.main.java.WriteIFs here.
 *
 * @author (Isaac)
 * @version (3/4/25)
 */
public class WriteIFs
{
    WriteIFs wi = new WriteIFs();
    public void playerDied(boolean player1) {
        // Write an IF statement that checks “player1.isAlive()”
        // and if that’s false, calls “displayGameOver(player1)”
        if (!isAlive(player1)){
            displayGameOver(player1);
        }

    }

    public String thermoSTAT(int room) {
        // Write an IF statement that checks the
        // “temperature(room)” and if that check is less than 70,
        // calls “heatOn()” else calls “coolOn()”
        if (room < 70){
            heatOn();
        } else {
            coolOn();
        }


        return this.ss;
        @@ -30,13 +37,18 @@ public void fireplaceControl(Object fireplace1) {
            // AND
            // “insideTemp()” is less than 62,
            // calls “startAFire(fireplace1)”
            if (outsideTemp() < 50 && insideTemp() <62) {
                startAFire(fireplace1);
            }

        }

        public void checkFuel(double fuelLevel) {
            // Write an IF statement that checks “fuelLevel”
            // and if that check is less than 0.08, calls “refuel()”
            if (fuelLevel < 0.08) {
                refuel();
            }
        }

