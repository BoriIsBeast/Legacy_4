package com.iu.s1.notice;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s1.MyJunitTest;
import com.iu.s1.util.Pager;

public class NoticeDAOTest extends MyJunitTest {

			@Autowired
			private NoticeDAO noticeDAO;
			
	//@Test
	public void check() {
		assertNotNull(noticeDAO);
	} 
	
	//list
	//@Test
	public void listTest() throws Exception {
		Pager pager = new Pager();
		pager.setPerPage(5L);
		
		pager.makeRow();
		
		
		List<NoticeDTO> ar = noticeDAO.list(pager);
		System.out.println(ar.get(0).getNum());
		System.out.println(ar.get(4).getNum());
				assertNotEquals(10, ar.size());
	}
	//detail
	//@Test
	public void detailTest() throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		 noticeDTO.setNum(2);
		noticeDTO = noticeDAO.detail(noticeDTO);
		System.out.println(noticeDTO.getTitle());
		System.out.println(noticeDTO.getNum());
		assertNotNull(noticeDTO);
	}
	//add
	//@Test
	public void addTest() throws Exception {
		
		for(int i = 0;i<200;i++) {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setTitle("Title"+i);
		noticeDTO.setContents("Contents"+i);
		noticeDTO.setWriter("Writer"+i);
		
		noticeDTO.setHit(0);
		
		int result= noticeDAO.add(noticeDTO);
		
		if(i%10==0) {
			Thread.sleep(1000);//1초동안 멈추세요
			}
		}
		System.out.println("Insert Finish");	
		
		
		
		
		//		noticeDTO.setTitle("t3");
//		noticeDTO.setContents("Contents3");
//		noticeDTO.setWriter("writer3");
//		noticeDTO.setHit(3);
//		int result = noticeDAO.add(noticeDTO);
//		assertEquals(1, result);
		
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
