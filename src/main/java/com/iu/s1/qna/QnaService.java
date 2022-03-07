package com.iu.s1.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s1.bankbook.BankBookDTO;
import com.iu.s1.util.Pager;

@Service
public class QnaService {

	@Autowired
	private QnaDAO qnaDAO;
	
	//update
		public int update(QnaDTO qnaDTO)throws Exception{
			
			return qnaDAO.update(qnaDTO);
		}
		
		//delete
		public int delete(QnaDTO qnaDTO)throws Exception{
			return qnaDAO.delete(qnaDTO);
			
		}
		
		//add
		public int add(QnaDTO qnaDTO)throws Exception{
			return qnaDAO.add(qnaDTO);
			
		}
		
		
		//detail
		public QnaDTO detail(QnaDTO qnaDTO)throws Exception{
			
			return qnaDAO.detail(qnaDTO);
			
			
		}
		
		
		//list
		public List<QnaDTO> list(Pager pager) throws Exception{
			
			//DAO메서드 호출 전 전처리 작업
			pager.makeRow();
			Long totalCount = qnaDAO.total(pager);
			pager.makeNum(totalCount);
			//호출 후 후처리 작업
			List<QnaDTO> ar = qnaDAO.list(pager);
			
			return ar;
			
			
			
			
		}
}
