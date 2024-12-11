package com.studentRegistration.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentMark {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String fullName;
	    private int unitTestMark;
	    private int termOralMark;
	    private int termWrittenMark;
	    private int totalMark;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		public int getUnitTestMark() {
			return unitTestMark;
		}
		public void setUnitTestMark(int unitTestMark) {
			this.unitTestMark = unitTestMark;
		}
		public int getTermOralMark() {
			return termOralMark;
		}
		public void setTermOralMark(int termOralMark) {
			this.termOralMark = termOralMark;
		}
		public int getTermWrittenMark() {
			return termWrittenMark;
		}
		public void setTermWrittenMark(int termWrittenMark) {
			this.termWrittenMark = termWrittenMark;
		}
		public int getTotalMark() {
			return totalMark;
		}
		public void setTotalMark(int totalMark) {
			this.totalMark = totalMark;
		}
		@Override
		public String toString() {
			return "StudentMark [id=" + id + ", fullName=" + fullName + ", unitTestMark=" + unitTestMark
					+ ", termOralMark=" + termOralMark + ", termWrittenMark=" + termWrittenMark + ", totalMark="
					+ totalMark + "]";
		}
		public StudentMark(Long id, String fullName, int unitTestMark, int termOralMark, int termWrittenMark,
				int totalMark) {
			super();
			this.id = id;
			this.fullName = fullName;
			this.unitTestMark = unitTestMark;
			this.termOralMark = termOralMark;
			this.termWrittenMark = termWrittenMark;
			this.totalMark = totalMark;
		}
	    
	    
}
