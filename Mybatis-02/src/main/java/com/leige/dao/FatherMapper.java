package com.leige.dao;

import com.leige.pojo.Father;

import java.util.List;

public interface FatherMapper {
    List<Father> getFather();
    Father get_Father(String fpd);
}
