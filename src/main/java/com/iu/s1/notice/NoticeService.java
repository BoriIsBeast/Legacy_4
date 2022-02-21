package com.iu.s1.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class NoticeService {
		@Autowired
		private NoticeDAO noticeDAO;
		
		//add
		public int add(NoticeDTO noticeDTO)throws Exception{
			return noticeDAO.add(noticeDTO);
			}
		
		public int delete(NoticeDTO noticeDTO)throws Exception{
			
			return noticeDAO.delete(noticeDTO);
		}
		
		
		//list
		public List<NoticeDTO>list()throws Exception{
			List<NoticeDTO> ar = noticeDAO.list();
			
			return ar;
		}
		
			//detail
			public NoticeDTO detail(NoticeDTO noticeDTO)throws Exception{
				
				return noticeDAO.detail(noticeDTO);
			}

			
}	

