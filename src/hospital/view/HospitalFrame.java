package hospital.view;

import hospital.controller.HospitalAppController;

import javax.swing.JFrame;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

/**
 * @author XU YINGZHENG
 */

/*
 * HospitalFrame object extends JFrame to use in GUI
 */

public class HospitalFrame extends JFrame {
	
	//declare panels inside the hospital frame.
	
	private StartPanel startPanel;
	private StartPanel patientPanel;            //add,display,exit
	
	private StartPanel addPatPanel;             //add new patient
	private StartPanel displayPatPanel;         //display patient
	
	private StartPanel treatPanel;              //add,display,exit
	private StartPanel addTreatPanel;           //add new treatment
	private StartPanel displayTreatPanel;       //display treatment
	
	private CardLayout hospitalLayout;
	
	/*
	 * hospitalAppController
	 * create HospitalFrame object passing a reference to the AppController 
	 * for use by the HospitalFrame object.
	 * hospitalController is the reference to AppController object
	 */
	
	public HospitalFrame(HospitalAppController hospitalController){
		setResizable(false);
		
		//constructor to create a panel
		
		startPanel = new StartPanel(hospitalController);
		startPanel.setBackground(Color.LIGHT_GRAY);
		
		patientPanel = new StartPanel(hospitalController);
		addPatPanel = new StartPanel(hospitalController);
		displayPatPanel = new StartPanel(hospitalController);
		
		treatPanel = new StartPanel(hospitalController);
		addPatPanel = new StartPanel(hospitalController);
		displayTreatPanel = new StartPanel(hospitalController);
		
		hospitalLayout = new CardLayout();
				
		setupFrame();
	}
		
	/*
	 * content pane - size, visibility
	 */
	
	private void setupFrame(){
		
		//add panel to frame
		
		this.setContentPane(startPanel);
		
		
		this.setSize(600, 400);
		this.setVisible(true);
		
		this.setTitle("X.Y.Z. Hospital Patient-Treatment System");	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
