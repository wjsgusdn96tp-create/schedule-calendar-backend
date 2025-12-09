package kr.co.iei.schedule.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.iei.schedule.model.dto.ScheduleDTO;

@Mapper
public interface ScheduleDao {
	// 일정 등록
    int insertSchedule(ScheduleDTO schedule);
    // 일정 리스트
	List<ScheduleDTO> selectScheduleList();
	// 일정 수정
	int updateSchedule(ScheduleDTO scheduleDTO);
	// 일정 삭제
	int deleteSchedule(int scheduleNo);
}
