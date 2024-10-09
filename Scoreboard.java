public class Scoreboard
{
    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
        private String activeTeam;
            
    private int teamTwoScore;
    public Scoreboard(String one, String two)
    {
        teamOne = one;
            teamTwo = two;
    }






        public String getScore()
        {
            return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
        }

        
    public void recordPlay( int score) 
    {
        
        if(score == 0)
        {
            if(activeTeam.equals(teamOne)) 
                activeTeam = teamTwo;
                    else if(activeTeam.equals(teamTwo)) 
                        activeTeam = teamOne;
        }
        else {
                            if(teamOne.equals(activeTeam)) 
                                teamOneScore += score;
                                    if(teamTwo.equals(activeTeam)) 
                                        teamTwoScore += score;

        }
            
        
    

        


    }
    
    
   

}
