
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chiffrementdechiffrement;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
/**
 *
 * @author mm551971
 */
public class ChiffrementDechiffrement {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tab = new int[5];
      int[] cle = new int[5];
      int[] tabDechiffre = new int[5];
      int[] tabChiffre = new int[5];
        // TODO code application logic here
        JFrame f = new JFrame();
        f.setBounds(100, 100, 700, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(true);
        Container a = f.getContentPane();
        JLabel l = new JLabel();
        JLabel l1 = new JLabel("message clr");
        l1.setBounds(100, 0, 400, 50);
        a.add(l1);
        l.setBounds(0, 0, 700, 500);
        JTextField t1 = new JTextField();
        t1.setBounds(100, 50, 400, 100);
        a.add(t1);
        JLabel l3 = new JLabel("cle");
        l3.setBounds(100, 150, 200, 50);
        a.add(l3);
        l.setBounds(0, 0, 700, 500);
        JTextField t3 = new JTextField();
        t3.setBounds(100, 200, 400, 100);
        a.add(t3);
        JLabel l2 = new JLabel("message code");
        l2.setBounds(100, 300, 200, 50);
        a.add(l2);
        l.setBounds(0, 0, 700, 500);
        JTextField t2 = new JTextField();
        t2.setBounds(100, 350, 400, 100);
        a.add(t2);
        
        JButton b1 = new JButton("Chiffrer");
        b1.setBounds(550, 100, 100, 50);
        a.add(b1);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent args){
                
                
                
      
      
      for (int i = 1; i < t1.getText().length(); i++){
          tab[i] = 
                   (int)(Math.random()*2);
                 
                 
      }
      for (int i = 1; i < t3.getText().length(); i++){
          cle[i] = 
(int)(Math.random()*2);
                  
                  
      }
     
        for (int i = 1; i < tabDechiffre.length; i++){
         if(tab[i]==1 && cle[i]==1 || tab[i]==0 && cle[i]==0 )
          tabDechiffre[i]= 0;
         else
         tabDechiffre[i] = 1;
       //System.out.println("Chiffré="+array3[i]);
     String newLigne= System.getProperty("line.separator");
       t1.setText(t1.getText() + tab[i] + newLigne);
       t3.setText(t3.getText() + cle[i]);
       t2.setText(t2.getText() + tabDechiffre[i]);
        }
        
               
                
            }
        });
        JButton b2 = new JButton("Dechiffrer");
        b2.setBounds(550, 350, 100, 50);
        a.add(b2);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent args){
                
                //int x = Integer.parseInt(t3.getText());
                //int y = Integer.parseInt(t4.getText());
                
      
     
        for (int i = 1; i < tabChiffre.length; i++){
         if(tabDechiffre[i]==1 && cle[i]==1 || tabDechiffre[i]==0 && cle[i]==0 )
          tabChiffre[i]= 0;
         else
         tabChiffre[i] = 1;
       //System.out.println("Chiffré="+array3[i]);
      
       t2.setText(t1.getText() + tabDechiffre[i]);
       t3.setText(t3.getText() + cle[i]);
       t1.setText(t2.getText() + tabChiffre[i]);
        }
        
               
                
            }
        });
                
      
        JButton b3 = new JButton("supprimer");
        b3.setBounds(550, 200, 100, 50);
        a.add(b3);
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent args){
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        });
        a.add(l);
        f.setVisible(true);
    }
    
}
