package com.backend.goal.domain;

import jakarta.persistence.Column;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.time.LocalDate;

public record GoalListResponseDto(
        Long goalId,
        String title,
        LocalDate startDate,
        LocalDate endDate,
        Integer entireDetailGoalCnt,
        Integer completedDetailGoalCnt,
        Long dDay
) {

    public static GoalListResponseDto from(Goal goal)
    {
        return new GoalListResponseDto(goal.getId(),goal.getTitle(),goal.getStartDate(),goal.getEndDate(), goal.getEntireDetailGoalCnt(), goal.getCompletedDetailGoalCnt(), goal.calculateDday(LocalDate.now()));
    }
}

