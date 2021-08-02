package com.Himanshu.Library.controller;

import org.apache.log4j.Logger;

import com.Himanshu.Library.model.LibraryModel;
import com.Himanshu.Library.service.LibraryService;
import com.Himanshu.Library.service.LibraryServiceImpl;

public class Librarycontroller {
	
	static Logger logger= Logger.getLogger("Librarycontroller.class");

	
	LibraryService libraryServiceImpl= new LibraryServiceImpl();
	
	public void addLibraryModel(LibraryModel librarymodel) {
		
		   
		  try {
			  libraryServiceImpl.addLibrary(librarymodel);
		} 
		  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
	public int checkId(LibraryModel librarymodel) {
		return libraryServiceImpl.checkId(librarymodel);
		
	}
		

	public void updateLibraryModel(LibraryModel librarymodel) {
		try {
			libraryServiceImpl.updateLibrary(librarymodel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteLibraryModel(LibraryModel librarymodel) {
		try {
			libraryServiceImpl.deleteLibrary(librarymodel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void showLibraryModel(LibraryModel librarymodel) {
		try {
			libraryServiceImpl.showLibrary(librarymodel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void showAllLibraryModel() {
		try {
			libraryServiceImpl.showAllLibrary();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


