/**
 * 
 */
package hospital.view;

import javax.swing.JOptionPane;

import hospital.controller.HospitalAppController;

/**
 * @author XU YINGZHENG
 *
 */
public class AddPatPanel {

	
	public AddPatPanel(HospitalAppController hospitalController){
	
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}

	
	
	
	/**
	 * 
	 */
	private void setupListeners() {
		// TODO Auto-generated method stub
		
	}




	/**
	 * 
	 */
	private void setupLayout() {
		// TODO Auto-generated method stub
		
	}




	/**
	 * 
	 */
	private void setupPanel() {
		// TODO Auto-generated method stub
		
	}




	private boolean checkInteger(String phoneInput){
		boolean isInteger = false;
		try{
			Integer.parseInt(phoneInput);
			isInteger = true;
		}catch(NumberFormatException phoneException){
			JOptionPane.showMessageDialog(null, this, "Please key in number only for the phone number",JOptionPane.WARNING_MESSAGE);
		}
		return isInteger;
	}
}