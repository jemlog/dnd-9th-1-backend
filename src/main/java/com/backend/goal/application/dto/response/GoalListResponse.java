package com.backend.goal.application.dto.response;

import com.backend.goal.domain.repository.GoalListResponseDto;

import java.util.List;

public record GoalListResponse(List<GoalListResponseDto> contents, Boolean next) {



}
