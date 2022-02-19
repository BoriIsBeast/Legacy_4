package com.iu.s1.notice;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s1.MyJunitTest;

public class NoticeDAOTest extends MyJunitTest {

			@Autowired
			private NoticeDAO noticeDAO;
			
	//@Test
	public void check() {
		assertNotNull(noticeDAO);
	} 
	
	//list
	@Test
	public void listTest() throws Exception {
		List<NoticeDTO> ar = noticeDAO.list();
				assertNotEquals(0, ar.size());
	}
	//detail
	//@Test
	public void detailTest() throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		 noticeDTO.setNum(1);
		noticeDTO = noticeDAO.detail(noticeDTO);
		assertNotNull(noticeDTO);
	}
	//add
	//@Test
	public void addTest() throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setTitle("t3");
		noticeDTO.setContents("Contents3");
		noticeDTO.setWriter("writer3");
		noticeDTO.setHit(3);
		int result = noticeDAO.add(noticeDTO);
		assertEquals(1, result);
		
	}
	
	//delete
	//@Test
	public void deleteTest()throws Exception{
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNum(1);
		int result = noticeDAO.delete(noticeDTO);
		assertEquals(1, result);
	}
	
	
}
