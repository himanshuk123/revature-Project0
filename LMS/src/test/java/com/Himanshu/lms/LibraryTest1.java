package com.Himanshu.lms;

import static org.junit.jupiter.api.Assertions.*;
import com.Himanshu.Library.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.jupiter.api.Test;

import com.Himanshu.Library.util.DBUtil;
import com.mysql.cj.xdevapi.Statement;

public class LibraryTest1 {

	@Test
	void testAddLibraryModel() {
		try {
			Connection con= DBUtil.getConnection();
			PreparedStatement pst= con.prepareStatement("select * from mylibrary where bookId= ?");
			pst.setInt(1, librarymodel.getbookId(bookId));
			ResultSet rs = pst.executeQuery();
			
			
		}
	}

	@Test
	void testCheckId() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateLibraryModel() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteLibraryModel() {
		fail("Not yet implemented");
	}

	@Test
	void testShowLibraryModel() {
		fail("Not yet implemented");
	}

	@Test
	void testShowAllLibraryModel() {
		fail("Not yet implemented");
	}

}
