package gameplate;

import PlayerRecords.DataBase;
import PlayerRecords.PlayerRecord;
import javax.swing.JFrame;


public class TicTacGame {
    
    private static boolean isOtherFirst;
    private static boolean isSingle;
    private static Controller controller;
    private static int difficulty;
    private static String player1;
    private static String player2;
    private static Game game;
    private static NetworkedGame networkedGame;
    public static DataBase db;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       db = new DataBase();
       start();
       //new PlayerRecord().setVisible(true);
       
       
    }
    public static void start(){
        controller = new Controller(); 
        isOtherFirst = false;
        Game.setP1Wins(0);
        Game.setP2Wins(0);
        Game.setTotal(0);
        NetworkedGame.setP1Wins(0);
        NetworkedGame.setP2Wins(0);
        NetworkedGame.setTotal(0);
        new PlayerSelect().setVisible(true); 
    
    }
    static void newGame(boolean isCF){
        game = new Game();                
        Plate p = new Plate();
        p.setBounds(0,0, game.getWidth(),game.getHeight()); 
        p.addMouseListener(game.getMouseAdapter());
        System.out.println("2");
        game.add(p);   
        game.setPlate(p);
        
        setIsOtherFirst(isCF);        
        game.setIsComFirst(isIsOtherFirst());
        game.setIsSingle(isIsSingle());
        game.setMyController(controller);
        game.setDifficulty(difficulty);
        controller.setPlayerFirstBut(-1);      
        
        
        game.setVisible(true);
        p.drawImage("BB.jpg");
        p.drawBoard();   
        
        new Thread(){
            public void run(){
                if(isIsOtherFirst()&&isIsSingle()){             
                    game.comStart();
                }
            }
        }.start(); 
    }
    static void newNetGame(boolean isCF){
        networkedGame = new NetworkedGame();         
         //networkedGame.setVisible(true);
        Plate p = new Plate();
        p.setBounds(0,0, networkedGame.getWidth(),networkedGame.getHeight()); 
        p.addMouseListener(networkedGame.getMouseAdapter());
        networkedGame.add(p);
        networkedGame.setPlate(p);
        
        setIsOtherFirst(isCF);        
        networkedGame.setIsOtherFirst(isIsOtherFirst());
        setIsSingle(true);
        networkedGame.setIsSingle(true);       
        networkedGame.setMyController(controller);       
        controller.setPlayerFirstBut(-1);
        
        networkedGame.setVisible(true);
        
        p.drawImage("B.jpg");        
        p.drawBoard(); 
        if(isIsOtherFirst()&&isIsSingle()){              
            new Thread(){
                public void run(){
                    networkedGame.comStart();
                }
            }.start();
        }
    }
    
    
    /**
     * @param aIsSingle the isSingle to set
     */
    public static void setIsSingle(boolean aIsSingle) {
        isSingle = aIsSingle;
    }

    /**
     * @param aDifficulty the difficulty to set
     */
    public static void setDifficulty(int aDifficulty) {
        difficulty = aDifficulty;
    }

    /**
     * @return the player1
     */
    public static String getPlayer1() {
        return player1;
    }

    /**
     * @param aPlayer1 the player1 to set
     */
    public static void setPlayer1(String aPlayer1) {        
        player1 = aPlayer1;
    }

    /**
     * @return the player2
     */
    public static String getPlayer2() {
        return player2;
    }

    /**
     * @param aPlayer2 the player2 to set
     */
    public static void setPlayer2(String aPlayer2) {
        player2 = aPlayer2;
    }

    /**
     * @return the isComFirst
     */
    public static boolean isIsOtherFirst() {
        return isOtherFirst;
    }

    /**
     * @param aIsComFirst the isComFirst to set
     */
    public static void setIsOtherFirst(boolean aIsComFirst) {
        isOtherFirst = aIsComFirst;        
    }

    /**
     * @return the isSingle
     */
    public static boolean isIsSingle() {
        return isSingle;
    }
}
