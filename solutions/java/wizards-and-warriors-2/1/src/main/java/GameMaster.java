public class GameMaster {

    public String describe(Character character){
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points.";
    }

    public String describe(Destination destination){
        return "You've arrived at " + destination.getName() + ", which has " +     destination.getInhabitants() + " inhabitants.";
    }
    
    public String describe(TravelMethod methodEnum){
        String method = methodEnum.equals(methodEnum.HORSEBACK) ? "on horseback" : "by walking"; 
        return "You're traveling to your destination " + method + ".";
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod){
        GameMaster master = new GameMaster();
        return master.describe(character) + " " + master.describe(travelMethod) + " " + master.describe(destination);
    }

    public String describe(Character character, Destination destination){
        GameMaster master = new GameMaster();
        return master.describe(character) + " " + master.describe(TravelMethod.WALKING) + " " + master.describe(destination);
    }
    
}
