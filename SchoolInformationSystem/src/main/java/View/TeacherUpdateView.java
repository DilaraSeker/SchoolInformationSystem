package View;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

@SuppressWarnings("serial")
public class TeacherUpdateView extends javax.swing.JFrame {


    public TeacherUpdateView() {
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
        branchField = new javax.swing.JTextField();
        teacherBranchField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        salaryField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
   

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Update Teacher Information");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        GridBagLayout grid = new GridBagLayout();
        grid.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        grid.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        grid.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0};
        jPanel1.setLayout(grid);
        

        jLabel1.setText("Teacher Branch:");
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
        jPanel1.add(teacherBranchField, gridBagConstraints);

        searchButton.setText("Search");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(3, 5, 5, 0);
        jPanel1.add(searchButton, gridBagConstraints);
        
        jLabel2.setText("Branch:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(jLabel2, gridBagConstraints);
        
        branchField.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(branchField, gridBagConstraints);

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
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
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
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(surnameField, gridBagConstraints);
        
        jLabel5.setText("Salary:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(jLabel5, gridBagConstraints);
        
        salaryField.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(salaryField, gridBagConstraints);
        submitButton = new javax.swing.JButton();
        
        submitButton.setText("Submit");
        submitButton.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(16, 119, 11, 5);
        jPanel1.add(submitButton, gridBagConstraints);
        
        cancelButton = new javax.swing.JButton(); 
        cancelButton.setText("Cancel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 6, 11, 10);
        jPanel1.add(cancelButton, gridBagConstraints);
       


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
    
    public String getTeacherBranch(){
    
        return teacherBranchField.getText();
    }
    
    public void setTeacherBranch(){
    
    	teacherBranchField.setText(null);
    }
    
    public String getBranch(){
    
        return branchField.getText();
    }
    
    public void setBranch(String s){
    
        branchField.setText(s);
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
    
    public int getSalary(){
    
        return Integer.parseInt(salaryField.getText());
    }
    
    public void setSalary(String s){
    
        salaryField.setText(s);
    }
    
    
    public void setPermissionOn(){
    
        branchField.setEditable(true);
        nameField.setEditable(true);
        surnameField.setEditable(true);
        salaryField.setEditable(true);
    }
    
    public void setPermissionOff(){
    
        branchField.setEditable(false);
        nameField.setEditable(false);
        surnameField.setEditable(false);
        salaryField.setEditable(false);
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
    private javax.swing.JButton searchButton;

    private javax.swing.JTextField teacherBranchField;
    private javax.swing.JTextField branchField;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField surnameField;
    private javax.swing.JTextField salaryField;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton cancelButton;
    
    
}
