package View;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

@SuppressWarnings("serial")
public class StudentUpdateView extends javax.swing.JFrame {


    public StudentUpdateView() {
        initComponents();
    }
    
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        surnameField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        gradeField = new javax.swing.JTextField();
        
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        ageField = new javax.swing.JTextField();
        feeField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        studenIdField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Update Student Information");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        GridBagLayout grid = new GridBagLayout();
        grid.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        grid.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        grid.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0};
        jPanel1.setLayout(grid);
        

        jLabel1.setText("Student ID:");
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
        jPanel1.add(studenIdField, gridBagConstraints);

        searchButton.setText("Search");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(3, 5, 5, 0);
        jPanel1.add(searchButton, gridBagConstraints);
        
        jLabel2.setText("ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(jLabel2, gridBagConstraints);
        
        idField.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new Insets(5, 5, 5, 0);
        jPanel1.add(idField, gridBagConstraints);

        jLabel3.setText("Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(jLabel3, gridBagConstraints);

        nameField.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new Insets(5, 5, 5, 0);
        jPanel1.add(nameField, gridBagConstraints);

        jLabel4.setText("Surname: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(jLabel4, gridBagConstraints);

        surnameField.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new Insets(5, 5, 5, 0);
        jPanel1.add(surnameField, gridBagConstraints);
        
        jLabel5.setText("Grade:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(jLabel5, gridBagConstraints);
        
        gradeField.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new Insets(5, 5, 5, 0);
        jPanel1.add(gradeField, gridBagConstraints);

        jLabel6.setText("Age:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(jLabel6, gridBagConstraints);     
        
        ageField.setEditable(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new Insets(5, 5, 5, 0);
        jPanel1.add(ageField, gridBagConstraints);
     
        jLabel7.setText("Fee:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(jLabel7, gridBagConstraints);
        
        feeField.setEditable(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new Insets(5, 5, 5, 0);
        jPanel1.add(feeField, gridBagConstraints);

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
    }// </editor-fold>//GEN-END:initComponents

    public void  closeWindowListener(WindowAdapter listener){
    
        addWindowListener(listener);
    }
    
    public String getStudentId(){
    
        return studenIdField.getText();
    }
    
    public void setStudentId(){
    
    	studenIdField.setText(null);
    }
    
    public String getId(){
    
        return idField.getText();
    }
    
    public void setId(String s){
    
        idField.setText(s);
    }
    
    public String getName(){
    
        return nameField.getText();
    }
    
    public void setName(String s){
    
        nameField.setText(s);
    }
    
    public String getSurname(){
    
        return surnameField.getText();
    }
    
    public void setSurname(String s){
    
        surnameField.setText(s);
    }
    
    public int getGrade(){
    
        return Integer.parseInt(gradeField.getText());
    }
    
    public void setGrade(String s){
    
        gradeField.setText(s);
    }
    public int getFee(){
        
        return Integer.parseInt(feeField.getText());
    }
    
    public void setFee(String s){
    
        feeField.setText(s);
    }
    
    public int getAge(){
    
        return Integer.parseInt(ageField.getText());
    }
    
    public void setAge(String s){
    
        ageField.setText(s);
    }
    
    public void setPermissionOn(){
    
        idField.setEditable(true);
        nameField.setEditable(true);
        surnameField.setEditable(true);
        gradeField.setEditable(true);
        ageField.setEditable(true);
        feeField.setEditable(true);
    }
    
    public void setPermissionOff(){
    
        idField.setEditable(false);
        nameField.setEditable(false);
        surnameField.setEditable(false);
        gradeField.setEditable(false);
        ageField.setEditable(false);
        feeField.setEditable(false);
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

    private javax.swing.JTextField studenIdField;
    private javax.swing.JTextField idField;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField surnameField;
    private javax.swing.JTextField gradeField;
    private javax.swing.JTextField ageField;
    private javax.swing.JTextField feeField;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton cancelButton;
    
    
}
