class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    public int drivenDistance;
    public int remainingBattery;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        drivenDistance = 0;
        remainingBattery = 100;
    }

    public boolean batteryDrained() {
        return remainingBattery == 0 || (remainingBattery - batteryDrain) < 0; 
    }

    public int distanceDriven() {
        return drivenDistance;
    }

    public void drive() {
        if((remainingBattery - batteryDrain) >= 0){
            drivenDistance += speed;
            remainingBattery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int possibleDistance = (car.remainingBattery / car.batteryDrain) * car.speed;
        return possibleDistance >= distance;
    }
}
