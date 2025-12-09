package kr.co.iei.schedule.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.iei.schedule.model.dto.ScheduleDTO;

@Mapper
public interface ScheduleDao {
	// 일정 등록
    int insertSchedule(ScheduleDTO schedule);
	List<ScheduleDTO> selectScheduleList();
	int updateSchedule(ScheduleDTO scheduleDTO);
	int deleteSchedule(int scheduleNo);
}
