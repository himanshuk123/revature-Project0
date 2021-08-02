package com.Himanshu.Library.dao;
import java.sql.Statement;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Himanshu.Library.model.LibraryModel;
import com.Himanshu.Library.util.DBUtil;

public class LibraryDAOImpl implements LibraryDAO {
	
	static Logger logger= Logger.getLogger("LibraryDAOImpl.class");


	public void addLibraryModel(LibraryModel librarymodel) {
		
		try {
			Connection con= DBUtil.getConnection();
			PreparedStatement pst= con.prepareStatement("insert into MyLibrary values(?,?,?,?,?)");
			
			pst.setInt(1, librarymodel.getbookId());
			pst.setString(2, librarymodel.getbookName());
			pst.setString(3, librarymodel.getbookAuthor());
			pst.setString(4, librarymodel.getbookCategory());
			pst.setString(5, librarymodel.getbookPrice());
			
			pst.execute();
			
			System.out.println("BOOK DATA Inserted............");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}
		public int checkId(LibraryModel librarymodel) {
			int flag=0;
			try {
				Connection con = DBUtil.getConnection();
				PreparedStatement pst=con.prepareStatement("select * from mylibrary where bookId=?");
				pst.setInt(1, librarymodel.getbookId());
				pst.execute();
				ResultSet rs=pst.executeQuery();
				if(rs.next()) {
					flag=1; 
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return flag;
			
		}
		public void updateLibraryModel( LibraryModel librarymodel) {
//			if(checkId(librarymodel)==1) {
				try {
					Connection con = DBUtil.getConnection();
					PreparedStatement pst=con.prepareStatement("Update mylibrary set "+librarymodel.getUpdateColumn()+"  = ? where bookId=?");
					//pst.setString(1, librarymodel.getUpdateColumn());
					pst.setString(1, librarymodel.getUpdateValue());
					pst.setInt(2, librarymodel.getUpdateId());
					int result = pst.executeUpdate();
					if(result==1)
					{				
					System.out.println("Updated Successfully");
					}
					else {
						System.out.println("Sorry,access denied");
					}
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
	}	
		
		public void deleteLibraryModel( LibraryModel librarymodel) {
			 
				try {
					Connection con = DBUtil.getConnection();
					PreparedStatement pst=con.prepareStatement("delete from mylibrary where bookId=?");
					pst.setInt(1, librarymodel.getDeleteId());
					int result= pst.executeUpdate();
					
					if(result==1) {
					System.out.println("Deleted Successfully");
					}
					else {
						System.out.println("id not found");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
	
		public void showLibraryModel( LibraryModel librarymodel) {
			
				
			try {
				Connection con = DBUtil.getConnection();
				//Statement st = con.createStatement();
				PreparedStatement pst=con.prepareStatement("select * from mylibrary where bookId=?");	
				pst.setInt(1, librarymodel.getShowId());
				
				
				ResultSet rs= pst.executeQuery();
				if(rs.next()) {
				System.out.println("BookId    bookName     bookAuthor     bookCategory     bookPrice");
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
				}
				else {
					System.out.println("incorrect id");
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			}
	
		public void showAllLibraryModel() {
			try {
				Connection con = DBUtil.getConnection();
				PreparedStatement pst=con.prepareStatement("select * from mylibrary");
				ResultSet rs=pst.executeQuery();
				if(rs!=null) {
					System.out.println("BookId    bookName     bookAuthor     bookCategory     bookPrice");
					while(rs.next()) {
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
						
					}
				}else {
					System.out.println("records not found!");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

}
