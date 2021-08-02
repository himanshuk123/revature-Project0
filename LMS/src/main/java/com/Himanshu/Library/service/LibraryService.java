package com.Himanshu.Library.service;

import com.Himanshu.Library.model.LibraryModel;

public interface LibraryService {

	 public void addLibrary(LibraryModel librarymodel);
	 public int checkId(LibraryModel librarymodel);
	 public void updateLibrary(LibraryModel librarymodel);
	 public void deleteLibrary(LibraryModel librarymodel);
	 public void showLibrary(LibraryModel librarymodel);
	 public void showAllLibrary( );
	}


