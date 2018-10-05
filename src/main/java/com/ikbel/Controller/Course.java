package com.ikbel.Controller;

/**
 * @author IkbelBenabdessamad on 05/10/2018
 *
 */
public class Course {

	private String name;
	private int chapterCount;

	//The  default  constructor  
	public Course() {

	}

	public Course(String name, int chapterCount) {
		this.name = name;
		this.chapterCount = chapterCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChapterCount() {
		return chapterCount;
	}

	public void setChapterCount(int chapterCount) {
		this.chapterCount = chapterCount;
	}

}
