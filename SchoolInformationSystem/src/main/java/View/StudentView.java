package View;


import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableModel;


public class StudentView {
	//StudentTableRowView jtRowData = new StudentTableRowView();
	public StudentView() {
        initComponents();
    }
	 
	private void initComponents() {
		
	    jScrollPane1 = new javax.swing.JScrollPane();
	    studentTable = new javax.swing.JTable();
	    
	    JPanel ctrlPane = new JPanel();
	    updateButton = new JButton("UPDATE");
        updateButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctrlPane.add(updateButton);
		
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {
	                {null, null, null, null},
	                {null, null, null, null},
	                {null, null, null, null},
	                {null, null, null, null}
	            },
	            new String [] {
	                "Title 1", "Title 2", "Title 3", "Title 4"
	            }
	    ));
        jScrollPane1.setViewportView(studentTable);
        jScrollPane1.setPreferredSize(new Dimension(700, 182));
        jScrollPane1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Students ",
					TitledBorder.CENTER, TitledBorder.TOP));
    
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, ctrlPane, jScrollPane1);
		splitPane.setDividerLocation(35);
		splitPane.setEnabled(false);
		
		JFrame frame = new JFrame("Student Management");
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(splitPane);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               // jTable1MouseClicked(evt);
            }
        });
    }/*
		  private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
		        int index = studentTable.getSelectedRow();
		        
		        TableModel model = studentTable.getModel();
		        
		        String id = model.getValueAt(index, 0).toString();
		        String firstName = model.getValueAt(index, 1).toString();
		        String lastName = model.getValueAt(index, 2).toString();
		        String age = model.getValueAt(index, 3).toString();
		        
		        jtRowData.setVisible(true);
		        jtRowData.pack();
		        jtRowData.setLocationRelativeTo(null);
		        jtRowData.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		        
		        jtRowData.jTextField_Id.setText(id);
		        jtRowData.jTextField_FirstName.setText(firstName);
		        jtRowData.jTextField_LastName.setText(lastName);
		        jtRowData.jTextField_Age.setText(age);
		        
		    }  
		    */
	
	public void updateStudentsListener(ActionListener listener){
	    
		updateButton.addActionListener(listener);
    }
	public void setStudentTable(TableModel table){    
	        studentTable.setModel(table);
	}

    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable studentTable;
    private javax.swing.JButton updateButton;
   


}
