package com.example.demoproviderdept8001.service;

import com.example.demoapi.entities.Dept;

import java.util.List;


public interface DeptService
{
    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();
}