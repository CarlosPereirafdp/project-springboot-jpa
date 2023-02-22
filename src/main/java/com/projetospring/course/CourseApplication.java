package com.projetospring.course;

import com.projetospring.course.testingclasses.A;
import com.projetospring.course.testingclasses.B;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);

	/*	List<A> aux2 = new ArrayList<>();
		List<A> list = new ArrayList<>();

	aux2 = m(list);


		System.out.println(list.get(0));
	*/
	}

/*	public static List<A> m(List<A> lista){
		A a = new B();
		a.setName("aa");
		lista.add(a);
		return lista;
	}
*/
}


