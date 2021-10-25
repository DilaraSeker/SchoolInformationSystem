package View;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

@SuppressWarnings("serial")
public class ClassUpdateView extends javax.swing.JFrame {


    public ClassUpdateView() {
        initComponents();
    }
    
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        
        classGradeField = new javax.swing.JTextField();
        gradeField = new javax.swing.JTextField();
        
        mondayField = new javax.swing.JTextField();
        tuesdayField = new javax.swing.JTextField();
        wednesdayField = new javax.swing.JTextField();
        thursdayField = new javax.swing.JTextField();
        fridayField = new javax.swing.JTextField();
        
        cancelButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Update Class Information");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        GridBagLayout grid = new GridBagLayout();
        grid.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        grid.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        grid.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0};
        jPanel1.setLayout(grid);
        

        jLabel1.setText("Class Grade:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(jLabel1, gridBagConstraints);
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(classGradeField, gridBagConstraints);

        searchButton.setText("Search");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(3, 5, 5, 0);
        jPanel1.add(searchButton, gridBagConstraints);
        
        jLabel2.setText("Grade:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(jLabel2, gridBagConstraints);
        
        gradeField.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new Insets(5, 5, 5, 0);
        jPanel1.add(gradeField, gridBagConstraints);

        jLabel3.setText("Monday:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(jLabel3, gridBagConstraints);

        mondayField.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new Insets(5, 5, 5, 0);
        jPanel1.add(mondayField, gridBagConstraints);

        jLabel4.setText("Tuesday: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(jLabel4, gridBagConstraints);

        tuesdayField.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new Insets(5, 5, 5, 0);
        jPanel1.add(tuesdayField, gridBagConstraints);
        
        
        jLabel5.setText("Wednesday:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(jLabel5, gridBagConstraints);
        
        wednesdayField.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new Insets(5, 5, 5, 0);
        jPanel1.add(wednesdayField, gridBagConstraints);
        
        jLabel6.setText("Thursday:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(jLabel6, gridBagConstraints);     
        
        thursdayField.setEditable(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new Insets(5, 5, 5, 0);
        jPanel1.add(thursdayField, gridBagConstraints);
     
        jLabel7.setText("Friday:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(jLabel7, gridBagConstraints);
        
        fridayField.setEditable(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new Insets(5, 5, 5, 0);
        jPanel1.add(fridayField, gridBagConstraints);

        cancelButton.setText("Cancel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 6, 11, 10);
        jPanel1.add(cancelButton, gridBagConstraints);

        submitButton.setText("Submit");
        submitButton.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(16, 119, 11, 5);
        jPanel1.add(submitButton, gridBagConstraints);

        
       


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    public void  closeWindowListener(WindowAdapter listener){
    
        addWindowListener(listener);
    }
    
    public String getClassGrade(){
    
        return classGradeField.getText();
    }
    
    public void setClassGrade(){
    
    	classGradeField.setText(null);
    }
    
    public String getGrade(){
    
        return gradeField.getText();
    }
    
    public void setGrade(String s){
    
        gradeField.setText(s);
    }
    
    public String getMonday(){
    
        return mondayField.getText();
    }
    
    public void setMonday(String s){
    
        mondayField.setText(s);
    }
    
    public String getTuesday(){
    
        return tuesdayField.getText();
    }
    
    public void setTuesday(String s){
    
        tuesdayField.setText(s);
    }
    public String getWednesday(){
        
        return wednesdayField.getText();
    }
    
    public void setWednesday(String s){
    
        wednesdayField.setText(s);
    }
    public String getThursday(){
        
        return thursdayField.getText();
    }
    
    public void setThursday(String s){
    
        thursdayField.setText(s);
    }
    public String getFriday(){
        
        return fridayField.getText();
    }
    
    public void setFriday(String s){
    
        fridayField.setText(s);
    }
    
    
    
    public void setPermissionOn(){
    
        gradeField.setEditable(true);
        mondayField.setEditable(true);
        tuesdayField.setEditable(true);
        wednesdayField.setEditable(true);
        thursdayField.setEditable(true);
        fridayField.setEditable(true);
    }
    
    public void setPermissionOff(){
    
        gradeField.setEditable(false);
        mondayField.setEditable(false);
        tuesdayField.setEditable(false);
        wednesdayField.setEditable(false);
        thursdayField.setEditable(false);
        fridayField.setEditable(false);
    }
    
    public void submitButtonVisibilityOff(){
    
        submitButton.setEnabled(false);
    }
    
    public void submitButtonVisibilityOn(){
    
        submitButton.setEnabled(true);
    }
    
    public void searchButtonListener(ActionListener listener){
    
        searchButton.addActionListener(listener);
    }
    
    public void submitButtonListener(ActionListener listener){
    
        submitButton.addActionListener(listener);
    }
    
    public void cancelButtonListener(ActionListener listener){
    
        cancelButton.addActionListener(listener);
    }
    
      
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton searchButton;

    private javax.swing.JTextField classGradeField;
    private javax.swing.JTextField gradeField;
    private javax.swing.JTextField mondayField;
    private javax.swing.JTextField tuesdayField;
    private javax.swing.JTextField wednesdayField;
    private javax.swing.JTextField thursdayField;
    private javax.swing.JTextField fridayField;
  
    private javax.swing.JButton submitButton;
    private javax.swing.JButton cancelButton;
    
    
}
