public class JedliksToyCar {
    private int distanceDriven;
    private int remainingBattery;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

     public JedliksToyCar(){
        distanceDriven = 0;
        remainingBattery = 100;
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", distanceDriven);
    }

    public String batteryDisplay() {
        if(remainingBattery > 0){
            return String.format("Battery at %d%%", remainingBattery);
        } else {
            return "Battery empty";
        }
    }

    public void drive() {
        if( remainingBattery > 0 ){
            distanceDriven += 20;
            remainingBattery -= 1;
        }
    }
}
