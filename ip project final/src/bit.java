/** import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.Color;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class bit extends JFrame implements KeyListener{

    JPanel p=new JPanel();
    JTextArea dialog=new JTextArea(20,50);
    JTextArea input=new JTextArea(1,50);
    JScrollPane scroll=new JScrollPane(
    dialog,
    JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
    JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
    );
    
    String [ ] [ ] bit= {
      //standard greetings 
        {"hi","hello","ola","namaste"},
        {"hi","hello","hey"},
       //question greetings
        {"how are you","how r you","'how are u","how r u"},
        {"good","doin well"},
        //default
        {"shut up","you are bad","noob","stop talking"},
        {"bit is unavailable"},
     };
    
   public static void main(String[] args) {
     new bit() ;   
        } 
    
   public bit()  {
       super("bit");
       setSize(600,400);
       setResizable(false);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       dialog.setEditable(false);
       input.addKeyListener(this);
       
       p.add(scroll);
       p.add(input);
       p.setBackground(new Color(255 , 200, 0));
       add(p);
       
       setVisible(true);
   } 
     
   public void keyPressed(KeyEvent e){
   if (e.getKeyCode() == KeyEvent.VK_ENTER){
       input.setEditable(false);
    //------grab quote-------
    String quote=input.getText();
    input.setText("");
    addText("---> you :\t"+ quote);
   quote= quote.trim();
    while(
            quote.chatAt(quote.length( ) - 1) =='!' | |
            quote.chatAt(quote.length( ) - 1) =='.' | |
            quote.chatAt(quote.length( ) - 1) =='?' | |
             ){
        quote=quote.substring(0,quote.length()-1)
    }
   quote= quote.trim();
   byte response=0;
   
    //------check for matches-----
    int 
    //--------default-------
   }
 }
   
   public void keyReleased(KeyEvent e){
    if (e.getKeyCode() == KeyEvent.VK_ENTER){
       input.setEditable(true);
        }
    }
   
   public void keytyped(KeyEvent e) { }
   
   public void addText(String str){
       dialog.setText(dialog.getText()+str);
   }
} 
   
   
    /**
 *
 * @author Mahesh
 */
public class bit extends javax.swing.JFrame {

    /**
     * Creates new form bit
     */
    public bit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(bit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
