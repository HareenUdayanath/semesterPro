package interfaces;

import javax.swing.JButton;


public class ProcessRep extends JButton{
    public ProcessRep(String name,int x,int y,int width,int hight){
        this.setBounds(TOP+x, TOP+y, width, hight);
        this.setEnabled(false);
        this.setText(name);
        this.setVisible(true);
    }
}
