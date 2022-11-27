package com.example.esd.DriverClass;

import com.example.esd.Bean.Course;
import com.example.esd.Bean.CoursePrerequisite;
import com.example.esd.Bean.Department;
import com.example.esd.Bean.Employee;
import com.example.esd.DAO.CourseDAO;
import com.example.esd.DAO.CoursePrerequisiteDAO;
import com.example.esd.DAO.DepartmentDAO;
import com.example.esd.DAO.EmployeeDAO;
import com.example.esd.DAO.Implement.CourseDAOImpl;
import com.example.esd.DAO.Implement.CoursePrerequisiteDAOImpl;
import com.example.esd.DAO.Implement.DepartmentDAOImpl;
import com.example.esd.DAO.Implement.EmployeeDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application Started");
        runApplication();
        System.out.println("End");
    }

    private static void runaApplication(){
        System.out.println("-----------------------------------------------------------");

        CourseDAO courseDAO=new CourseDAOImpl();
//
//        List<Course> courseList=courseDAO.getCourseList();
//        if(courseList.size()>0){
//            for(Course course: courseList){
//                System.out.println(course);
//            }
//        }
//        else{
//            System.out.println("no courses :)");
//        }
//        System.out.println("--- \tFetched Course List ---");
//        System.out.println("-----------------------------------------------------------");
//
//        // update project name to AI_ML for project ID =1
//        int course_id= 1;
//        boolean res= courseDAO.updateCourseName(course_id,"ML");
//        if(res)
//            System.out.println("--- \tCourse name update successfully! to AI_ML ---");
//        else
//            System.out.println("can not update ");

        int course_id= 2;
        boolean res= courseDAO.deleteCourse(course_id);
        if(res)
            System.out.println("--- \tCourse deleted successfully!");
        else
            System.out.println("can not delete ");

        System.out.println("-----------------------------------------------------------");
    }
    private static void runApplication() {
        System.out.println("-----------------------------------------------------------");
        DepartmentDAO deptdao = new DepartmentDAOImpl();





        System.out.println("--- \tDepartment Added Successfully! ---");
        System.out.println("-----------------------------------------------------------");







//
//
////        empdao.addEmployee(emp1);
////        empdao.addEmployee(emp2);
////        empdao.addEmployee(emp3);
////        empdao.addEmployee(emp4);
////        empdao.addEmployee(emp5);
//        System.out.println("--- \tEmployee Added Successfully! ---");
//        System.out.println("-----------------------------------------------------------");

        //CourseDAO courseDAO = new CourseDAOImpl();



        //CoursePrerequisiteDAO preDAO = new CoursePrerequisiteDAOImpl();

        CoursePrerequisite cp1 = new CoursePrerequisite();
//        cp1.setCourseForID(c1);

        CoursePrerequisite cp2 = new CoursePrerequisite();
//        cp2.setCourseForID(c2);

        CoursePrerequisite cp3 = new CoursePrerequisite();
//        cp3.setCourseForID(c1);

        CoursePrerequisite cp4 = new CoursePrerequisite();
//        cp4.setCourseForID(c3);

        CoursePrerequisite cp5 = new CoursePrerequisite();
//        cp5.setCourseForID(c4);

        CoursePrerequisite cp6 = new CoursePrerequisite();
//        cp6.setCourseForID(c3);

        Course c1 = new Course();
        c1.setName("dfers");
        c1.setCapacity(1200);
        c1.setCourseCode(122312);
        c1.setCredits(22);
        c1.setDescription("asddrfasd");
        c1.setTerm(22);
        c1.setYear(20220);
//        c1.setFaculty(emp1);

        Course c2 = new Course();
        c2.setName("dghwenfs");
        c2.setCapacity(12600);
        c2.setCourseCode(122321312);
        c2.setCredits(223);
        c2.setDescription("aen2fgnsdfasd");
        c2.setTerm(222);
        c2.setYear(2042320);
//        c2.setFaculty(emp2);

        Course c3 = new Course();
        c3.setName("ddgnftys");
        c3.setCapacity(12500);
        c3.setCourseCode(25312312);
        c3.setCredits(225);
        c3.setDescription("hg5asdfasd");
        c3.setTerm(225);
        c3.setYear(2014520);
//        c3.setFaculty(emp1);

        Course c4 = new Course();
        c4.setName("g;ler,dfs");
        c4.setCapacity(21200);
        c4.setCourseCode(112632312);
        c4.setCredits(26123);
        c4.setDescription("a263sdfasd");
        c4.setTerm(23264);
        c4.setYear(20262340);
//        c4.setFaculty(emp3);



        System.out.println("--- \tCourse Added Successfully! ---");
        System.out.println("-----------------------------------------------------------");


        List<CoursePrerequisite> list=new ArrayList<>();

        list.add(cp1);
        list.add(cp3);
        c1.setCoursePrerequisiteListForID(list);

        list.clear();
        list.add(cp2);
        c2.setCoursePrerequisiteListForID(list);

        list.clear();
        list.add(cp4);
        list.add(cp6);
        c3.setCoursePrerequisiteListForID(list);

        list.clear();
        list.add(cp5);
        c4.setCoursePrerequisiteListForID(list);

        //add employees
        EmployeeDAO empdao = new EmployeeDAOImpl();
        Employee emp1 = new Employee();
        emp1.setFirstName("asdfasdn");
        emp1.setLastName("asdfagnsd");
        emp1.setEmail("asdfsdffghasdfx");
        emp1.setTitle("sderta");
        emp1.setPhotographPath("adkjblaertkjdgbhkd");
//        emp1.setDepartment(dept1);

        Employee emp2 = new Employee();
        emp2.setFirstName("afkljsdf");
        emp2.setLastName("asdhjkZXCfasd");
        emp2.setEmail("asdfsdfhjkqwerasdfx");
        emp2.setTitle("qwerhjksda");
        emp2.setPhotographPath("adqwehjkrkjblakjdgbhkd");
//        emp2.setDepartment(dept1);

        Employee emp3 = new Employee();
        emp3.setFirstName("zxchkasdf");
        emp3.setLastName("vbmasdhjkfasd");
        emp3.setEmail("jklasdfgksdfasdfx");
        emp3.setTitle("ZXgkCsda");
        emp3.setPhotographPath("dfSgkadkjblakjdgbhkd");
//        emp3.setDepartment(dept3);

        Employee emp4 = new Employee();
        emp4.setFirstName("64asyjdf");
        emp4.setLastName("435asdyjfasd");
        emp4.setEmail("353asdfsdyjfasdfx");
        emp4.setTitle("32sdyja");
        emp4.setPhotographPath("f6yj5asadkjblakjdgbhkd");
//        emp4.setDepartment(dept2);

        Employee emp5 = new Employee();
        emp5.setFirstName("aqaryuzsdf");
        emp5.setLastName("asdfrturtawfvsd");
        emp5.setEmail("dhgasdfsrtundfatengbsdfx");
        emp5.setTitle("ilsrnyuda");
        emp5.setPhotographPath("ergartyundkjblakjdgbhkd");
//        emp5.setDepartment(dept3);

        List<Course> list1=new ArrayList<>();

        list1.add(c1);
        list1.add(c3);
        emp1.setCourseList(list1);

        list1.clear();
        list1.add(c2);
        emp2.setCourseList(list1);

        list1.clear();
        list1.add(c4);
        emp3.setCourseList(list1);

        // add department
        Department dept1 = new Department();
        dept1.setDepartmentName("Engineersafing");
        dept1.setCapacity(1300);
//        deptdao.addDepartment(dept1);

        Department dept2 = new Department();
        dept2.setDepartmentName("HRe");
        dept2.setCapacity(730);
//        deptdao.addDepartment(dept2);

        Department dept3 = new Department();
        dept3.setDepartmentName("Saleass");
        dept3.setCapacity(1520);
//        deptdao.addDepartment(dept3);


        List<Employee> list2=new ArrayList<>();

        list2.add(emp1);
        list2.add(emp2);
        dept1.setEmployeeList(list2);

        list2.clear();
        list2.add(emp4);
        dept2.setEmployeeList(list2);

        list2.clear();
        list2.add(emp3);
        list2.add(emp5);
        dept3.setEmployeeList(list2);


//        courseDAO.addCourse(c1);
//        courseDAO.addCourse(c2);
//        courseDAO.addCourse(c3);
//        courseDAO.addCourse(c4);

//        preDAO.addCoursePrerequisite(cp1);
//        preDAO.addCoursePrerequisite(cp2);
//        preDAO.addCoursePrerequisite(cp3);
//        preDAO.addCoursePrerequisite(cp4);
//        preDAO.addCoursePrerequisite(cp5);
//        preDAO.addCoursePrerequisite(cp6);


        System.out.println("--- \tPrerequisite Added Successfully! ---");
        System.out.println("-----------------------------------------------------------");

        deptdao.addDepartment(dept1);
        deptdao.addDepartment(dept2);
        deptdao.addDepartment(dept3);


    }

    private static void runaAbpplication() {
        System.out.println("-----------------------------------------------------------");
        DepartmentDAO deptdao = new DepartmentDAOImpl();
        // add department
        Department dept1 = new Department();
        dept1.setDepartmentName("Engineersafing");
        dept1.setCapacity(1300);
        deptdao.addDepartment(dept1);

        Department dept2 = new Department();
        dept2.setDepartmentName("HRe");
        dept2.setCapacity(730);
        deptdao.addDepartment(dept2);

        Department dept3 = new Department();
        dept3.setDepartmentName("Saleass");
        dept3.setCapacity(1520);
        deptdao.addDepartment(dept3);


        System.out.println("--- \tDepartment Added Successfully! ---");
        System.out.println("-----------------------------------------------------------");


        //add employees
        EmployeeDAO empdao = new EmployeeDAOImpl();
        Employee emp1 = new Employee();
        emp1.setFirstName("asdf");
        emp1.setLastName("asdfasd");
        emp1.setEmail("asdfsdfasdfx");
        emp1.setTitle("sda");
        emp1.setPhotographPath("adkjblakjdgbhkd");
        emp1.setDepartment(dept1);

        Employee emp2 = new Employee();
        emp2.setFirstName("afsdf");
        emp2.setLastName("asdZXCfasd");
        emp2.setEmail("asdfsdfqwerasdfx");
        emp2.setTitle("qwersda");
        emp2.setPhotographPath("adqwerkjblakjdgbhkd");
        emp2.setDepartment(dept1);

        Employee emp3 = new Employee();
        emp3.setFirstName("zxcasdf");
        emp3.setLastName("vbmasdfasd");
        emp3.setEmail("jklasdfsdfasdfx");
        emp3.setTitle("ZXCsda");
        emp3.setPhotographPath("dfSadkjblakjdgbhkd");
        emp3.setDepartment(dept3);

        Employee emp4 = new Employee();
        emp4.setFirstName("64asdf");
        emp4.setLastName("435asdfasd");
        emp4.setEmail("353asdfsdfasdfx");
        emp4.setTitle("32sda");
        emp4.setPhotographPath("f65asadkjblakjdgbhkd");
        emp4.setDepartment(dept2);

        Employee emp5 = new Employee();
        emp5.setFirstName("aqazsdf");
        emp5.setLastName("asdfawfvsd");
        emp5.setEmail("dhgasdfsdfatengbsdfx");
        emp5.setTitle("ilsda");
        emp5.setPhotographPath("ergadkjblakjdgbhkd");
        emp5.setDepartment(dept3);


        empdao.addEmployee(emp1);
        empdao.addEmployee(emp2);
        empdao.addEmployee(emp3);
        empdao.addEmployee(emp4);
        empdao.addEmployee(emp5);
        System.out.println("--- \tEmployee Added Successfully! ---");
        System.out.println("-----------------------------------------------------------");

        CourseDAO courseDAO = new CourseDAOImpl();

        Course c1 = new Course();
        c1.setName("dfs");
        c1.setCapacity(100);
        c1.setCourseCode(12312);
        c1.setCredits(2);
        c1.setDescription("asdfasd");
        c1.setTerm(2);
        c1.setYear(2020);
        c1.setFaculty(emp1);

        Course c2 = new Course();
        c2.setName("dghnfs");
        c2.setCapacity(1600);
        c2.setCourseCode(12321312);
        c2.setCredits(23);
        c2.setDescription("aenfgnsdfasd");
        c2.setTerm(22);
        c2.setYear(204320);
        c2.setFaculty(emp2);

        Course c3 = new Course();
        c3.setName("ddgnfs");
        c3.setCapacity(1200);
        c3.setCourseCode(2312312);
        c3.setCredits(22);
        c3.setDescription("hgasdfasd");
        c3.setTerm(22);
        c3.setYear(201420);
        c3.setFaculty(emp1);

        Course c4 = new Course();
        c4.setName("g;l,dfs");
        c4.setCapacity(2100);
        c4.setCourseCode(11232312);
        c4.setCredits(2123);
        c4.setDescription("a23sdfasd");
        c4.setTerm(2324);
        c4.setYear(2022340);
        c4.setFaculty(emp3);

        courseDAO.addCourse(c1);
        courseDAO.addCourse(c2);
        courseDAO.addCourse(c3);
        courseDAO.addCourse(c4);

        System.out.println("--- \tCourse Added Successfully! ---");
        System.out.println("-----------------------------------------------------------");


        CoursePrerequisiteDAO preDAO = new CoursePrerequisiteDAOImpl();

        CoursePrerequisite cp1 = new CoursePrerequisite();
        cp1.setCourseForID(c1);

        CoursePrerequisite cp2 = new CoursePrerequisite();
        cp2.setCourseForID(c2);

        CoursePrerequisite cp3 = new CoursePrerequisite();
        cp3.setCourseForID(c1);

        CoursePrerequisite cp4 = new CoursePrerequisite();
        cp4.setCourseForID(c3);

        CoursePrerequisite cp5 = new CoursePrerequisite();
        cp5.setCourseForID(c4);

        CoursePrerequisite cp6 = new CoursePrerequisite();
        cp6.setCourseForID(c3);

        preDAO.addCoursePrerequisite(cp1);
        preDAO.addCoursePrerequisite(cp2);
        preDAO.addCoursePrerequisite(cp3);
        preDAO.addCoursePrerequisite(cp4);
        preDAO.addCoursePrerequisite(cp5);
        preDAO.addCoursePrerequisite(cp6);


        System.out.println("--- \tPrerequisite Added Successfully! ---");
        System.out.println("-----------------------------------------------------------");


    }
}
