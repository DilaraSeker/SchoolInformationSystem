package View;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableModel;


public class TeacherView {
	
	public TeacherView() {
        initComponents();
    }
	 
	private void initComponents() {
		
		
	    jScrollPane1 = new javax.swing.JScrollPane();
	    teacherTable = new javax.swing.JTable();
	    
	    JPanel ctrlPane = new JPanel();
	    updateButton = new JButton("UPDATE");
        updateButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctrlPane.add(updateButton);
		
	    teacherTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(teacherTable);
        jScrollPane1.setPreferredSize(new Dimension(700, 182));
        jScrollPane1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Teachers ",
					TitledBorder.CENTER, TitledBorder.TOP));

		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, ctrlPane, jScrollPane1);
		splitPane.setDividerLocation(35);
		splitPane.setEnabled(false);
			// Display it all in a scrolling window and make the window appear
		
		JFrame frame = new JFrame("Teacher Management");
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(splitPane);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
    }
	public void updateTeachersListener(ActionListener listener){
	    
		updateButton.addActionListener(listener);
    }
	public void setTeacherTable(TableModel table){    
		teacherTable.setModel(table);
	}
    
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable teacherTable;
    private javax.swing.JButton updateButton;


}
