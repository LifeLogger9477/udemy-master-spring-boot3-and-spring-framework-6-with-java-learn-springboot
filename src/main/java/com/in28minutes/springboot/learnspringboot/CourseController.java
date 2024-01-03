package com.in28minutes.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * author : ms.Lee
 * date   : 2024-01-03
 */
@RestController
public class CourseController {

  /**
   * http://localhost:8080/courses
   * course : id, name, author
   * return
   * [
   *  {
   *    "id": 1,
   *    "name": "Learn AWS",
   *    "author": "in28minutes"
   *  }
   * ]
   */
  @RequestMapping(value = "/courses")
  public List<Course> retrieveAllCourses() {

    return Arrays.asList(
        new Course(1, "Learn AWS", "in28minutes"),
        new Course(2, "Learn DevOps", "in28minutes")
        );
  }
}
