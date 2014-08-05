/**
 * 
 */
package hospital.view;

import java.awt.CardLayout;

import hospital.controller.HospitalAppController;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author XU YINGZHENG
 *
 */
public class StartPanel extends JPanel {

	private HospitalAppController hospitalController;
	private JLabel hmsText;
	private JButton patButton;
	private JButton treatButton;
	
	public StartPanel(HospitalAppController hospitalController){
		
		this.hospitalController = hospitalController;
		setLayout(null);
		
		//elements on startup screen
		JLabel hmsText = new JLabel("Please click the button to use the functions.");
		JButton patButton = new JButton("PATIENT");
		JButton treatButton = new JButton("TREATMENT");
		
		
		setupPanel();
		setupLayout();
		setupListener();
		
	}
	
	private void setupLayout(){
		
		hmsText.setLocation(50, 80);
		hmsText.setSize(400, 30);
		patButton.setLocation(50, 140);
		patButton.setSize(100, 30);
		treatButton.setLocation(220, 140);
		treatButton.setSize(100, 30);
		
		setVisible(true);
	}
	
	private void setupPanel(){
		
		this.add(hmsText);
		this.add(patButton);
		this.add(treatButton);
	}
	
	private void setupListener(){
		patButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	
	}

		
		
		
	}

