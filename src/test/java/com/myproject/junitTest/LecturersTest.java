package com.myproject.junitTest;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;

import com.myproject.controller.LecturersController;
import com.myproject.controller.SchuleController;
import com.myproject.model.Lecturers;
import com.myproject.repository.SchuleRepository;
import com.myproject.repository.SubjectsRepository;
import com.myproject.service.SchuleService;
import com.myproject.service.SemesterService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class LecturersTest {

	@Autowired
	private LecturersController lecturersController;
	
	private Model model = new Model() {

		@Override
		public Model mergeAttributes(Map<String, ?> attributes) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object getAttribute(String attributeName) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean containsAttribute(String attributeName) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Map<String, Object> asMap() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Model addAttribute(String attributeName, Object attributeValue) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Model addAttribute(Object attributeValue) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Model addAllAttributes(Map<String, ?> attributes) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Model addAllAttributes(Collection<?> attributeValues) {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	//+)hi???n th??? t??n gi???ng vi??n ???ng v???i m?? ???? ch???n h???p l???
	@Test
	public void getNameGVTest() {
		Long id = (long) 1;	
		Optional<Lecturers> s = lecturersController.getNameLecturer(id, model);
		String nu = s.get().getName();
		assertEquals(nu,"Pham Quang");
		
	}
	//+)hi???n th??? t??n gi???ng vi??n ???ng v???i m?? ???? ch???n( m?? l?? s??? kh??ng t???n t???i)
	@Test
	public void getNameGVTest2() {
		Long id = (long) 300;	
		Optional<Lecturers> s = null;
		s = lecturersController.getNameLecturer(id, model);
		assertEquals(s,Optional.empty());
		
	}
	//+)hi???n th??? t??n gi???ng vi??n ???ng v???i m?? ???? ch???n( m?? l?? s??? kh??ng t???n t???i ko ph???i s???)=> b???t ngo???i l??? t??? client

	
}
