package View;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;



@SuppressWarnings("serial")
public class MainView extends javax.swing.JFrame {

    public MainView() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Information System");

        jSplitPane1.setDividerLocation(160);
        jSplitPane1.setDividerSize(7);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "School Information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());
        
        viewStudents = new javax.swing.JButton();
        viewStudents.setFont(new Font("Tahoma", Font.PLAIN, 12));
        viewStudents.setBackground(Color.WHITE);
        viewStudents.setText("Students");
        jDesktopPane1.setLayer(viewStudents, javax.swing.JLayeredPane.DEFAULT_LAYER);
        
        viewTeachers = new javax.swing.JButton();
        viewTeachers.setFont(new Font("Tahoma", Font.PLAIN, 12));
        viewTeachers.setText("Teachers");
        jDesktopPane1.setLayer(viewTeachers, javax.swing.JLayeredPane.DEFAULT_LAYER);
        
        viewClasses = new javax.swing.JButton();
        viewClasses.setFont(new Font("Tahoma", Font.PLAIN, 12));
        viewClasses.setText("Classes");
        jDesktopPane1.setLayer(viewClasses, javax.swing.JLayeredPane.DEFAULT_LAYER);
        
        viewSchoolBuses = new javax.swing.JButton();
        viewSchoolBuses.setFont(new Font("Tahoma", Font.PLAIN, 12));
        viewSchoolBuses.setText("SchoolBuses");
        jDesktopPane1.setLayer(viewSchoolBuses, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(viewStudents, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(viewTeachers, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(viewClasses, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        				.addComponent(viewSchoolBuses, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(20)
        			.addComponent(viewStudents, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(viewTeachers, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(viewClasses, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(viewSchoolBuses, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        jSplitPane1.setLeftComponent(jPanel2);

        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1Layout.setHorizontalGroup(
        	jDesktopPane1Layout.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 133, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
        	jDesktopPane1Layout.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 376, Short.MAX_VALUE)
        );
        jDesktopPane1.setLayout(jDesktopPane1Layout);

        jSplitPane1.setRightComponent(jDesktopPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );



        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    


    public void viewStudentsListener(ActionListener listener){
    
        viewStudents.addActionListener(listener);
    }
    
    public void viewTeachersListener(ActionListener listener){
    
        viewTeachers.addActionListener(listener);
    }
    
    public void viewClassesListener(ActionListener listener){
    
        viewClasses.addActionListener(listener);
    }
    
    public void viewSchoolBusesListener(ActionListener listener){
    
        viewSchoolBuses.addActionListener(listener);
    }

    private javax.swing.JButton viewStudents;
    private javax.swing.JButton viewSchoolBuses;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton viewClasses;
    private javax.swing.JButton viewTeachers;
}
