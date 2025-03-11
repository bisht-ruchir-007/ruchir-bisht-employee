package com.app.interview.dto;

public class EmployeeAddressDTO {
    private final Long id;
    private final String name;
    private final Long addressId;
    private final String city;
    private final String state;
    private final int priority;

    public EmployeeAddressDTO(Long id, String name, Long addressId, String city, String state, int priority) {
        this.id = id;
        this.name = name;
        this.addressId = addressId;
        this.city = city;
        this.state = state;
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getAddressId() {
        return addressId;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getPriority() {
        return priority;
    }
}

