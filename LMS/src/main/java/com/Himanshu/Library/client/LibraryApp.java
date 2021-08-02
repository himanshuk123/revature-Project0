package com.Himanshu.Library.client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.Himanshu.Library.controller.Librarycontroller;
import com.Himanshu.Library.model.LibraryModel;
import com.Himanshu.Library.util.DBUtil;
public class LibraryApp {
	
	static Logger logger= Logger.getLogger("LibraryApp.class");

	
	static Scanner sc= new Scanner(System.in);
	static Librarycontroller libController=new Librarycontroller();
	static LibraryModel librarymodel= new LibraryModel();

	public static void main(String[] args) {
		System.out.println("*/*/*-- Welcome to the world of Books- THE LIBRARY --*/*/*");
		
		Scanner sc= new Scanner(System.in);
		int flag=0;
		do {
			
			System.out.println("enter your choice of operation");
			System.out.println("1. Enter book records");
			System.out.println("2. update existing book details");
			System.out.println("3. delete book details");
			System.out.println("4. show any book details");
			System.out.println("5. show all book details");
			System.out.println("6. Exit");
			
			int choice = sc.nextInt();
			switch (choice) {
			case 1:	
				insertDetails();
				break;
			case 2: 
				updateDetails();
				break;
			case 3: 
				deleteDetails();
				break;
			case 4: 
				showDetails();
				break;
			case 5: 
				showAllDetails();
				break;
			case 6:
				logger.info("exit");
				System.out.println("Thank you, Have a nice day ahead");
				flag=1;
			default :
				System.out.println("please enter correct choice");
			}
		}
			while(flag==0);
		
	}
		
		public static void insertDetails() {
			
			logger.info("Inserting......");
		
		
		System.out.println("ENTER THE BOOK DETAILS IN YOUR VIRTUAL LIBRARY:-");
		int bookId= sc.nextInt();
		sc.nextLine();
		String bookName= sc.nextLine();
		String bookAuthor= sc.nextLine();
		String bookCategory= sc.nextLine();
		String bookPrice= sc.nextLine();
			
		
		librarymodel.setbookId(bookId);
		librarymodel.setbookName(bookName);
		librarymodel.setbookAuthor(bookAuthor);
		librarymodel.setbookCategory(bookCategory);
		librarymodel.setbookPrice(bookPrice);
	
		libController.addLibraryModel(librarymodel);
		
		System.out.println(" Use case 1 --- Inserting book data is completed ");
	}	
		
		
			public static void updateDetails() {
				
				logger.info("updating......");
			System.out.println("Enter the column name to update it :");
			String cn = sc.nextLine();
			librarymodel.setUpdateColumn(cn);
				
			System.out.println("Enter the updated value");
			String updatedValue= sc.nextLine();
			librarymodel.setUpdateValue(updatedValue);
				
			System.out.println("Enter the bookId to update its details ");
			int idUpdate = sc.nextInt(); 
			librarymodel.setUpdateId(idUpdate);
				
			libController.updateLibraryModel(librarymodel);
			
			System.out.println(" Use case 2 --- updating book data is completed ");
		
}
		
			public static void deleteDetails() {
				logger.info("deleting......");
			System.out.println("Enter the bookId to delete its details ");
			int id = sc.nextInt();
			librarymodel.setDeleteId(id);
			
			libController.deleteLibraryModel(librarymodel);
			
			System.out.println(" Use case 2 --- Deleting book data is completed ");
			
			}
			
			
			public static void showDetails() {
				
				logger.info("showing one details......");
				System.out.println("Enter the bookId to show its details ");
				int id = sc.nextInt();
				librarymodel.setShowId(id);
	
				libController.showLibraryModel(librarymodel);
				System.out.println();
				System.out.println();
	
				System.out.println(" Use case 4 --- show book data is completed ");
	
			}
			
			public static void showAllDetails() {
	
				logger.info("showing all details......");
				libController.showAllLibraryModel();
				System.out.println(" Use case 5 --- showing all book data is completed ");
}
}
