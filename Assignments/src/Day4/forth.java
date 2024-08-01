public class GameMaster {
    public String describe(Character character){
        return "You're a level "+character.getLevel() +" " +character.getCharacterClass()+" with "+ character.getHitPoints()+" hit points.";
    }
    public String describe(Destination destination){
        return "You've arrived at "+destination.getName()+", which has "+destination.getInhabitants()+" inhabitants.";
    }
    public String describe(TravelMethod travel){
        return "You're traveling to your destination " + find(travel)+".";
    }
    public String find(TravelMethod travel){
            switch(travel){
            case WALKING :
                    return "by walking";
            case HORSEBACK :
                    return "on horseback";
            }
        return "";
    }
    public String describe(Character character, Destination destination ,TravelMethod travel){
        return "You're a level " + character.getLevel()+" "+ character.getCharacterClass()+" with "+ character.getHitPoints()+" hit points. You're traveling to your destination "+find(travel)+". You've arrived at "+destination.getName()+", which has "+destination.getInhabitants()+" inhabitants.";
    }
    public String describe(Character character, Destination destination ){
        return "You're a level " + character.getLevel()+" "+ character.getCharacterClass()+" with "+ character.getHitPoints()+" hit points. You're traveling to your destination by walking. You've arrived at "+destination.getName()+", which has "+destination.getInhabitants()+" inhabitants.";
    }