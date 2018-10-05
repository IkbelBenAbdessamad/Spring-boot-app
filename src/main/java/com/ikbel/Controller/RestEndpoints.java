package com.ikbel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author IkbelBenabdessamad on 05/10/2018
 *
 */
@RestController
public class RestEndpoints {
	@Value("${course.name}")
	private String cName;
	@Value("${course.chaptersCount}")
	private int chaptersCount;
	@Autowired
	private CourseConfiguration courseConfiguration;

	@RequestMapping("/course")
	public Course getEndpoint(
			@RequestParam(value = "name", defaultValue = "spring-boot-course", required = false) String name,
			@RequestParam(value = "chapterCount", defaultValue = "2", required = false) int chapterCount) {
		return new Course(name, chapterCount);
	}
	@RequestMapping("/default")
	public Course getDefaultCourse() {
		return new Course(cName,chaptersCount);
	}

	@RequestMapping(method=RequestMethod.POST,value="/register/course")
	public String savecourse(@RequestBody Course course) {
		return "Your course named => " + course.getName() + "  contains ==> " + course.getChapterCount() + "<== chapters";
	}
	@RequestMapping("/getCourseConfig")
	public Course getCourseConfig() {
		return new Course(cName,chaptersCount);
	}
	
	
	
	
}


