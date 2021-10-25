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

public class ClassView {
	
	public ClassView() {
        initComponents();
    }
	 
	private void initComponents() {
		
		jScrollPane1 = new javax.swing.JScrollPane();
	    classTable = new javax.swing.JTable();
	    
	    JPanel ctrlPane = new JPanel();
	    updateButton = new JButton("UPDATE");
        updateButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ctrlPane.add(updateButton);
		
	    classTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(classTable);
        jScrollPane1.setPreferredSize(new Dimension(700, 182));
        jScrollPane1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Classes ",
					TitledBorder.CENTER, TitledBorder.TOP));

		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, ctrlPane, jScrollPane1);
		splitPane.setDividerLocation(35);
		splitPane.setEnabled(false);
			// Display it all in a scrolling window and make the window appear
		JFrame frame = new JFrame("Class Management");
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(splitPane);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
    }
	public void updateClassListener(ActionListener listener){
	    
		updateButton.addActionListener(listener);
    }
	public void setClassTable(TableModel table){    
		classTable.setModel(table);
	}
	
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable classTable;
    private javax.swing.JButton updateButton;


}