package azampoker;
/**
 *
 * Johnny Hoang
 */
public class Card {
    private int suit;
    private int rank;
    
    public Card(int cSuit, int cRank){
        suit = cSuit;
        rank = cRank;
        
    }
    public String getSuit(){
        switch(suit){
            case 1: return "spade";
            case 2: return "club";
            case 3: return "diamond";
            case 4: return "heart";
        }
        return "";
    }
    public String getRank(){
            if(rank <= 10 && rank > 1)
                return (""+rank);
            else{
                switch(rank){
                    case 1: return "ace";
                    case 11: return "jack";
                    case 12: return "queen";
                    case 13: return "king";
                }
        }
        return "";
    }
}//end class Card