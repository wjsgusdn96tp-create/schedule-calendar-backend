package kr.co.iei.schedule.model.dto;

import java.sql.Date;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Alias (value = "schedule")
@Data
public class ScheduleDTO {
	private int scheduleNo;
	private String scheduleTitle;
	private String scheduleContent;
	private Date scheduleDate;
	private String startTime;
	private String endTime;
}
