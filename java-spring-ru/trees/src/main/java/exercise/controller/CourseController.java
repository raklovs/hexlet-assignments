package exercise.controller;

import exercise.model.Course;
import exercise.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping(path = "")
    public Iterable<Course> getCorses() {
        return courseRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Course getCourse(@PathVariable long id) {
        return courseRepository.findById(id);
    }

    // BEGIN
    @GetMapping(path = "/{id}/previous")
    public Iterable<Course> getCourseParents(@PathVariable long id) {
        Course course = courseRepository.findById(id);
        String path = course.getPath();
        List<Long> ids = getIds(path);

        return courseRepository.findAllById(ids);
    }

    private List<Long> getIds(String path) {
        if (path == null) {
            return List.of();
        }

        String[] ids = path.split("\\.");
        return Arrays.stream(ids)
                .map(s -> Long.parseLong(s))
                .collect(Collectors.toList());

    }
    // END

}
