package kr.co.iei.schedule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.iei.schedule.model.dto.ScheduleDTO;
import kr.co.iei.schedule.model.service.ScheduleService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "schedule")
public class ScheduleController {
	
	@Autowired
	private ScheduleService scheduleService;
	// 일정 등록
		@PostMapping(value = "/insert")
		public ResponseEntity<Integer> insertSchedule (@RequestBody ScheduleDTO schedule) {
			int result = scheduleService.insertSchedule(schedule);
			return ResponseEntity.ok(result);
		}
		// 일정 목록 조회
	@GetMapping(value = "/list")
	public List<ScheduleDTO> getScheduleList() {
		List<ScheduleDTO> list = scheduleService.selectScheduleList();
		return list;
	}
	
	@PatchMapping(value = "/update")
	public ResponseEntity<Integer> updateSchedule (@RequestBody ScheduleDTO scheduleDTO) {
	
		int result = scheduleService.updateSchedule(scheduleDTO);
		
		return ResponseEntity.ok(result);
	}
	@DeleteMapping("/delete/{scheduleNo}")
	public ResponseEntity<Integer> deleteSchedule (@PathVariable("scheduleNo") int scheduleNo) {
	
		
		int result = scheduleService.deleteSchedule(scheduleNo);
	
		return ResponseEntity.ok(result);
	}
}
