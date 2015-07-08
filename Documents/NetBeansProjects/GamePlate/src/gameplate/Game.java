package gameplate;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;


public class Game extends javax.swing.JFrame {

   
    
    private Controller myController;   
    private int simbleList[][];    
    private ArrayList<Integer> rest;
    private int difficulty;
    private int count;
    private static int p1Wins;
    private static int p2Wins;
    private static int totGames;
    private boolean isComFirst;
    private boolean isSingle;
    private Plate plate;
    public Plate background;
  
    

     /**
     * @return the totGames
     */
    public static int getTotGames() {
        return totGames;
    }
    
    /**
     * @return the p1Wins
     */
    public static int getP1Wins() {
        return p1Wins;
    }

    /**
     * @param aP1Wins the p1Wins to set
     */
    public static void setP1Wins(int aP1Wins) {
        p1Wins = aP1Wins;
    }

    /**
     * @return the p2Wins
     */
    public static int getP2Wins() {
        return p2Wins;
    }

    /**
     * @param aP2Wins the p2Wins to set
     */
    public static void setP2Wins(int aP2Wins) {
        p2Wins = aP2Wins;
    }   
  

    /**
     * Creates new form Frame
     */
    public Game() {
        initComponents();
        setBackground(Color.WHITE);
        init();
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setBounds(400, 100,this.getWidth(), this.getHeight());
        System.out.println(this.getWidth()+" "+this.getHeight());
        this.setResizable(false);
    }
    void init(){   
        
        //...........................
       /* background = new Plate();
        background.setBounds(0,0, this.getWidth(),this.getHeight());
        System.out.println("1");
        this.add(background);
        background.drawImage("back");*/
        
        //...........................
        this.count = 2; 
        totGames++;
        System.out.println(totGames);
        simbleList = new int[3][3];
        this.setIsComFirst(false);    
        this.pLable1.setText(TicTacGame.getPlayer1()+" - "+String.valueOf(Game.getP1Wins())+" Wins");
        this.pLable2.setText(TicTacGame.getPlayer2()+" - "+String.valueOf(Game.getP2Wins())+" Wins");
      
        if(TicTacGame.isIsSingle()){
            this.sLable.setText("Single Player Game");
        }else{
            this.sLable.setText("Two Player Game");
        }
        
        this.cB1.setBackground(Color.BLUE);
        this.cB2.setBackground(Color.RED);     
        
        rest = new ArrayList<>();
        for(int i=1;i<10;i++){
            rest.add(i);
        }           
        
    }
    
    private final MouseAdapter mouseAdapter = new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {        
            if(getBut(e.getX(),e.getY())==1)
                buttonClicked(1);
            else if(getBut(e.getX(),e.getY())==2)
                buttonClicked(2);
            else if(getBut(e.getX(),e.getY())==3)
                buttonClicked(3);
            else if(getBut(e.getX(),e.getY())==4)
                buttonClicked(4);
            else if(getBut(e.getX(),e.getY())==5)
                buttonClicked(5);
            else if(getBut(e.getX(),e.getY())==6)
                buttonClicked(6);
            else if(getBut(e.getX(),e.getY())==7)
                buttonClicked(7);
            else if(getBut(e.getX(),e.getY())==8)
                buttonClicked(8);
            else if(getBut(e.getX(),e.getY())==9)
                buttonClicked(9);
            
        }
    
    };
    
    public void setButtornColour(int button,int colour) {
        if(button==1)
            simbleList[0][0] = colour;
        else if(button==2)
            simbleList[0][1] = colour;
        else if(button==3)
            simbleList[0][2] = colour;
        else if(button==4)
            simbleList[1][0] = colour;
        else if(button==5)
            simbleList[1][1] = colour;
        else if(button==6)
            simbleList[1][2] = colour;
        else if(button==7)
            simbleList[2][0] = colour;
        else if(button==8)
            simbleList[2][1] = colour;
        else
            simbleList[2][2] = colour;        
    }
     
    private int getBut(int x,int y){
        if(x<120&&x>32&&y<111&&y>24)
            return 1;
        if(x<219&&x>132&&y<111&&y>24)
            return 2;
        if(x<320&&x>232&&y<111&&y>24)
            return 3;
        if(x<120&&x>32&&y<210&&y>126)
            return 4;
        if(x<219&&x>132&&y<210&&y>126)
            return 5;
        if(x<320&&x>232&&y<210&&y>126)
            return 6;
        if(x<120&&x>32&&y<311&&y>227)
            return 7;
        if(x<219&&x>132&&y<311&&y>227)
            return 8;
        if(x<320&&x>232&&y<311&&y>227)
            return 9;
        return 0;
    }
    public void doButton(int num,boolean isX){        
       plate.drawSimble(num, isX);
       if(isX){
           setButtornColour(num,1);
       }else{
           setButtornColour(num,2);
       }
    }
    void buttonClicked(int but){        
        if(rest.remove(Integer.valueOf(but))){
            if(!isSingle){            
                if(!isComFirst){
                    if(count%2==0){
                        doButton(but,true);                  
                        this.tLable.setText(TicTacGame.getPlayer2()+"'s turn");
                    }else{
                        doButton(but,false);                    
                        this.tLable.setText(TicTacGame.getPlayer1()+"'s turn");
                    }
                }else{
                    if(count%2!=0){
                        doButton(but,true);                   
                        this.tLable.setText(TicTacGame.getPlayer2()+"'s turn");
                    }else{
                        doButton(but,false);                  
                        this.tLable.setText(TicTacGame.getPlayer1()+"'s turn");
                    }
                }
            }else{
                if((!isComFirst&&count%2==0)||(isComFirst&&count%2!=0)){
                    doButton(but,true);              
                    this.tLable.setText(TicTacGame.getPlayer2()+"'s turn");
                }else{
                    doButton(but,false);              
                    this.tLable.setText(TicTacGame.getPlayer1()+"'s turn");
                }
            }      
            count++;     

            if((myController.checher(simbleList)==-1)&&isSingle&&!isComFirst){
                if(count<11){

                    int num;
                    if(difficulty == 3)
                        num = myController.impossible1(simbleList,rest,but,count);  
                    else if(difficulty == 2)
                        num = myController.hard1(simbleList,rest,but,count);
                    else
                        num = myController.easy(rest);

                    if(num>-1){ 
                        plate.setEnabled(false);
                        try {
                            Thread.sleep(1000);
                            plate.setEnabled(true);
                        } catch (InterruptedException ex) {
                            plate.setEnabled(true);
                        }
                        doButton(num,false);                 
                        this.tLable.setText(TicTacGame.getPlayer1()+"'s turn");
                        rest.remove(Integer.valueOf(num));                    
                        count++;
                    }
                }
            }else if((myController.checher(simbleList)==-1)&&isSingle&&isComFirst){
                if(count<11){

                    int num;
                    if(difficulty == 3)
                        num = myController.impossible2(simbleList,rest,but,count);  
                    else if(difficulty == 2)
                        num = myController.hard2(simbleList,rest,but,count);
                    else
                        num = myController.easy(rest);

                    if(num>-1){ 
                        plate.setEnabled(false);
                        try {
                            Thread.sleep(1000);
                            plate.setEnabled(true);
                        } catch (InterruptedException ex) {
                            plate.setEnabled(true);
                        }
                        doButton(num,false);                   
                        this.tLable.setText(TicTacGame.getPlayer1()+"'s turn");
                        rest.remove(Integer.valueOf(num));                    
                        count++;
                    }
                }
            }
            if(myController.checher(simbleList)>-1){ 
                if(myController.checher(simbleList)==1){
                    JOptionPane.showMessageDialog(null,TicTacGame.getPlayer1()+" is Win..");
                    Game.setP1Wins(Game.getP1Wins()+1);
                }else{
                    JOptionPane.showMessageDialog(null,TicTacGame.getPlayer2()+" is Win..");
                    Game.setP2Wins(Game.getP2Wins()+1);
                }            
                int option = JOptionPane.showConfirmDialog(null, "Do you want a new Game..?", "New Game", JOptionPane.YES_NO_OPTION);
                if(option==JOptionPane.OK_OPTION){
                    if(TicTacGame.isIsOtherFirst()){
                        new Thread(){
                            public void run(){
                                TicTacGame.newGame(false);
                            }
                        }.start();                                    
                    }else{
                        new Thread(){
                            public void run(){
                                TicTacGame.newGame(true);
                            }
                        }.start(); 
                    }
                }
                this.dispose();
            }else if(count==11){            
                JOptionPane.showMessageDialog(null,TicTacGame.getPlayer1()+" and "+TicTacGame.getPlayer2()+" are even....");

                int option = JOptionPane.showConfirmDialog(null, "Do you want a new Game..?", "New Game", JOptionPane.YES_NO_OPTION);
                if(option==JOptionPane.OK_OPTION){
                    if(TicTacGame.isIsOtherFirst()){
                        new Thread(){
                            public void run(){
                                TicTacGame.newGame(false);
                            }
                        }.start();                                    
                    }else{
                        new Thread(){
                            public void run(){
                                TicTacGame.newGame(true);
                            }
                        }.start(); 
                    }
                }
                this.dispose(); 
            }
        }
    } 
    
    public void comStart(){
        if(difficulty==3){             
            doButton(5,false);          
            rest.remove(Integer.valueOf(5));  
            count++;
        }else if(difficulty==2){ 
            Random randomCreater = new Random();
            int arr[] = {1,3,9,7,5};         
            int but = arr[randomCreater.nextInt(5)];
            doButton(but,false);          
            rest.remove(Integer.valueOf(but));  
            count++;
        }else{           
            int num = myController.easy(rest);
            doButton(num,false);          
            rest.remove(Integer.valueOf(num));  
            count++;
        }            
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sLable = new javax.swing.JLabel();
        tLable = new javax.swing.JLabel();
        pLable2 = new javax.swing.JLabel();
        pLable1 = new javax.swing.JLabel();
        cB1 = new javax.swing.JButton();
        cB2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        sLable.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        sLable.setText("jLabel1");

        tLable.setText("jLabel1");

        pLable2.setText("jLabel1");

        pLable1.setText("jLabel1");

        cB1.setEnabled(false);

        cB2.setEnabled(false);

        jMenu1.setText("File");

        jMenuItem1.setText("New Game");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sLable)
                            .addComponent(tLable)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cB1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cB2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pLable1)
                            .addComponent(pLable2))))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sLable)
                .addGap(18, 18, 18)
                .addComponent(tLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cB1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pLable1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pLable2)
                    .addComponent(cB2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cB1;
    private javax.swing.JButton cB2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel pLable1;
    private javax.swing.JLabel pLable2;
    private javax.swing.JLabel sLable;
    private javax.swing.JLabel tLable;
    // End of variables declaration//GEN-END:variables
    
        /**
     * @param isComFirst the isComFirst to set
     */
    public void setIsComFirst(boolean isComFirst) {
        this.isComFirst = isComFirst;
    }

    /**
     * @param isSingle the isSingle to set
     */
    public void setIsSingle(boolean isSingle) {
        this.isSingle = isSingle;
    }

    /**
     * @param myController the myController to set
     */
    public void setMyController(Controller myController) {
        this.myController = myController;
    }

    /**
     * @param difficulty the difficulty to set
     */
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * @return the mouseAdapter
     */
    public MouseAdapter getMouseAdapter() {
        return mouseAdapter;
    }

    /**
     * @param plate the plate to set
     */
    public void setPlate(Plate plate) {
        this.plate = plate;
    }
}
