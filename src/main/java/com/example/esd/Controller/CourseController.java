package com.example.esd.Controller;

import com.example.esd.Bean.Course;
import com.example.esd.DAO.CourseDAO;
import com.example.esd.DAO.Implement.CourseDAOImpl;
import com.example.esd_project2.HelloApplication;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/course")
public class CourseController extends HelloApplication {
    CourseDAO courseDAO=new CourseDAOImpl();

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response add_course(Course courseObj){
        System.out.printf(String.valueOf(courseObj));

        if(courseDAO.addCourse(courseObj)){
            return Response.status(200).entity("Success").build();
        }

        return Response.status(400).entity("Failure while adding department").build();
    }
}
