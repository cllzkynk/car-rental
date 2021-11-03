package com.backend.carrental.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FileDAO {

    private String name;
    private String url;
    private String type;
    private long size;
}
