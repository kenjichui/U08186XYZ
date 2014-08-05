/**
 * @author
 */
package hospital.view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

/**
 * @author XU YINGZHENG
 *
 */
public class DisplayPatPanel extends JPanel implements ActionListener, KeyListener{

	private JLabel lblDisplayPat = new JLabel("All patient records as shown below:");
	private JTable patTable;
	private ArrayList<String> data1;
	private JScrollPane sp;
	
	
	public DisplayPatPanel(){
		super(new GridLayout(1,2));
		String [] patHeader = {"Patient-Name","Patient-Registration-Number","Gender","Date-of-Birth","Address","Contact-No"};
		
		addKeyListener(this);
		File f = new File ("patientList.txt");
		
		if (!f.exists()){
			try{
				PrintWriter out = new PrintWriter(f);
				out.close();
				
			}catch (Exception e){
				JOptionPane.showMessageDialog(null, this, "The file is not exist. Please create some records.",JOptionPane.WARNING_MESSAGE);
			}
		}
		Scanner scan = new Scanner("ERROR");
		try{
			scan = new Scanner(f);
			
			
		}catch (Exception e){
			JOptionPane.showMessageDialog(null, this, "Invalid Input, please try again",JOptionPane.WARNING_MESSAGE);
		}
		
		data1 = new ArrayList<String>();
		while (scan.hasNextLine()){
			data1.add(scan.nextLine());
		}
		
		Object[][] patientList = new Object[data1.size()][6];
		patientList[5][0] = "Total Number of Patients";
		patientList[5][1] = getColumnCount(patTable);
		
		int counter = 1;
		for (int i=0;i<data1.size(); i++){
			patientList[counter][0] = data1.get(i);
			patientList[counter][1] = data1.get(i+1);
			counter++;
		}
		patTable = new JTable(patientList, patHeader){
			public boolean isCellEditable(int row, int col){
				return false;
			}
			
		};
		patTable.addKeyListener(this);
		patTable.setPreferredScrollableViewportSize(new Dimension(500, 300));
		patTable.setFillsViewportHeight(true);
		sp = new JScrollPane(patTable);
		add(sp);
}
	
	
	
	
	
	
	

	/**
	 * @return
	 */
	
	private TableColumn[] getColumnCount(JTable patTable) {
		TableColumn[] num = new TableColumn[patTable.getColumnCount()];
		
		for (int c = 0; c<patTable.getColumnCount(); c++){
			num [c] = patTable.getColumnModel().getColumn(c);
		}
		return num;
	}



	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		 char temp = e.getKeyChar();
		
	}

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
