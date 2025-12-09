package kr.co.iei.schedule.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.iei.schedule.model.dao.ScheduleDao;
import kr.co.iei.schedule.model.dto.ScheduleDTO;

@Service
public class ScheduleService {
	@Autowired
	private ScheduleDao scheduleDao;
		// 일정 등록
		@Transactional
		public int insertSchedule(ScheduleDTO schedule) {
			int result = scheduleDao.insertSchedule(schedule);
			return result;
		}
		// 일정 목록 조회
		public List<ScheduleDTO> selectScheduleList() {
			List<ScheduleDTO> list = scheduleDao.selectScheduleList();
			return list;
		}
		//일정 수정
		@Transactional
		public int updateSchedule(ScheduleDTO scheduleDTO) {
			int result = scheduleDao.updateSchedule(scheduleDTO);
			return result;
		}
		//일정 삭제
		@Transactional
		public int deleteSchedule(int scheduleNo) {
			int result = scheduleDao.deleteSchedule(scheduleNo);
			return result;
		}
}
