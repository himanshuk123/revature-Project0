package com.Himanshu.Library.model;


public class LibraryModel {
		
		private Integer bookId;
		private String bookName;
		private String bookAuthor;
		private String bookCategory;
		private	String	bookPrice;
		
		private String updateColumn;
		private Integer updateId;
		private String updateValue;
		
		
		private Integer deleteId;
		private Integer showId;


		public Integer getbookId() {
			return bookId;
		}

		public String getbookName() {
			return bookName;
		}

		public String getbookAuthor() {
			return bookAuthor;
		}

		public String getbookCategory() {
			return bookCategory;
		}

		public String getbookPrice() {
			return bookPrice;
		}

		public void setbookId(Integer bookId) {
			this.bookId = bookId;
		}

		public void setbookName(String bookName) {
			this.bookName = bookName;
		}

		public void setbookAuthor(String bookAuthor) {
			this.bookAuthor = bookAuthor;
		}

		public void setbookCategory(String bookCategory) {
			this.bookCategory = bookCategory;
		}
		
		public void setbookPrice(String bookPrice) {
			this.bookPrice = bookPrice;
		}
		
		

		public String getUpdateColumn() {
			return updateColumn;
		}
		public void setUpdateColumn(String updateColumn) {
			this.updateColumn = updateColumn;
		}
		public int getUpdateId() {
			return updateId;
		}
		public void setUpdateId(int updateId) {
			this.updateId = updateId;
		}
		
		public String getUpdateValue() {
			return updateValue;
		}
		public void setUpdateValue(String updateValue) {
			this.updateValue = updateValue;
		}
		
		
		public int getDeleteId() {
			return deleteId;
		}
		public void setDeleteId(int deleteId) {
			this.deleteId = deleteId;
		}
		public int getShowId() {
			return showId;
		}
		public void setShowId(int showId) {
			this.showId = showId;
		}
	
}
