import java.util.*;
class Player{
	private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;
    Player(int playerId, String playerName, int runs, String playerType, String matchType){
    	this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }
    public void setPlayerId(int playerId){
    	this.playerId = playerId;
    }
    public void setPlayerName(String playerName){
    	this.playerName = playerName;
    }
    public void setRuns(int runs){
    	this.runs = runs;
    }
    public void setPlayerType(String playerType){
    	this.playerType = playerType;
    }
    public void setMathType(String matchType){
    	this.matchType = matchType;
    }
    
    public int getPlayerId(){
    	return playerId;
    }
    public String getPlayerName(){
    	return playerName;
    }
    public int getRuns(){
    	return runs;
    }
    public String getPlayerType(){
    	return playerType;
    }
    public String getMatchType(){
    	return matchType;
    }
}

public class MyClass{
	public static int findPlayerWithLowestRuns(Player p[], String pType){
    	int leastRuns = Integer.MAX_VALUE;
        for(Player p1:p){
        	if(p1.getPlayerType().equalsIgnoreCase(pType)){
            	if(leastRuns > p1.getRuns()){
                	leastRuns = p1.getRuns();
                }
            }
        }
        if(leastRuns == Integer.MAX_VALUE)
    		return 0;
        return leastRuns;
    }
    public static Player[] findPlayerByMatchType(Player p[],String mType){
        ArrayList<Player> al = new ArrayList<>();
        for(Player p1: p){
        	if(p1.getMatchType().equalsIgnoreCase(mType)){
                al.add(p1);
            }
        }
        if(al.isEmpty()){
        	return null;
        }
    	Player[] rsa =  al.toArray(new Player[0]);
        Arrays.sort(rsa,(a,b)->b.getPlayerId() - a.getPlayerId());
        return rsa;
    }
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
        Player p[] = new Player[4];
       	HashSet<String> hs = new HashSet<>();
      	
      for(int i=0;i<4;i++){
        	int playerId = sc.nextInt();sc.nextLine();
            String playerName = sc.nextLine();
            int runs = sc.nextInt();sc.nextLine();
            String playerType = sc.nextLine();
            String matchType = sc.nextLine();
        	String uni = playerId+"-"+runs;
          	if(hs.contains(uni)){
               	i -= 1;
               continue;
               }
            hs.add(uni);
            p[i] = new Player(playerId,playerName,runs,playerType,matchType);
        }
        String pType = sc.nextLine();
        String mType = sc.nextLine();
        
        int pwlr = findPlayerWithLowestRuns(p,pType);
        if(pwlr != 0){
        	System.out.println(pwlr);
        }else{
        	System.out.println("No such player");
        }
        
        Player result[] = findPlayerByMatchType(p,mType);
        if(result != null){
        	for(Player p1: result){
        		System.out.println(p1.getPlayerId());
        	}
        }else{
        	System.out.println("No Player with given matchType");
        }
    }
}
