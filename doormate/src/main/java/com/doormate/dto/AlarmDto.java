package com.doormate.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AlarmDto {
    private String userName;
    private LocalDateTime checkoutTime;
}
