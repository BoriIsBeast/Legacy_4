package com.iu.s1.qna;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s1.MyJunitTest;
import com.iu.s1.notice.NoticeDTO;

public class QnaDAOTest extends MyJunitTest {

	@Autowired
	private QnaDAO qnaDAO;
	
	@Test
		public void addTest() throws Exception {
			
			for(int i = 0;i<200;i++) {
			QnaDTO qnaDTO = new QnaDTO();
			qnaDTO.setTitle("Title"+i);
			qnaDTO.setContents("Contents"+i);
			qnaDTO.setWriter("Writer"+i);
			
			qnaDTO.setHit(0);
			qnaDTO.setRef(0);
			qnaDTO.setStep(0);
			qnaDTO.setDepth(0);
			
			int result= qnaDAO.add(qnaDTO);
			
			if(i%10==0) {
				Thread.sleep(1000);//1초동안 멈추세요
				}
			}
			System.out.println("Insert Finish");	
			
		}

}
