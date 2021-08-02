package com.Himanshu.Library.dao;




import com.Himanshu.Library.model.LibraryModel;

public interface LibraryDAO {

	public void addLibraryModel(LibraryModel librarymodel)  ;
	public int checkId(LibraryModel librarymodel);
	public void updateLibraryModel(LibraryModel libarymodel);
	public void deleteLibraryModel(LibraryModel libarymodel);
	public void showLibraryModel(LibraryModel libarymodel);
	public void showAllLibraryModel();
	
}
