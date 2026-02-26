class Fighter {
    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter{
    
    @Override
    boolean isVulnerable(){
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter){
        if(fighter.isVulnerable())
            return 10;
        return 6;
    }

    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }
}

// TODO: define the Wizard class
class Wizard extends Fighter{
    boolean spellPrepared = false;
    
    @Override
    boolean isVulnerable(){
        if(spellPrepared)
            return false;
        return true;
    }

     public void prepareSpell(){
         spellPrepared = true;
     }
    
    @Override
    int getDamagePoints(Fighter fighter){
        if(spellPrepared)
            return 12;
        return 3;
    }

    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }
}