package hospital.controller;

import hospital.view.HospitalFrame;

/**
 * @author XU YINGZHENG
 *
 */

public class HospitalAppController {
	
	//model object
	
	private HospitalFrame hospitalFrame;
	
	public void start(){
		
		hospitalFrame = new HospitalFrame(this);
		
	}
	
	public HospitalAppController(){
		
	}
	
	
}
