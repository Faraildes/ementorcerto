package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Teacher;

public class TeacherService {
	
	public List<Teacher> findAll() {
		List<Teacher> list = new ArrayList<>();
		list.add(new Teacher(1, "Maria", "12345678987", "987654123", 12000.00));
		list.add(new Teacher(2, "Marta", "98745612332", "965478123", 11000.00));
		list.add(new Teacher(3, "Mariana", "36985214723", "965478321", 10000.00));
		return list;
	}

}
