package com.backend.detailgoal.application.dto.response;

import com.backend.detailgoal.domain.DetailGoal;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public record DetailGoalResponse(
        Long detailGoalId,

        String title,

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm", timezone = "Asia/Seoul")
        LocalTime alarmTime,
        List<DayOfWeek> alarmDays,
        Boolean alarmEnabled
)

{
    public static DetailGoalResponse from(DetailGoal detailGoal)
    {
        return new DetailGoalResponse(
                detailGoal.getId(),
                detailGoal.getTitle(),
                detailGoal.getAlarmTime(),
                detailGoal.getAlarmDays(),
                detailGoal.getAlarmEnabled()
        );
    }
}
