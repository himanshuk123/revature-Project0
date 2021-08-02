package com.Himanshu.Library.service;

import org.apache.log4j.Logger;

import com.Himanshu.Library.dao.LibraryDAO;
import com.Himanshu.Library.dao.LibraryDAOImpl;
import com.Himanshu.Library.model.LibraryModel;

public  class LibraryServiceImpl implements LibraryService {
	
	static Logger logger= Logger.getLogger("LibraryServiceImpl.class");

	
	LibraryDAO libraryDAOImpl=new LibraryDAOImpl();
	
	
	
	public void addLibrary(LibraryModel librarymodel){
		try {
			libraryDAOImpl.addLibraryModel(librarymodel);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int checkId(LibraryModel librarymodel){
		
			return libraryDAOImpl.checkId(librarymodel);
			
		
	}
	public void updateLibrary(LibraryModel librarymodel) {
		try {
			libraryDAOImpl.updateLibraryModel(librarymodel);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteLibrary(LibraryModel librarymodel) {
		try {
			libraryDAOImpl.deleteLibraryModel(librarymodel);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void showLibrary(LibraryModel librarymodel) {
		try {
			libraryDAOImpl.showLibraryModel(librarymodel);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void showAllLibrary( ) {
		try {
			libraryDAOImpl.showAllLibraryModel();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
	


