package com.always.you;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class User {
	private String name;
    private int money;
    private String memo;
  
}

