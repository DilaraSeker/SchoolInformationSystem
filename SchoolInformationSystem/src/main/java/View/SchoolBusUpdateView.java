package View;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.json.JsonArray;


@SuppressWarnings("serial")
public class SchoolBusUpdateView extends javax.swing.JFrame {


    public SchoolBusUpdateView() {
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
      
        
        schoolBusIdField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        capacityField = new javax.swing.JTextField();
        statusField = new javax.swing.JTextField();
        arrivedField = new javax.swing.JTextField();
        studentsField = new javax.swing.JTextField();
                      
        cancelButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
     
        
        schoolBusIdField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Update School Bus Information");
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
        jPanel1.add(schoolBusIdField, gridBagConstraints);

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

        capacityField.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new Insets(5, 5, 5, 0);
        jPanel1.add(capacityField, gridBagConstraints);

        jLabel4.setText("Surname: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(jLabel4, gridBagConstraints);

        statusField.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new Insets(5, 5, 5, 0);
        jPanel1.add(statusField, gridBagConstraints);
        
        jLabel5.setText("Grade:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(jLabel5, gridBagConstraints);
        
        arrivedField.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new Insets(5, 5, 5, 0);
        jPanel1.add(arrivedField, gridBagConstraints);

        jLabel6.setText("Age:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel1.add(jLabel6, gridBagConstraints);     
        
        studentsField.setEditable(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new Insets(5, 5, 5, 0);
        jPanel1.add(studentsField, gridBagConstraints);
     
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
    
        return schoolBusIdField.getText();
    }
    
    public void setStudentId(){
    
    	schoolBusIdField.setText(null);
    }
    
    public String getId(){
    
        return idField.getText();
    }
    
    public void setId(String s){
    
        idField.setText(s);
    }
    
    public int getCapacity(){
    
        return Integer.parseInt(capacityField.getText());
        		
    }
    public void setCapacity(String s){
    
        capacityField.setText(s);
    }
    
    public String getStatus(){
    
        return statusField.getText();
    }
    
    public void setStatus(String s){
    
        statusField.setText(s);
    }
    
    public String getArrived(){
    
        return arrivedField.getText();
    }
    
    public void setArrived(String s){
    
        arrivedField.setText(s);
    }
   
    
    public String getStudents(){
    
        return studentsField.getText();
    }
    
    public void setStudents(JsonArray jsonArray){
    
        studentsField.setText(jsonArray.toString());
    }
    
    public void setPermissionOn(){
    
        idField.setEditable(true);
        capacityField.setEditable(true);
        statusField.setEditable(true);
        arrivedField.setEditable(true);
        studentsField.setEditable(true);
        
    }
    
    public void setPermissionOff(){
    
        idField.setEditable(false);
        capacityField.setEditable(false);
        statusField.setEditable(false);
        arrivedField.setEditable(false);
        studentsField.setEditable(false);
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
    private javax.swing.JButton searchButton;

    private javax.swing.JTextField schoolBusIdField;
    private javax.swing.JTextField idField;
    private javax.swing.JTextField capacityField;
    private javax.swing.JTextField statusField;
    private javax.swing.JTextField arrivedField;
    private javax.swing.JTextField studentsField;
    
    private javax.swing.JButton submitButton;
    private javax.swing.JButton cancelButton;
    
    
}
