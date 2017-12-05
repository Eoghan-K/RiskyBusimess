/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riskybusiness;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author robertbrown
 */

public class CustomerGUI extends javax.swing.JFrame {
    
    private SuperClass s;//creating instance of the SuperClass
    private ArrayList <SuperClass> customerBet; 
    private ArrayList <Fixture> fList;//creating a arrayList called CustomerBet
    Random outcome = new Random();
    /*
     * Creates new form EmployeeGUI
     */
    public CustomerGUI() {
        initComponents();
        customerBet = new ArrayList <>(); //creating instance of ArrayList
        fList = new ArrayList <>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        oddsTP = new javax.swing.JTextPane();
        startBtn = new javax.swing.JButton();
        startBtn1 = new javax.swing.JButton();
        currentFixturesCB = new javax.swing.JComboBox<>();
        ViewFixturesBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        sportCB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        teamLb = new javax.swing.JLabel();
        horseLb = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        betAmountTF = new javax.swing.JTextField();
        placeBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        teamNameCB = new javax.swing.JComboBox<>();
        horseNameCB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        myBetsBtn = new javax.swing.JButton();
        myBetsCB = new javax.swing.JComboBox<>();

        jScrollPane1.setViewportView(jTextPane1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton1.setText("jButton1");

        jLabel7.setText("Our Odds:");

        jScrollPane3.setViewportView(oddsTP);

        startBtn.setText("Start Betting");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        startBtn1.setText("Start Betting");
        startBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtn1ActionPerformed(evt);
            }
        });

        currentFixturesCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        currentFixturesCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentFixturesCBActionPerformed(evt);
            }
        });

        ViewFixturesBtn.setText("Current Bets");
        ViewFixturesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewFixturesBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("View all horses, teams and their odds below:");

        jLabel2.setText("Feeling Lucky? Place Your Bet Below ");

        jScrollPane4.setViewportView(jTextPane2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sportCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Sport", "Football", "Horse Racing"}));
        sportCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportCBActionPerformed(evt);
            }
        });

        jLabel3.setText("Select a Sport:");

        teamLb.setText("Team Name:");

        horseLb.setText("Horse Name:");

        jLabel6.setText("Stake (€)");

        betAmountTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betAmountTFActionPerformed(evt);
            }
        });

        placeBtn.setText("Place Bet");
        placeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Place Another");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        teamNameCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamNameCBActionPerformed(evt);
            }
        });

        horseNameCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horseNameCBActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        jLabel4.setText("Place a Bet");

        myBetsBtn.setText("My Bets");
        myBetsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myBetsBtnActionPerformed(evt);
            }
        });

        myBetsCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myBetsCBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(myBetsBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(myBetsCB, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(teamLb)
                        .addGap(17, 17, 17)
                        .addComponent(teamNameCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(sportCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(horseLb)
                            .addComponent(jLabel6))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(betAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(horseNameCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(placeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sportCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamLb)
                    .addComponent(teamNameCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horseLb)
                    .addComponent(horseNameCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(betAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(placeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myBetsBtn)
                    .addComponent(myBetsCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sportCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportCBActionPerformed
    if(sportCB.getSelectedItem().equals("Choose Sport")){
            teamNameCB.setEditable(false);
            horseNameCB.setEditable(false);
                teamNameCB.setVisible(true);
                teamLb.setVisible(true);
                horseNameCB.setVisible(true);
                horseLb.setVisible(true);
        } else if(sportCB.getSelectedItem().equals("Football")){
            readFromBookieFile();
                for(Fixture f : fList){
                    if(f instanceof FootballFixture){
                        teamNameCB.addItem(((FootballFixture) f).getTeamName());
                    }
                }
            teamNameCB.setEditable(true);
            horseNameCB.setEditable(false);
                teamNameCB.setVisible(true);
                teamLb.setVisible(true);
                horseNameCB.setVisible(false);
                horseLb.setVisible(false);
        } else if(sportCB.getSelectedItem().equals("Horse Racing")){
            readFromBookieFile();
                for(Fixture f : fList){
                    if(f instanceof HorseRacingFixture){
                    horseNameCB.addItem(((HorseRacingFixture) f).getHorseName());
                }   
            }
            teamNameCB.setEditable(false);
            horseNameCB.setEditable(true);
                horseNameCB.setVisible(true);
                horseLb.setVisible(true);
                teamNameCB.setVisible(false);
                teamLb.setVisible(false);
        }
    }//GEN-LAST:event_sportCBActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        //clear text entered
        teamNameCB.removeAllItems();
        horseNameCB.removeAllItems();
        //make all input options available again
        teamLb.setVisible(true);
        horseLb.setVisible(true);
        teamNameCB.setVisible(true);
        horseNameCB.setVisible(true);
        betAmountTF.setVisible(true);
        jLabel6.setVisible(true);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        //hide this GUI and open home gui again
        this.setVisible(false);
        new appGUI().setVisible(true);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void placeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeBtnActionPerformed
            if(sportCB.getSelectedItem().equals("Football")){// user wants to bet on football
                if(teamNameCB.getSelectedItem().equals("") || teamNameCB.getSelectedItem().equals(" ")){//ensuring fields are filled out
                    JOptionPane.showMessageDialog(null,"Please fill out the required sections.");//error popup
                }else{
                    s = new TeamBet();
                    //retrieving the values inputted into the customer App
                    ((TeamBet) s).setTeamName(teamNameCB.getSelectedItem().toString());
                    s.setStake(Double.parseDouble(betAmountTF.getText()));
                }
            }     
        
            else if(sportCB.getSelectedItem().equals("Horse Racing")){
                if(horseNameCB.getSelectedItem().equals("") || horseNameCB.getSelectedItem().equals(" ")){
                    JOptionPane.showMessageDialog(null,"Please fill out the required sections.");//error popup
                }else{
                    s = new HorseBet();
                    //retrieving the values inputted 
                    ((HorseBet) s).setHorseName(horseNameCB.getSelectedItem().toString());
                    s.setStake(Double.parseDouble(betAmountTF.getText()));
                }
            }

        customerBet.add(s);//add to the array list
        writeToFile();//write method created below
        compute();
        //reset ComboBox
        sportCB.setSelectedItem("Choose Sport");
        //clear text entered
        teamNameCB.setSelectedItem(" ");
        horseNameCB.setSelectedItem(" ");
        betAmountTF.setText(" ");
        //make all input options available again
        teamLb.setVisible(false);
        horseLb.setVisible(false);
        teamNameCB.setVisible(false);
        horseNameCB.setVisible(false);
        betAmountTF.setVisible(false);
        jLabel6.setVisible(false);
    }//GEN-LAST:event_placeBtnActionPerformed

    private void ViewFixturesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewFixturesBtnActionPerformed

    }//GEN-LAST:event_ViewFixturesBtnActionPerformed

    private void currentFixturesCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentFixturesCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentFixturesCBActionPerformed

    private void teamNameCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamNameCBActionPerformed
        
    }//GEN-LAST:event_teamNameCBActionPerformed

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        
    }//GEN-LAST:event_startBtnActionPerformed

    private void horseNameCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horseNameCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horseNameCBActionPerformed

    private void startBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startBtn1ActionPerformed

    private void myBetsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myBetsBtnActionPerformed
        // TODO add your handling code here:
        readFromFile();
        for(SuperClass i : customerBet){
            if(i instanceof TeamBet){
                 myBetsCB.addItem("Team: " + ((TeamBet)i).getTeamName() + " - Stake: " + i.getStake());
            }
            else if(i instanceof HorseBet){
                myBetsCB.addItem("Horse: " + ((HorseBet)i).getHorseName() + "Stake: " + i.getStake());
            }
        }
    }//GEN-LAST:event_myBetsBtnActionPerformed

    private void betAmountTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betAmountTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_betAmountTFActionPerformed

    private void myBetsCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myBetsCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myBetsCBActionPerformed

    
    //write method
    public void writeToFile(){//write the customers bet 
        try{
        File f = new File("betHistory.dat");//creating file called betHistory to store customer arrayList
        FileOutputStream fStream = new FileOutputStream(f);//calling output stream and inserting the file into
        ObjectOutputStream oStream = new ObjectOutputStream(fStream);
        
        oStream.writeObject(customerBet);//insert customerBet into objStream and Write it to the file "betHistory.dat"
        oStream.close();//cloing the object stream
        }catch(IOException ex){//if any IO errors catch them
            JOptionPane.showMessageDialog(null, ex);//print them in Joption PopUp
        }
    }
    
    public void readFromFile(){//read method
        try{
        File f = new File("betHistory.dat"); 
        FileInputStream fStream = new FileInputStream(f);
        ObjectInputStream oStream = new ObjectInputStream(fStream);
        
        customerBet = (ArrayList <SuperClass>) oStream.readObject();//reading the arrayList fList
        oStream.close();//closing the object stream
        }catch(IOException | ClassNotFoundException ex){//multi catch for any IO errors
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void readFromBookieFile(){
        try{
        File f = new File("fixtures.dat"); 
        FileInputStream fStream = new FileInputStream(f);
        ObjectInputStream oStream = new ObjectInputStream(fStream);
        
        fList = (ArrayList <Fixture>) oStream.readObject();//reading the arrayList fList
        oStream.close();//closing the object stream
        }catch(IOException | ClassNotFoundException ex){//multi catch for any IO errors
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void compute(){
        readFromFile();
        readFromBookieFile();
        
        double money = 0.0;
        double stake = Double.parseDouble(betAmountTF.getText());
        boolean result = outcome.nextBoolean();
        
    //if betting in HORSE
        if(result == true && sportCB.getSelectedItem().equals("Football")){
                for(Fixture f : fList){
                    if(teamNameCB.getSelectedItem().equals(((FootballFixture)f).getTeamName())){
                        money = f.getOdds() * stake + stake;
                    }
                }
            JOptionPane.showMessageDialog(null, "You Won €"+ money);
        }
        
    
        else{
            JOptionPane.showMessageDialog(null, "Sorry you Lost €"+ stake);
        }
        /*
        
        else if(sportCB.getSelectedItem().equals("Football")){
            if(result == true){
                for(Fixture f : fList){
                    if(teamNameCB.getSelectedItem().equals(((FootballFixture)f).getTeamName())){
                        money = f.getOdds() * stake + stake;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "You Won €"+ money);
        }
        */
    
    }
       
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
            java.util.logging.Logger.getLogger(CustomerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewFixturesBtn;
    private javax.swing.JTextField betAmountTF;
    private javax.swing.JComboBox<String> currentFixturesCB;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel horseLb;
    private javax.swing.JComboBox<String> horseNameCB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JButton myBetsBtn;
    private javax.swing.JComboBox<String> myBetsCB;
    private javax.swing.JTextPane oddsTP;
    private javax.swing.JButton placeBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JComboBox<String> sportCB;
    private javax.swing.JButton startBtn;
    private javax.swing.JButton startBtn1;
    private javax.swing.JLabel teamLb;
    private javax.swing.JComboBox<String> teamNameCB;
    // End of variables declaration//GEN-END:variables
}
